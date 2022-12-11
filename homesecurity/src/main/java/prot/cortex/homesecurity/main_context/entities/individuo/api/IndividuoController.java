package prot.cortex.homesecurity.main_context.entities.individuo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prot.cortex.homesecurity.main_context.entities.individuo.domain.Individuo;
import prot.cortex.homesecurity.main_context.entities.individuo.domain.IndividuoService;

@RestController
@RequestMapping("/api/v1/individuo")
public class IndividuoController {

    @Autowired
    private IndividuoService individuoService;

    @PostMapping
    public void registrarCarro(@RequestBody Individuo individuo) {
        individuoService.registrarIndividuo(individuo);
    }

}
