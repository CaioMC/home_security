package prot.cortex.homesecurity.main_context.entities.sensorbiometrico.api;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SensorBiometricoDTO {
    private String codigo;
    private String status;
    private UUID comodo_id;
}
