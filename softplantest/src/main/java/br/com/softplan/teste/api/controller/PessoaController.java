package br.com.softplan.teste.api.controller;

import br.com.softplan.teste.api.v1.model.Pessoa;
import br.com.softplan.teste.api.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/pessoas"})
public class PessoaController {
    @Autowired
    PessoaService pessoaService;

    @GetMapping
    public ResponseEntity<List<Pessoa>> getAllPessoas() {
        return new ResponseEntity(this.pessoaService.findAllPessoa(), HttpStatus.OK);
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Pessoa> getPessoaPorId(@PathVariable Long id) {
        return new ResponseEntity(this.pessoaService.findPessoaById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Pessoa> createPessoa(@RequestBody Pessoa pessoa) {
        return new ResponseEntity(this.pessoaService.createPessoa(pessoa), HttpStatus.OK);
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<Pessoa> updatePessoa(@PathVariable("id") Long id,
                                                @RequestBody Pessoa pessoa) {
        return new ResponseEntity(this.pessoaService.updatePessoa(id, pessoa), HttpStatus.OK);
    }

    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<Boolean> deletePessoa(@PathVariable Long id) {
        return new ResponseEntity(this.pessoaService.deletePessoa(id), HttpStatus.OK);
    }
}