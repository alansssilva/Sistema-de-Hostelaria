package controller.apirest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apirest/pagamentos")
public class PagamentoController {

    @PostMapping
    public ResponseEntity<String> realizarPagamento(@RequestBody Object pagamento) {
        return ResponseEntity.ok("Pagamento realizado com sucesso");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> obterPagamento(@PathVariable Long id) {
        return ResponseEntity.ok(null); 
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> cancelarPagamento(@PathVariable Long id) {
        return ResponseEntity.ok("Pagamento cancelado com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarPagamento(@PathVariable Long id, @RequestBody Object pagamento) {
        return ResponseEntity.ok("Pagamento atualizado com sucesso");
    }
}
