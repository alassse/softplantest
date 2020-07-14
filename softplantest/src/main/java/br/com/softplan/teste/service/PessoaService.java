package br.com.softplan.teste.service;

import br.com.softplan.teste.model.Pessoa;
import br.com.softplan.teste.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {
    @Autowired
    PessoaRepository pessoaRepository;

    public List<Pessoa> findAllPessoa() {
        return pessoaRepository.findAll();
    }

    public Pessoa findPessoaById(Long id) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        return pessoa.isPresent() ? pessoa.get() : null;
    }

    public Pessoa createPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public Boolean updatePessoa(Long id, Pessoa pessoa) {
        pessoaRepository.findById(id).map(record -> {
            record.setDescricao(pessoa.getDescricao());
            record.setCodigo(pessoa.getCodigo());
            record.setMarca(pessoa.getMarca());
            pessoaRepository.save(record);

            return true;
        });

        return false;
    }

    public Boolean deletePessoa(Long id) {
        pessoaRepository.findById(id).map(record -> {
            pessoaRepository.deleteById(id);
            return true;
        });

        return false;
    }
}