package prot.cortex.homesecurity.main_context.entities.comodo.api;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prot.cortex.homesecurity.main_context.entities.comodo.domain.Comodo;
import prot.cortex.homesecurity.main_context.entities.comodo.domain.ComodoService;
import prot.cortex.homesecurity.main_context.entities.sensorbiometrico.domain.SensorBiometrico;
import prot.cortex.homesecurity.main_context.entities.sensorbiometrico.domain.SensorBiometricoService;

@RestController
@AllArgsConstructor
@Api(value = "Dados referente ao comodo da casa")
@RequestMapping(path = "/api/v1/comodo", produces = { MediaType.APPLICATION_JSON_VALUE })
public class ComodoController {

    private final ComodoService comodoService;

    @PostMapping
    public ResponseEntity<Void> registrarComodo(@RequestBody Comodo comodo) {
        if (!StringUtils.isEmpty(comodo.getId()))
            this.comodoService.registrarComodo(comodo);
        return ResponseEntity.ok().build();
    }

}
