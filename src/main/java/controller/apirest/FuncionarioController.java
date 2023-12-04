package controller.apirest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apirest/funcionarios")
public class FuncionarioController {

    @PostMapping
    public ResponseEntity<String> adicionarFuncionario(@RequestBody Object funcionario) {
        return ResponseEntity.ok("Funcionário adicionado com sucesso");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> obterFuncionario(@PathVariable Long id) {
        return ResponseEntity.ok(null); 
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> apagarFuncionario(@PathVariable Long id) {
        return ResponseEntity.ok("Funcionário apagado com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarFuncionario(@PathVariable Long id, @RequestBody Object funcionario) {
        return ResponseEntity.ok("Funcionário atualizado com sucesso");
    }
}
