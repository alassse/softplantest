package br.com.altf4teste.teste.repository;

import br.com.altf4teste.teste.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ProdutoRepository")
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}