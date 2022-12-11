package prot.cortex.homesecurity.main_context.entities.individuo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IndividuoRepository extends JpaRepository<Individuo, UUID> {
}
