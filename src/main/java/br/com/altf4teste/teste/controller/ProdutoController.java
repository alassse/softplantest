package br.com.altf4teste.teste.controller;

import br.com.altf4teste.teste.model.Produto;
import br.com.altf4teste.teste.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/produtos"})
public class ProdutoController {
    @Autowired
    ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<Produto>> getAllProdutos() {
        return new ResponseEntity(this.produtoService.findAllProduto(), HttpStatus.OK);
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Produto> getProdutoPorId(@PathVariable Long id) {
        return new ResponseEntity(this.produtoService.findProdutoById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Produto> createProduto(@RequestBody Produto produto) {
        return new ResponseEntity(this.produtoService.createProduto(produto), HttpStatus.OK);
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<Produto> updateProduto(@PathVariable("id") Long id,
                                                 @RequestBody Produto produto) {
        return new ResponseEntity(this.produtoService.updateProduto(id, produto), HttpStatus.OK);
    }

    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<Boolean> deleteProduto(@PathVariable Long id) {
        return new ResponseEntity(this.produtoService.deleteProduto(id), HttpStatus.OK);
    }
}