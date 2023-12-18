package controller.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apirest/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    public ResponseEntity<String> adicionarFuncionario(@RequestBody Funcionario funcionario) {
        funcionarioService.adicionarFuncionario(funcionario);
        return ResponseEntity.ok("Funcionário adicionado com sucesso");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> obterFuncionario(@PathVariable Long id) {
        Funcionario funcionario = funcionarioService.obterFuncionario(id);
        return ResponseEntity.ok(funcionario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> apagarFuncionario(@PathVariable Long id) {
        funcionarioService.apagarFuncionario(id);
        return ResponseEntity.ok("Funcionário apagado com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarFuncionario(@PathVariable Long id, @RequestBody Funcionario funcionario) {
        funcionarioService.atualizarFuncionario(id, funcionario);
        return ResponseEntity.ok("Funcionário atualizado com sucesso");
    }
}

