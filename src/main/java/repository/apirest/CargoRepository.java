package repository.apirest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {

    List<Cargo> encontrarPorFuncaoContainingIgnoreCase(String funcao);

    List<Cargo> encontrarPorNivelAcesso(String nivelAcesso);

    List<Cargo> encontrarPorFuncionarioPessoaEnderecoCidade(String cidade);

}
