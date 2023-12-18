package repository.apirest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmpresaHostelRepository extends JpaRepository<EmpresaHostel, Long> {

    List<EmpresaHostel> encontrarPorNomeContendoIgnoreCase(String nome);

    Optional<EmpresaHostel> encontrarPorCnpj(String cnpj);
}