package prot.cortex.homesecurity.main_context.entities.bioentradas.domain;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class BioEntradaService {

    private final BioEntradaRepository bioEntradaRepository;

    public void registrarEntrada(BioEntrada bioEntrada) {
        this.bioEntradaRepository.save(bioEntrada);
    }

    public List<BioEntrada> getAllBioEntradas() {
        return this.bioEntradaRepository.findAll();
    }

}
