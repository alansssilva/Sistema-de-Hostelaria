package controller.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apirest/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public ResponseEntity<String> adicionarPessoa(@RequestBody Pessoa pessoa) {
        pessoaService.adicionarPessoa(pessoa);
        return ResponseEntity.ok("Pessoa adicionada com sucesso");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> obterPessoa(@PathVariable Long id) {
        Pessoa pessoa = pessoaService.obterPessoa(id);
        return ResponseEntity.ok(pessoa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> apagarPessoa(@PathVariable Long id) {
        pessoaService.apagarPessoa(id);
        return ResponseEntity.ok("Pessoa apagada com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarPessoa(@PathVariable Long id, @RequestBody Pessoa pessoa) {
        pessoaService.atualizarPessoa(id, pessoa);
        return ResponseEntity.ok("Pessoa atualizada com sucesso");
    }
}
