package srl.anagrafica2.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import srl.anagrafica.demo.openapi.model.ProgettoDTO;
import srl.anagrafica2.model.Progetto;

@Mapper(componentModel = "spring", uses = { ProgettoMapper.class })
public interface ProgettoMapper {
	/*
	 * Essendo che devo mapper gli oggeti in entrato o uscita, m
	 */
	ProgettoMapper INSTANCE = Mappers.getMapper(ProgettoMapper.class);

	ProgettoDTO progettoToProgettoDTO(Progetto p);// converto il progetto in progettoDTO
	Progetto progettoDTOToProgetto(ProgettoDTO p);

	List<ProgettoDTO> personaToPersonaDTO(List<Progetto> p);
}
