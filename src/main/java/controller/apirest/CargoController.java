package controller.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apirest/cargos")
public class CargoController {

    @Autowired
    private CargoService cargoService;

    @PostMapping
    public ResponseEntity<String> adicionarCargo(@RequestBody Cargo cargo) {
        cargoService.adicionarCargo(cargo);
        return ResponseEntity.ok("Cargo adicionado com sucesso");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cargo> obterCargo(@PathVariable Long id) {
        Cargo cargo = cargoService.obterCargo(id);
        return ResponseEntity.ok(cargo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> apagarCargo(@PathVariable Long id) {
        cargoService.apagarCargo(id);
        return ResponseEntity.ok("Cargo apagado com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarCargo(@PathVariable Long id, @RequestBody Cargo cargo) {
        cargoService.atualizarCargo(id, cargo);
        return ResponseEntity.ok("Cargo atualizado com sucesso");
    }
}
