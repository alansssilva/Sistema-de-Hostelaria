package controller.apirest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apirest/cargos")
public class CargoController {

    @PostMapping
    public ResponseEntity<String> adicionarCargo(@RequestBody Object cargo) {
        return ResponseEntity.ok("Cargo adicionado com sucesso");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> obterCargo(@PathVariable Long id) {
        return ResponseEntity.ok(null); 
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> apagarCargo(@PathVariable Long id) {
        return ResponseEntity.ok("Cargo apagado com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarCargo(@PathVariable Long id, @RequestBody Object cargo) {
        return ResponseEntity.ok("Cargo atualizado com sucesso");
    }
}