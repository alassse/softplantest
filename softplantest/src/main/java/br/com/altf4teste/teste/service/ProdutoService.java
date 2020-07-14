package br.com.altf4teste.teste.service;

import br.com.altf4teste.teste.model.Produto;
import br.com.altf4teste.teste.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository produtoRepository;

    public List<Produto> findAllProduto() {
        return produtoRepository.findAll();
    }

    public Produto findProdutoById(Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.isPresent() ? produto.get() : null;
    }

    public Produto createProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Boolean updateProduto(Long id, Produto produto) {
        produtoRepository.findById(id).map(record -> {
            record.setDescricao(produto.getDescricao());
            record.setCodigo(produto.getCodigo());
            record.setMarca(produto.getMarca());
            produtoRepository.save(record);

            return true;
        });

        return false;
    }

    public Boolean deleteProduto(Long id) {
        produtoRepository.findById(id).map(record -> {
            produtoRepository.deleteById(id);
            return true;
        });

        return false;
    }
}