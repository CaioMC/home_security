package prot.cortex.homesecurity.main_context.entities.sensorbiometrico.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prot.cortex.homesecurity.main_context.entities.individuo.domain.Individuo;

import java.util.UUID;

@Repository
public interface SensorBiometricoRepository extends JpaRepository<SensorBiometrico, UUID> {
}
