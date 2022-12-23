package srl.anagrafica.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import srl.anagrafica.model.Progetto;
import srl.anagrafica.openapi.model.ProgettoDTO;

@Mapper(componentModel = "spring", uses = { ProgettoMapper.class })

public interface ProgettoMapper {
	/*
	 * Essendo che devo mapper gli oggeti in entrato o uscita, m
	 */
	
	
	ProgettoDTO progettoToProgettoDTO(Progetto p);
	
	Progetto progettoDTOToProgetto(ProgettoDTO p);// converto il progetto in progettoDTO

	List<ProgettoDTO> personaToPersonaDTO(List<Progetto> p);
}
