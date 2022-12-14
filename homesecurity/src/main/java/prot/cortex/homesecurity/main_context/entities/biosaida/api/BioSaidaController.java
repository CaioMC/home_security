package prot.cortex.homesecurity.main_context.entities.biosaida.api;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prot.cortex.homesecurity.main_context.entities.bioentradas.domain.BioEntrada;
import prot.cortex.homesecurity.main_context.entities.biosaida.domain.BioSaida;
import prot.cortex.homesecurity.main_context.entities.biosaida.domain.BioSaidaRepository;
import prot.cortex.homesecurity.main_context.entities.biosaida.domain.BioSaidaService;

import java.util.List;

@RestController
@AllArgsConstructor
@Api(value = "Dados referente a saida")
@RequestMapping(path = "/api/v1/biosaida", produces = { MediaType.APPLICATION_JSON_VALUE })
@CrossOrigin(origins = "*")
public class BioSaidaController {

    private final BioSaidaService bioSaidaService;

    @PostMapping
    public ResponseEntity<Void> registrarSaida(@RequestBody BioSaidaDTO bioSaidaDTO) {
        this.bioSaidaService.registrarSaida(bioSaidaDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public List<BioSaida> getAllSaidas() {
        return this.bioSaidaService.getAllBioSaidas();
    }

}
