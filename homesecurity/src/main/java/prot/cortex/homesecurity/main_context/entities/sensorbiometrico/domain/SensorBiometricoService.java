package prot.cortex.homesecurity.main_context.entities.sensorbiometrico.domain;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class SensorBiometricoService {

    private final SensorBiometricoRepository sensorBiometricoRepository;

    public void registrarBiometria(SensorBiometrico sensorBiometrico) {
        this.sensorBiometricoRepository.save(sensorBiometrico);
    }

}
