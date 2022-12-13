package prot.cortex.homesecurity.main_context.entities.sensorbiometrico.api;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prot.cortex.homesecurity.main_context.entities.sensorbiometrico.domain.SensorBiometrico;
import prot.cortex.homesecurity.main_context.entities.sensorbiometrico.domain.SensorBiometricoService;

@RestController
@AllArgsConstructor
@Api(value = "Dados referente a biometria do individuo")
@RequestMapping(path = "/api/v1/sensorBiometrico", produces = { MediaType.APPLICATION_JSON_VALUE })
public class SensorBiometricoController {

    private final SensorBiometricoService sensorBiometricoService;

    @PostMapping
    public ResponseEntity<Void> registrarBiometria(@RequestBody SensorBiometrico sensorBiometrico) {
        if (!StringUtils.isEmpty(sensorBiometrico.getId()))
            this.sensorBiometricoService.registrarBiometria(sensorBiometrico);
        return ResponseEntity.ok().build();
    }

}
