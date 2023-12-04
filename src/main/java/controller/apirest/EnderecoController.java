package controller.apirest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apirest/enderecos")
public class EnderecoController {

    @PostMapping
    public ResponseEntity<String> adicionarEndereco(@RequestBody Object endereco) {
        return ResponseEntity.ok("Endereço adicionado com sucesso");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> obterEndereco(@PathVariable Long id) {
        return ResponseEntity.ok(null); 
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> apagarEndereco(@PathVariable Long id) {
        return ResponseEntity.ok("Endereço apagado com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarEndereco(@PathVariable Long id, @RequestBody Object endereco) {
        return ResponseEntity.ok("Endereço atualizado com sucesso");
    }
}