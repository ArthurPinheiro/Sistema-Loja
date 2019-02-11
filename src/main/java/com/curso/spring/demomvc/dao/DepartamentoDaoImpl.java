package com.curso.spring.demomvc.dao;

import com.curso.spring.demomvc.domain.Departamento;
import org.springframework.stereotype.Repository;

@Repository
public class DepartamentoDaoImpl extends AbstractDao<Departamento, Long> implements DepartamentoDao {
}
