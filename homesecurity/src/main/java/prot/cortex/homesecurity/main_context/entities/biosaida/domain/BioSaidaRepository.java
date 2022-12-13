package prot.cortex.homesecurity.main_context.entities.biosaida.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prot.cortex.homesecurity.main_context.entities.comodo.domain.Comodo;

import java.util.UUID;

@Repository
public interface BioSaidaRepository extends JpaRepository<BioSaida, UUID> {
}
