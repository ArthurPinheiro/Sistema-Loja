package com.curso.spring.demomvc.domain;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "CARGOS")
public class Cargo extends AbstractEntity<Long> {

    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_departamento_fk")
    private Departamento departamento;

    @OneToMany(mappedBy = "cargo")
    private List<Funcionario> funcionarios;
}
