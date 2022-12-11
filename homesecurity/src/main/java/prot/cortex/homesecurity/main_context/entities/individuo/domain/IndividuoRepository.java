package prot.cortex.homesecurity.main_context.entities.individuo.domain;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndividuoRepository extends JpaRepository<Individuo, UUID> {

}
