package controller.apirest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apirest/hostels")
public class HostelController {

    @PostMapping
    public ResponseEntity<String> adicionarHostel(@RequestBody Object hostel) {
        return ResponseEntity.ok("Hostel adicionado com sucesso");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> obterHostel(@PathVariable Long id) {
        return ResponseEntity.ok(null);  
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> apagarHostel(@PathVariable Long id) {

        return ResponseEntity.ok("Hostel apagado com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarHostel(@PathVariable Long id, @RequestBody Object hostel) {
        return ResponseEntity.ok("Hostel atualizado com sucesso");
    }
}
