package prot.cortex.homesecurity.main_context.entities.comodo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prot.cortex.homesecurity.main_context.entities.sensorbiometrico.domain.SensorBiometrico;

import java.util.UUID;

@Repository
public interface ComodoRepository extends JpaRepository<Comodo, UUID> {
}
