package srl.anagrafica.demo.openapi.api;

import srl.anagrafica.demo.openapi.model.ProgettoDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link AssociaApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-14T17:27:51.223137400+01:00[Europe/Paris]")
public interface AssociaApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * PUT /associa/{id}/{id2} : Modifica un progetto
     * Modifica un progetto ricevendo un id
     *
     * @param id ID del progetto (required)
     * @param id2 ID del Lavoratore (required)
     * @param progettoDTO Aggiorna il progetto (required)
     * @return Modifica riuscita (status code 200)
     *         or Progetto not found (status code 401)
     * @see AssociaApi#associaProgettoLavoratore
     */
    default ResponseEntity<ProgettoDTO> associaProgettoLavoratore(Long id,
        Long id2,
        ProgettoDTO progettoDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataInizio\" : \"2011-12-03\", \"listaLavoratori\" : [ 1, 2, 3 ], \"dataFine\" : \"2011-12-03\", \"budget\" : 500.0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /associa/{id}/{id2} : Modifica un progetto
     * Modifica un progetto ricevendo un id
     *
     * @param id ID del progetto (required)
     * @param id2 ID del Lavoratore (required)
     * @return Rimozione riuscita (status code 200)
     *         or Progetto not found (status code 401)
     * @see AssociaApi#rimoviProgettoLavoratore
     */
    default ResponseEntity<ProgettoDTO> rimoviProgettoLavoratore(Long id,
        Long id2) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dataInizio\" : \"2011-12-03\", \"listaLavoratori\" : [ 1, 2, 3 ], \"dataFine\" : \"2011-12-03\", \"budget\" : 500.0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
