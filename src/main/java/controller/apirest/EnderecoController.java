package controller.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apirest/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    public ResponseEntity<String> adicionarEndereco(@RequestBody Endereco endereco) {
        enderecoService.adicionarEndereco(endereco);
        return ResponseEntity.ok("Endereço adicionado com sucesso");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Endereco> obterEndereco(@PathVariable Long id) {
        Endereco endereco = enderecoService.obterEndereco(id);
        return ResponseEntity.ok(endereco);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> apagarEndereco(@PathVariable Long id) {
        enderecoService.apagarEndereco(id);
        return ResponseEntity.ok("Endereço apagado com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarEndereco(@PathVariable Long id, @RequestBody Endereco endereco) {
        enderecoService.atualizarEndereco(id, endereco);
        return ResponseEntity.ok("Endereço atualizado com sucesso");
    }
}