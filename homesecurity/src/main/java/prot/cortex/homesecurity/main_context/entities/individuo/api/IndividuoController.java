package prot.cortex.homesecurity.main_context.entities.individuo.api;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prot.cortex.homesecurity.main_context.entities.individuo.domain.Individuo;
import prot.cortex.homesecurity.main_context.entities.individuo.domain.IndividuoService;

@RestController
@AllArgsConstructor
@Api(value = "Dados referente a pessoa presente")
@RequestMapping(path = "/api/v1/individuo", produces = { MediaType.APPLICATION_JSON_VALUE })
public class IndividuoController {

    private final IndividuoService individuoService;

    @PostMapping
    public ResponseEntity<Void> registrarIndividuo(@RequestBody Individuo individuo) {
        this.individuoService.registrarIndividuo(individuo);
        return ResponseEntity.ok().build();
    }

}
