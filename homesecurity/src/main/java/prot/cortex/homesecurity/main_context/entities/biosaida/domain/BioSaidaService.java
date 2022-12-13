package prot.cortex.homesecurity.main_context.entities.biosaida.domain;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import prot.cortex.homesecurity.main_context.entities.bioentradas.domain.BioEntrada;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class BioSaidaService {

    private final BioSaidaRepository bioSaidaRepository;

    public void registrarSaida(BioSaida bioSaida) {
        this.bioSaidaRepository.save(bioSaida);
    }

    public List<BioSaida> getAllBioSaidas() {
        return this.bioSaidaRepository.findAll();
    }

}
