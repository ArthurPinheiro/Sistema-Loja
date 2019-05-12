package com.curso.spring.demomvc.web.conversor;

import com.curso.spring.demomvc.domain.Cargo;
import com.curso.spring.demomvc.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToCargoConversor implements Converter<String, Cargo> {

    @Autowired
    CargoService service;

    @Override
    public Cargo convert(String text) {

        if(text.isEmpty()){
            return null;
        }
        Long id = Long.valueOf(text);
        return service.buscarPorId(id);
    }
}
