package prot.cortex.homesecurity.main_context.entities.bioentradas.domain;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

import prot.cortex.homesecurity.main_context.entities.bioentradas.api.BioEntradaDTO;

@Service
@AllArgsConstructor
@Transactional
public class BioEntradaService {

    private final BioEntradaRepository bioEntradaRepository;

    public void registrarEntrada(BioEntradaDTO dto) {
        this.bioEntradaRepository.save(
            BioEntrada.builder()
                .id(UUID.randomUUID())
                .individuoid(dto.getIndividuoid())
                .sensorBiometricoId(dto.getSensorBiometricoId())
                .dataHora(dto.getDataHora())
                .build()
        );
    }

    public List<BioEntrada> getAllBioEntradas() {
        return this.bioEntradaRepository.findAll();
    }

}
