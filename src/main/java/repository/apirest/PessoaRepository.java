package repository.apirest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    List<Pessoa> EncontrarPorCpf(String cpf);

    List<Pessoa> EncontrarPorEmail(String email);

}
