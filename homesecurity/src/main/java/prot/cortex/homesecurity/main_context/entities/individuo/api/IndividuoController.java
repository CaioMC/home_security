package prot.cortex.homesecurity.main_context.entities.individuo.api;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prot.cortex.homesecurity.main_context.entities.individuo.domain.Individuo;
import prot.cortex.homesecurity.main_context.entities.individuo.domain.IndividuoService;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/v1/individuo", produces = { MediaType.APPLICATION_JSON_VALUE })
public class IndividuoController {

    private final IndividuoService individuoService;

    @PostMapping
    public void registrarCarro(@RequestBody Individuo individuo) {
        individuoService.registrarIndividuo(individuo);
    }

}
