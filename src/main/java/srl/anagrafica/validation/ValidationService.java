package srl.anagrafica.validation;


import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import srl.anagrafica.openapi.model.ProgettoDTO;


@Service
@RequiredArgsConstructor
public class ValidationService {
	
	@Getter
	private String message = "";
	
//	private boolean verStringa(String stringa) {
//		return Pattern.matches(Costants.VER_STRINGA, stringa);
//	}

	public boolean validaDati(ProgettoDTO progettoDTO) {
		
//		message = "";
//
//		if (!verStringa(progettoDTO.getDataInizio())) {
//			message += " Errore nella formattazione del nome.";
//		}
//		if (!verStringa(progettoDTO.getDataFine())) {
//			message += " Errore nella formattazione del cognome.";
//		}
//		if (!verStringa(progettoDTO.getBudget())) {
//			message += " Errore data di nascita.";
//		}
		return true;
	}

	public boolean associato(Long idLavoratore) {
		return true;
	}


}
