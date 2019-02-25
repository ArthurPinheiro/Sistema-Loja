package com.curso.spring.demomvc.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long> {

    @Getter
    @Setter
    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @OneToMany(mappedBy = "departamento")
    private List<Cargo> cargos;

    public List<Cargo> getCargos() {
        return cargos;
    }
}
