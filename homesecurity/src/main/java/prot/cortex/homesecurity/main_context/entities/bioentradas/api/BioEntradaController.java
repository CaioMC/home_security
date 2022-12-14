package prot.cortex.homesecurity.main_context.entities.bioentradas.api;

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
import prot.cortex.homesecurity.main_context.entities.bioentradas.domain.BioEntradaService;

import java.util.List;

@RestController
@AllArgsConstructor
@Api(value = "Dados referente a entrada")
@RequestMapping(path = "/api/v1/bioentrada", produces = { MediaType.APPLICATION_JSON_VALUE })
@CrossOrigin(origins = "*")
public class BioEntradaController {

    private final BioEntradaService bioEntradaService;

    @PostMapping
    public ResponseEntity<Void> registrarEntrada(@RequestBody BioEntradaDTO bioEntradaDTO) {
        this.bioEntradaService.registrarEntrada(bioEntradaDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public List<BioEntrada> getAllEntradas() {
        return this.bioEntradaService.getAllBioEntradas();
    }

}
