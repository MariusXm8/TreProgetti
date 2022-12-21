package srl.anagrafica.demo.openapi.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-21T17:27:01.592419300+01:00[Europe/Paris]")
@Controller
@RequestMapping("${openapi.gestioneProgetto.base-path:}")
public class ProgettoApiController implements ProgettoApi {

    private final ProgettoApiDelegate delegate;

    public ProgettoApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ProgettoApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ProgettoApiDelegate() {});
    }

    @Override
    public ProgettoApiDelegate getDelegate() {
        return delegate;
    }

}
