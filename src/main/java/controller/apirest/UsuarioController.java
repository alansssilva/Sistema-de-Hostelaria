package controller.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/apirest/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<String> adicionarUsuario(@RequestBody Usuario usuario) {
        usuarioService.adicionarUsuario(usuario);
        return ResponseEntity.ok("Usuário adicionado com sucesso");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obterUsuario(@PathVariable Long id) {
        Usuario usuario = usuarioService.obterUsuario(id);
        return ResponseEntity.ok(usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> apagarUsuario(@PathVariable Long id) {
        usuarioService.apagarUsuario(id);
        return ResponseEntity.ok("Usuário apagado com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        usuarioService.atualizarUsuario(id, usuario);
        return ResponseEntity.ok("Usuário atualizado com sucesso");
    }
}
