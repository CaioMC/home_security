package prot.cortex.homesecurity.main_context.entities.sensorbiometrico.domain;

import java.util.UUID;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import prot.cortex.homesecurity.main_context.entities.sensorbiometrico.api.SensorBiometricoDTO;
import java.util.List;


@Service
@AllArgsConstructor
@Transactional
public class SensorBiometricoService {

    private final SensorBiometricoRepository sensorBiometricoRepository;

    public void registrarBiometria(SensorBiometricoDTO dto) {
        this.sensorBiometricoRepository.save(
            SensorBiometrico.builder()
                .id(UUID.randomUUID())
                .codigo(dto.getCodigo())
                .status(dto.getStatus())
                .comodo_id(dto.getComodo_id())
                .build()
        );
    }

    public List<SensorBiometrico> getAllBiometria() {
       return this.sensorBiometricoRepository.findAll();
    }

}
