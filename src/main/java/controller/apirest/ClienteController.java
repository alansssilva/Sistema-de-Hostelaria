package controller.apirest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apirest/clientes")
public class ClienteController {

    @PostMapping
    public ResponseEntity<String> adicionarCliente(@RequestBody Object cliente) {
        return ResponseEntity.ok("Cliente adicionado com sucesso");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> obterCliente(@PathVariable Long id) {
        return ResponseEntity.ok(null); 
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> apagarCliente(@PathVariable Long id) {
        return ResponseEntity.ok("Cliente apagado com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarCliente(@PathVariable Long id, @RequestBody Object cliente) {
        return ResponseEntity.ok("Cliente atualizado com sucesso");
    }
}