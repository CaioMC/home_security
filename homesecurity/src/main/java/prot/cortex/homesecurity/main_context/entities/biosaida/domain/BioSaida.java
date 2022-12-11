package prot.cortex.homesecurity.main_context.entities.biosaida.domain;

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
@Table(name = "bio_saida")
public class BioSaida {
    @Id
    private UUID identificador;
    private UUID individuo_id;
    private UUID sensor_biometrico_id;
    private LocalDateTime dataHora;

}
