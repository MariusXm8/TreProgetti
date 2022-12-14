package srl.anagrafica2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import srl.anagrafica.demo.openapi.api.AssociaApiDelegate;
import srl.anagrafica.demo.openapi.api.ProgettoApiDelegate;
import srl.anagrafica.demo.openapi.model.ProgettoDTO;
import srl.anagrafica2.repository.ProgettoRepository;

@Service
public class ProgettoService implements ProgettoApiDelegate,AssociaApiDelegate{
	
	private final ProgettoRepository repo;
	
	
	@Override
	public ResponseEntity<List<ProgettoDTO>> cercaTutti() {
		// TODO Auto-generated method stub
		return ProgettoApiDelegate.super.cercaTutti();
	}
	@Override
	public ResponseEntity<ProgettoDTO> aggiungiProgetto(ProgettoDTO progettoDTO) {
		// TODO Auto-generated method stub
		return ProgettoApiDelegate.super.aggiungiProgetto(progettoDTO);
	}
	@Override
	public ResponseEntity<ProgettoDTO> modificaProgettoId(Long id, ProgettoDTO progettoDTO) {
		// TODO Auto-generated method stub
		return ProgettoApiDelegate.super.modificaProgettoId(id, progettoDTO);
	}
	
	@Override
	public ResponseEntity<String> cancellaProgettoId(Long id) {
		// TODO Auto-generated method stub
		return ProgettoApiDelegate.super.cancellaProgettoId(id);
	}
	
	@Override
	public ResponseEntity<ProgettoDTO> associaProgettoLavoratore(Long id, Long id2, ProgettoDTO progettoDTO) {
		// TODO Auto-generated method stub
		return AssociaApiDelegate.super.associaProgettoLavoratore(id, id2, progettoDTO);
	}
	
	@Override
	public ResponseEntity<ProgettoDTO> rimoviProgettoLavoratore(Long id, Long id2) {
		// TODO Auto-generated method stub
		return AssociaApiDelegate.super.rimoviProgettoLavoratore(id, id2);
	}
	
	//da errore se viene cancellato
	@Override
	public Optional<NativeWebRequest> getRequest() {
		// TODO Auto-generated method stub
		return AssociaApiDelegate.super.getRequest();
	}
	
	
	
	
	
	

}
