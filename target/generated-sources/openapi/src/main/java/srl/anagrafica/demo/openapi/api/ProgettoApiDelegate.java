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
 * A delegate to be called by the {@link ProgettoApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-15T15:09:32.274434100+01:00[Europe/Paris]")
public interface ProgettoApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /progetto
     * Aggiunge progetto nel db
     *
     * @param progettoDTO crea prima il body per inserire nel db (required)
     * @return Progetto aggiunto (status code 200)
     *         or Input non valido (status code 401)
     * @see ProgettoApi#aggiungiProgetto
     */
    default ResponseEntity<ProgettoDTO> aggiungiProgetto(ProgettoDTO progettoDTO) {
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
     * PUT /progetto/associa/{id}/{id2} : Modifica un progetto
     * Modifica un progetto ricevendo un id
     *
     * @param id ID del progetto (required)
     * @param id2 ID del Lavoratore (required)
     * @param progettoDTO Aggiorna il progetto (required)
     * @return Modifica riuscita (status code 200)
     *         or Progetto not found (status code 401)
     * @see ProgettoApi#associaProgettoLavoratore
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
     * DELETE /progetto/{id} : Cancella una persona
     * Cancella una persona ricevando l&#39;id
     *
     * @param id ID del progetto da cancellare (required)
     * @return Progetto Cancellato (status code 200)
     *         or Progetto non trovato (status code 401)
     * @see ProgettoApi#cancellaProgettoId
     */
    default ResponseEntity<String> cancellaProgettoId(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /progetto
     * Ritorna tutti i progetti
     *
     * @return operazione riuscita (status code 200)
     *         or errore (status code 401)
     * @see ProgettoApi#cercaTutti
     */
    default ResponseEntity<List<ProgettoDTO>> cercaTutti() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /progetto/{id} : Modifica un progetto
     * Modifica un progetto ricevendo un id
     *
     * @param id ID del progetto (required)
     * @param progettoDTO Aggiorna il progetto (required)
     * @return Modifica riuscita (status code 200)
     *         or Persona not found (status code 401)
     * @see ProgettoApi#modificaProgettoId
     */
    default ResponseEntity<ProgettoDTO> modificaProgettoId(Long id,
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
     * DELETE /progetto/associa/{id}/{id2} : Modifica un progetto
     * Modifica un progetto ricevendo un id
     *
     * @param id ID del progetto (required)
     * @param id2 ID del Lavoratore (required)
     * @return Rimozione riuscita (status code 200)
     *         or Progetto not found (status code 401)
     * @see ProgettoApi#rimoviProgettoLavoratore
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
