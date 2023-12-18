package repository.apirest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

    List<Endereco> encontrarPorCidade(String cidade);

    Optional<Endereco> encontrarPorCep(String cep);

}