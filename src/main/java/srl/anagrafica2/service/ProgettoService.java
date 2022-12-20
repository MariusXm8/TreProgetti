package srl.anagrafica2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import srl.anagrafica.demo.openapi.api.ProgettoApiDelegate;
import srl.anagrafica.demo.openapi.model.ProgettoDTO;

import srl.anagrafica2.mapper.ProgettoMapper;
import srl.anagrafica2.model.Progetto;

import srl.anagrafica2.repository.ProgettoRepository;
import srl.anagrafica2.validation.ValidationService;

@Service
public class ProgettoService implements ProgettoApiDelegate {

	private ProgettoRepository repo;
	private ProgettoMapper pm;
	private ValidationService vs;

	// ------------------------------------------GET
	@Override
	public ResponseEntity<List<ProgettoDTO>> cercaTutti() {

		return ResponseEntity.ok(pm.INSTANCE.personaToPersonaDTO(repo.findAll()));
	}

	// ------------------------------------------POST
	@Override
	public ResponseEntity<ProgettoDTO> aggiungiProgetto(ProgettoDTO progettoDTO) {
		if (!vs.validaDati(progettoDTO)) {
			return ResponseEntity.notFound().build();
		}
		Progetto p = pm.progettoDTOToProgetto(progettoDTO);
		repo.save(p);
		ProgettoDTO pDTO = pm.progettoToProgettoDTO(p);
		return ResponseEntity.ok(pDTO);

	}

	// ------------------------------------------DELETE
	@Override
	public ResponseEntity<String> cancellaProgettoId(Long id) {
		Optional<Progetto> op = repo.findById(id);
		if (op.isPresent()) {
			repo.deleteById(id);
			return ResponseEntity.ok("Progetto Cancellato!");
		}
		return ResponseEntity.notFound().build();// In teoria devo ritornare gli errori
	}

	// ------------------------------------------PUT
	@Override
	public ResponseEntity<ProgettoDTO> modificaProgettoId(Long id, ProgettoDTO progettoDTO) {
		Optional<Progetto> op = repo.findById(id);
		if (op.isPresent()) {
			if (vs.validaDati(progettoDTO)) {
				// Quando i dati sono giusti va a modificare il progetto
				Progetto p = pm.progettoDTOToProgetto(progettoDTO);
				repo.save(p);
				p.setId(id);
				return ResponseEntity.ok(pm.progettoToProgettoDTO(p));
			} else {
				return ResponseEntity.notFound().build();

			}
		}
		return ResponseEntity.notFound().build();// In teoria devo ritornare gli errori

	}
	// ------------------------------------------PUT ASOCCIA
	@Override
	public ResponseEntity<ProgettoDTO> associaProgettoLavoratore(Long idProgetto, Long idLavoratore, ProgettoDTO progettoDTO) {
		Optional<Progetto> op = repo.findById(idProgetto);
		if (!op.isPresent()&& vs.associato(idLavoratore)) {
			return ResponseEntity.notFound().build();
		}
		else {
			//se Il progetto è presente
			Progetto p=pm.progettoDTOToProgetto(progettoDTO);						
			p.getListaLavoratori().add(idLavoratore);	
			return ResponseEntity.ok(pm.progettoToProgettoDTO(p));
			}
		
	}
	// ------------------------------------------DELETE ASOCCIA
	@Override
	public ResponseEntity<String> rimoviProgettoLavoratore(Long idProgetto, Long idLavoratore) {
		Optional<Progetto> op = repo.findById(idProgetto);
		if (!op.isPresent()&& !vs.associato(idLavoratore)) {
			return ResponseEntity.notFound().build();
		}
		else {
			Progetto p= op.get();
			List aiuto=p.getListaLavoratori();
			aiuto.remove(idLavoratore);
			p.setListaLavoratori(aiuto);
			return ResponseEntity.ok("Rimozione del Lavoratore Completata!");
		}
		
	}
	
	
}









