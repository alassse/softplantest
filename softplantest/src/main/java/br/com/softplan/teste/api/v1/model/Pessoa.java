package br.com.softplan.teste.api.v1.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Table(name = "pessoa")
@SequenceGenerator(name = "DEFAULT_GEN_ABSTRACT_MODEL", sequenceName = "tarifa_seq", allocationSize = 1)
@Entity
@Getter
@Setter
public class Pessoa extends AbstractModel {
    @NotNull
    @Column(name="nome", nullable = false)
    private String nome;

    @Column(name="email")
    private String email;

    @NotNull
    @Column(name="data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name="naturalidade")
    private String naturalidade;

    @Column(name="nacionalidade")
    private String nacionalidade;

    @Pattern(regexp = "/(\\d{3})(\\d{3})(\\d{3})(\\d{2})/", message = "CPF inválido")
    @NotNull
    @Column(name="cpf", nullable = false)
    private String cpf;
}