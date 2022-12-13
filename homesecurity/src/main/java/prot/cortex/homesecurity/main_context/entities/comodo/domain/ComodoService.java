package prot.cortex.homesecurity.main_context.entities.comodo.domain;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import prot.cortex.homesecurity.main_context.entities.sensorbiometrico.domain.SensorBiometrico;
import prot.cortex.homesecurity.main_context.entities.sensorbiometrico.domain.SensorBiometricoRepository;

@Service
@AllArgsConstructor
@Transactional
public class ComodoService {

    private final ComodoRepository comodoRepository;

    public void registrarComodo(Comodo comodo) {
        this.comodoRepository.save(comodo);
    }

}
