package srl.anagrafica.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import srl.anagrafica.model.Progetto;
import srl.anagrafica.openapi.model.ProgettoDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-03T22:53:29+0100",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220802-0458, environment: Java 17.0.4.1 (Eclipse Adoptium)"
)
@Component
public class ProgettoMapperImpl implements ProgettoMapper {

    @Override
    public ProgettoDTO progettoToProgettoDTO(Progetto p) {
        if ( p == null ) {
            return null;
        }

        ProgettoDTO progettoDTO = new ProgettoDTO();

        progettoDTO.setListaLavoratori( longListToIntegerList( p.getListaLavoratori() ) );
        if ( p.getDataInizio() != null ) {
            progettoDTO.setDataInizio( DateTimeFormatter.ISO_LOCAL_DATE.format( p.getDataInizio() ) );
        }
        if ( p.getDataFine() != null ) {
            progettoDTO.setDataFine( DateTimeFormatter.ISO_LOCAL_DATE.format( p.getDataFine() ) );
        }
        progettoDTO.setBudget( (float) p.getBudget() );

        return progettoDTO;
    }

    @Override
    public Progetto progettoDTOToProgetto(ProgettoDTO p) {
        if ( p == null ) {
            return null;
        }

        Progetto progetto = new Progetto();

        if ( p.getBudget() != null ) {
            progetto.setBudget( p.getBudget() );
        }
        if ( p.getDataFine() != null ) {
            progetto.setDataFine( LocalDate.parse( p.getDataFine() ) );
        }
        if ( p.getDataInizio() != null ) {
            progetto.setDataInizio( LocalDate.parse( p.getDataInizio() ) );
        }
        progetto.setListaLavoratori( integerListToLongList( p.getListaLavoratori() ) );

        return progetto;
    }

    @Override
    public List<ProgettoDTO> personaToPersonaDTO(List<Progetto> p) {
        if ( p == null ) {
            return null;
        }

        List<ProgettoDTO> list = new ArrayList<ProgettoDTO>( p.size() );
        for ( Progetto progetto : p ) {
            list.add( progettoToProgettoDTO( progetto ) );
        }

        return list;
    }

    protected List<Integer> longListToIntegerList(List<Long> list) {
        if ( list == null ) {
            return null;
        }

        List<Integer> list1 = new ArrayList<Integer>( list.size() );
        for ( Long long1 : list ) {
            list1.add( long1.intValue() );
        }

        return list1;
    }

    protected List<Long> integerListToLongList(List<Integer> list) {
        if ( list == null ) {
            return null;
        }

        List<Long> list1 = new ArrayList<Long>( list.size() );
        for ( Integer integer : list ) {
            list1.add( integer.longValue() );
        }

        return list1;
    }
}
