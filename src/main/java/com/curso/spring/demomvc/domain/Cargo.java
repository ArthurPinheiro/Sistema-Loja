package com.curso.spring.demomvc.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;


@Entity
@Table(name = "CARGOS")
public class Cargo extends AbstractEntity<Long> {

    @NotBlank(message = "O nome do cargo é obrigatorio ")
    @Size(max = 60, message = "O nome do cargo deve ter no máximo 60 caracteres.")
    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @NotNull(message = "Selecione o departamento relativo ao cargo")
    @ManyToOne
    @JoinColumn(name = "id_departamento_fk")
    private Departamento departamento;

    @OneToMany(mappedBy = "cargo")
    private List<Funcionario> funcionarios;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }


    public Departamento getDepartamento() {
        return departamento;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }


    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
