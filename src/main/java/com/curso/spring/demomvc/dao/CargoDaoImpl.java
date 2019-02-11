package com.curso.spring.demomvc.dao;

import com.curso.spring.demomvc.domain.Cargo;
import org.springframework.stereotype.Repository;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {
}
