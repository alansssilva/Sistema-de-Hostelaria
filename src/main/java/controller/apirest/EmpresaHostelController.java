package controller.apirest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apirest/empresa-hostel")
public class EmpresaHostelController {

    @PostMapping
    public ResponseEntity<String> adicionarEmpresaHostel(@RequestBody Object empresaHostel) {
        return ResponseEntity.ok("Empresa Hostel adicionada com sucesso");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> obterEmpresaHostel(@PathVariable Long id) {
        return ResponseEntity.ok(null);  
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> apagarEmpresaHostel(@PathVariable Long id) {
        return ResponseEntity.ok("Empresa Hostel apagada com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarEmpresaHostel(@PathVariable Long id, @RequestBody Object empresaHostel) {
        return ResponseEntity.ok("Empresa Hostel atualizada com sucesso");
    }
}