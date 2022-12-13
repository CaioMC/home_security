package prot.cortex.homesecurity.main_context.entities.bioentradas.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
@Getter
@Table(name = "bio_entrada")
public class BioEntrada {
    @Id
    private UUID id;
    @Column(name = "individuo_id")
    private UUID individuoid;
    @Column(name = "sensor_biometrico_id")
    private UUID sensorBiometricoId;
    private LocalDateTime dataHora;
}
