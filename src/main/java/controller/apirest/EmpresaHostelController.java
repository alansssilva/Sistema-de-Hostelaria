import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apirest/empresa-hostel")
public class EmpresaHostelController {

    @Autowired
    private EmpresaHostelService empresaHostelService;

    @PostMapping
    public ResponseEntity<String> adicionarEmpresaHostel(@RequestBody EmpresaHostel empresaHostel) {
        empresaHostelService.adicionarEmpresaHostel(empresaHostel);
        return ResponseEntity.ok("Empresa Hostel adicionada com sucesso");
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpresaHostel> obterEmpresaHostel(@PathVariable Long id) {
        EmpresaHostel empresaHostel = empresaHostelService.obterEmpresaHostel(id);
        return ResponseEntity.ok(empresaHostel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> apagarEmpresaHostel(@PathVariable Long id) {
        empresaHostelService.apagarEmpresaHostel(id);
        return ResponseEntity.ok("Empresa Hostel apagada com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarEmpresaHostel(@PathVariable Long id, @RequestBody EmpresaHostel empresaHostel) {
        empresaHostelService.atualizarEmpresaHostel(id, empresaHostel);
        return ResponseEntity.ok("Empresa Hostel atualizada com sucesso");
    }
}
