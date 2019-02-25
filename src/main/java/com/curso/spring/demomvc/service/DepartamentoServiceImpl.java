package com.curso.spring.demomvc.service;

import com.curso.spring.demomvc.dao.DepartamentoDao;
import com.curso.spring.demomvc.domain.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

    @Autowired
    private DepartamentoDao dao;

    @Transactional
    @Override
    public void salvar(Departamento departamento) {
        dao.save(departamento);
    }

    @Transactional
    @Override
    public void editar(Departamento departamento) {
        dao.update(departamento);
    }

    @Transactional
    @Override
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override
    public Departamento buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Departamento> buscarTodos() {
        return dao.findAll();
    }

    @Override
    public boolean departamentoTemCargos(Long id) {
        if(buscarPorId(id).getCargos().isEmpty()){
            return false;
        }
        return true;
    }
}
