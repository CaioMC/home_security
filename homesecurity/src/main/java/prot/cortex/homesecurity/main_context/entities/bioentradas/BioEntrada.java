package prot.cortex.homesecurity.main_context.entities.bioentradas;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

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
@Table(name = "bio_entrada")
public class BioEntrada {
    @Id
    private UUID identificador;
    private UUID individuoid;
    private UUID sensorBiometricoId;
    private LocalDateTime dataHora;
}
