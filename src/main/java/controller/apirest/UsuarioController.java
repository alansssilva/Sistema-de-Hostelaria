package controller.apirest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apirest/usuarios")
public class UsuarioController {

    @PostMapping
    public ResponseEntity<String> adicionarUsuario(@RequestBody Object usuario) {
        return ResponseEntity.ok("Usuário adicionado com sucesso");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> obterUsuario(@PathVariable Long id) {
        return ResponseEntity.ok(null);  
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> apagarUsuario(@PathVariable Long id) {
        return ResponseEntity.ok("Usuário apagado com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarUsuario(@PathVariable Long id, @RequestBody Object usuario) {
        return ResponseEntity.ok("Usuário atualizado com sucesso");
    }
}
