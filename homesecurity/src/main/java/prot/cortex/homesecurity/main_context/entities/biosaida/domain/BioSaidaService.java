package prot.cortex.homesecurity.main_context.entities.biosaida.domain;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import prot.cortex.homesecurity.main_context.entities.bioentradas.domain.BioEntrada;
import prot.cortex.homesecurity.main_context.entities.biosaida.api.BioSaidaDTO;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
@Transactional
public class BioSaidaService {

    private final BioSaidaRepository bioSaidaRepository;

    public void registrarSaida(BioSaidaDTO dto) {
        this.bioSaidaRepository.save(
            BioSaida.builder()
                .id(UUID.randomUUID())
                .individuoid(dto.getIndividuoid())
                .sensorBiometricoId(dto.getSensorBiometricoId())
                .dataHora(dto.getDataHora())
                .build()
        );
    }

    public List<BioSaida> getAllBioSaidas() {
        return this.bioSaidaRepository.findAll();
    }

}
