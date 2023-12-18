package controller.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apirest/hostels")
public class HostelController {

    @Autowired
    private HostelService hostelService;

    @PostMapping
    public ResponseEntity<String> adicionarHostel(@RequestBody Hostel hostel) {
        hostelService.adicionarHostel(hostel);
        return ResponseEntity.ok("Hostel adicionado com sucesso");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hostel> obterHostel(@PathVariable Long id) {
        Hostel hostel = hostelService.obterHostel(id);
        return ResponseEntity.ok(hostel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> apagarHostel(@PathVariable Long id) {
        hostelService.apagarHostel(id);
        return ResponseEntity.ok("Hostel apagado com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarHostel(@PathVariable Long id, @RequestBody Hostel hostel) {
        hostelService.atualizarHostel(id, hostel);
        return ResponseEntity.ok("Hostel atualizado com sucesso");
    }
}
