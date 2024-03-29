/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package srl.anagrafica.openapi.api;

import srl.anagrafica.openapi.model.ProgettoDTO;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-23T18:17:24.714672900+01:00[Europe/Paris]")
@Validated
@Api(value = "progetto", description = "the progetto API")
public interface ProgettoApi {

    default ProgettoApiDelegate getDelegate() {
        return new ProgettoApiDelegate() {};
    }

    /**
     * POST /progetto
     * Aggiunge progetto nel db
     *
     * @param progettoDTO crea prima il body per inserire nel db (required)
     * @return Progetto aggiunto (status code 200)
     *         or Input non valido (status code 401)
     */
    @ApiOperation(value = "", nickname = "aggiungiProgetto", notes = "Aggiunge progetto nel db", response = ProgettoDTO.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Progetto aggiunto", response = ProgettoDTO.class),
        @ApiResponse(code = 401, message = "Input non valido") })
    @PostMapping(
        value = "/progetto",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ProgettoDTO> aggiungiProgetto(@ApiParam(value = "crea prima il body per inserire nel db" ,required=true )  @Valid @RequestBody ProgettoDTO progettoDTO) {
        return getDelegate().aggiungiProgetto(progettoDTO);
    }


    /**
     * POST /progetto/associa/{idProgetto}/{idLavoratore} : Associa il lavoratore con il progetto
     * Associa un lavoratore al progetto
     *
     * @param idProgetto ID del progetto (required)
     * @param idLavoratore ID del Lavoratore (required)
     * @return Associazione riuscita (status code 201)
     *         or Progetto not found (status code 401)
     */
    @ApiOperation(value = "Associa il lavoratore con il progetto", nickname = "associaProgettoLavoratore", notes = "Associa un lavoratore al progetto", response = ProgettoDTO.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Associazione riuscita", response = ProgettoDTO.class),
        @ApiResponse(code = 401, message = "Progetto not found") })
    @PostMapping(
        value = "/progetto/associa/{idProgetto}/{idLavoratore}",
        produces = { "application/json" }
    )
    default ResponseEntity<ProgettoDTO> associaProgettoLavoratore(@ApiParam(value = "ID del progetto",required=true) @PathVariable("idProgetto") Long idProgetto,@ApiParam(value = "ID del Lavoratore",required=true) @PathVariable("idLavoratore") Long idLavoratore) {
        return getDelegate().associaProgettoLavoratore(idProgetto, idLavoratore);
    }


    /**
     * DELETE /progetto/{id} : Cancella una persona
     * Cancella una persona ricevando l&#39;id
     *
     * @param id ID del progetto da cancellare (required)
     * @return Progetto Cancellato (status code 201)
     *         or Progetto non trovato (status code 401)
     */
    @ApiOperation(value = "Cancella una persona", nickname = "cancellaProgettoId", notes = "Cancella una persona ricevando l'id", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Progetto Cancellato", response = String.class),
        @ApiResponse(code = 401, message = "Progetto non trovato") })
    @DeleteMapping(
        value = "/progetto/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<String> cancellaProgettoId(@ApiParam(value = "ID del progetto da cancellare",required=true) @PathVariable("id") Long id) {
        return getDelegate().cancellaProgettoId(id);
    }


    /**
     * GET /progetto
     * Ritorna tutti i progetti
     *
     * @return operazione riuscita (status code 200)
     *         or errore (status code 401)
     */
    @ApiOperation(value = "", nickname = "cercaTutti", notes = "Ritorna tutti i progetti", response = ProgettoDTO.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "operazione riuscita", response = ProgettoDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "errore") })
    @GetMapping(
        value = "/progetto",
        produces = { "application/json" }
    )
    default ResponseEntity<List<ProgettoDTO>> cercaTutti() {
        return getDelegate().cercaTutti();
    }


    /**
     * PUT /progetto/{id} : Modifica un progetto
     * Modifica un progetto ricevendo un id
     *
     * @param id ID del progetto (required)
     * @param progettoDTO Aggiorna il progetto (required)
     * @return Modifica riuscita (status code 200)
     *         or Persona not found (status code 401)
     */
    @ApiOperation(value = "Modifica un progetto", nickname = "modificaProgettoId", notes = "Modifica un progetto ricevendo un id", response = ProgettoDTO.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Modifica riuscita", response = ProgettoDTO.class),
        @ApiResponse(code = 401, message = "Persona not found") })
    @PutMapping(
        value = "/progetto/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ProgettoDTO> modificaProgettoId(@ApiParam(value = "ID del progetto",required=true) @PathVariable("id") Long id,@ApiParam(value = "Aggiorna il progetto" ,required=true )  @Valid @RequestBody ProgettoDTO progettoDTO) {
        return getDelegate().modificaProgettoId(id, progettoDTO);
    }


    /**
     * DELETE /progetto/associa/{idProgetto}/{idLavoratore} : Rimovi un lavoratore associato
     * Rimuove il lavoratore associato
     *
     * @param idProgetto ID del progetto (required)
     * @param idLavoratore ID del Lavoratore (required)
     * @return Rimozione riuscita (status code 201)
     *         or Progetto not found (status code 401)
     */
    @ApiOperation(value = "Rimovi un lavoratore associato", nickname = "rimoviProgettoLavoratore", notes = "Rimuove il lavoratore associato", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Rimozione riuscita", response = String.class),
        @ApiResponse(code = 401, message = "Progetto not found") })
    @DeleteMapping(
        value = "/progetto/associa/{idProgetto}/{idLavoratore}",
        produces = { "application/json" }
    )
    default ResponseEntity<String> rimoviProgettoLavoratore(@ApiParam(value = "ID del progetto",required=true) @PathVariable("idProgetto") Long idProgetto,@ApiParam(value = "ID del Lavoratore",required=true) @PathVariable("idLavoratore") Long idLavoratore) {
        return getDelegate().rimoviProgettoLavoratore(idProgetto, idLavoratore);
    }

}
