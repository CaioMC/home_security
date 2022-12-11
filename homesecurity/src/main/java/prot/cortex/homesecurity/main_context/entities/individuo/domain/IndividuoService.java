package prot.cortex.homesecurity.main_context.entities.individuo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndividuoService {

    @Autowired
    private IndividuoRepository individuoRepository;

    public void registrarIndividuo(Individuo individuo) {
        individuoRepository.save(individuo);
    }
}
