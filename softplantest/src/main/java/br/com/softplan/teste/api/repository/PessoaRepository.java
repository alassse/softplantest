package br.com.softplan.teste.api.repository;

import br.com.softplan.teste.api.v1.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ProdutoRepository")
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}