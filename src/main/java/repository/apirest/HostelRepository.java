package repository.apirest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HostelRepository extends JpaRepository<Hostel, Long> {

    List<Hostel> encontrarPorNomeContendoIgnoreCase(String nome);

    List<Hostel> encontrarPorEmpresaHostelNomeContendoIgnoreCase(String nomeEmpresaHostel);

}