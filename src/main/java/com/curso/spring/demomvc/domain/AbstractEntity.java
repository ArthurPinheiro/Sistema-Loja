package com.curso.spring.demomvc.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@MappedSuperclass
public abstract class AbstractEntity<ID extends Serializable> implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;
}
