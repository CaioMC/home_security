package prot.cortex.homesecurity.main_context.entities.bioentradas.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prot.cortex.homesecurity.main_context.entities.biosaida.domain.BioSaida;

import java.util.UUID;

@Repository
public interface BioEntradaRepository extends JpaRepository<BioEntrada, UUID> {
}
