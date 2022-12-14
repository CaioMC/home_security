package prot.cortex.homesecurity.main_context.entities.individuo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "individuo")
@Getter
@CrossOrigin(origins = "*")
public class Individuo {
    @Id
    private UUID id;
    private String nome;
    private String cpf;
    private String biometria;
}
