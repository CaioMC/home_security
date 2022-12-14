package prot.cortex.homesecurity.main_context.entities.sensorbiometrico.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "sensor_biometrico")
@Getter
@Builder
public class SensorBiometrico {
    @Id
    private UUID id;
    private String codigo;
    private String status;
    private UUID comodo_id;
}
