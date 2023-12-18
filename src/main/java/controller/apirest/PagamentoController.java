package controller.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apirest/pagamentos")
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    @PostMapping
    public ResponseEntity<String> realizarPagamento(@RequestBody Pagamento pagamento) {
        pagamentoService.realizarPagamento(pagamento);
        return ResponseEntity.ok("Pagamento realizado com sucesso");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pagamento> obterPagamento(@PathVariable Long id) {
        Pagamento pagamento = pagamentoService.obterPagamento(id);
        return ResponseEntity.ok(pagamento);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> cancelarPagamento(@PathVariable Long id) {
        pagamentoService.cancelarPagamento(id);
        return ResponseEntity.ok("Pagamento cancelado com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarPagamento(@PathVariable Long id, @RequestBody Pagamento pagamento) {
        pagamentoService.atualizarPagamento(id, pagamento);
        return ResponseEntity.ok("Pagamento atualizado com sucesso");
    }
}
