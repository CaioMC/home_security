package prot.cortex.homesecurity.main_context.entities.comodo.api;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prot.cortex.homesecurity.main_context.entities.comodo.domain.ComodoService;

@RestController
@AllArgsConstructor
@Api(value = "Dados referente ao comodo da casa")
@RequestMapping(path = "/api/v1/comodo", produces = { MediaType.APPLICATION_JSON_VALUE })
@CrossOrigin(origins = "*")
public class ComodoController {

    private final ComodoService comodoService;

    @PostMapping
    public ResponseEntity<Void> registrarComodo(@RequestBody ComodoDTO comodoDTO) {
        this.comodoService.registrarComodo(comodoDTO);
        return ResponseEntity.ok().build();
    }

}
