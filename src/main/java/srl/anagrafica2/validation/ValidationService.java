package srl.anagrafica2.validation;

import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import srl.anagrafica.demo.openapi.model.ProgettoDTO;
import srl.anagrafica2.utility.Costants;


@Service
@RequiredArgsConstructor
public class ValidationService {
	
	private boolean verStringa(String stringa) {
		return Pattern.matches(Costants.VER_STRINGA, stringa);
	}

	public boolean validaDati(ProgettoDTO progettoDTO) {
		
		
		
		
		return false;
	}

	public boolean associato(Long idLavoratore) {
		return false;
	}


}
