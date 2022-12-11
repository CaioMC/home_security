package prot.cortex.homesecurity.main_context.entities.individuo.domain;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class IndividuoService {

    private final IndividuoRepository individuoRepository;

    public void registrarIndividuo(Individuo individuo) {
        this.individuoRepository.save(individuo);
    }

}
