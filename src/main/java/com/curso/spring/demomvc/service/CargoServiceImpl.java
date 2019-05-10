package com.curso.spring.demomvc.service;

import com.curso.spring.demomvc.dao.CargoDao;
import com.curso.spring.demomvc.domain.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CargoServiceImpl implements CargoService {

    @Autowired
    private CargoDao dao;

    @Override
    @Transactional
    public void salvar(Cargo cargo) {
        dao.save(cargo);
    }

    @Override
    @Transactional
    public void editar(Cargo cargo) {
        dao.update(cargo);
    }

    @Override
    @Transactional
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override
    public Cargo buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Cargo> buscarTodos() {
        return dao.findAll();
    }

    @Override
    public boolean cargoTemFuncionarios(Long id) {
        if(buscarPorId(id).getFuncionarios().isEmpty()){
            return false;
        }
            return true;
    }
}
