package com.LightningTech.service.impl;

import com.LightningTech.domain.Componentes;
import com.LightningTech.dao.ComponentesDao;
import com.LightningTech.service.ComponentesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ComponentesServiceImpl implements ComponentesService{
 
        @Autowired
    private ComponentesDao componentesDao;

    @Override
    public List<Componentes> listarTodos() {
        return componentesDao.findAll();
    }

    @Override
    public void guardar(Componentes componentes) {
        componentesDao.save(componentes);
    }

    @Override
    public Componentes encontrarPorId(Long id) {
        return componentesDao.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        componentesDao.deleteById(id);
    }

    @Override
    public List<Componentes> listarPorMarca(String marca) {
        if (marca == null || marca.isEmpty()) {
            return listarTodos();
        } else {
            return componentesDao.findByMarca(marca); 
        }
    }

    @Override
    public List<String> encontrarMarcasUnicas() {
        return componentesDao.findDistinctMarcas(); 
    }
    
    @Override
    public List<Componentes> listarPorTipoCI(List<String> tiposCI) {
        if (tiposCI == null || tiposCI.isEmpty()) {
            return listarTodos();
        } else {
            return componentesDao.findByTipoCIIn(tiposCI);
        }
    }
    
    @Override
    public List<String> encontrarTiposCIUnicos() {
        return componentesDao.findDistinctTiposCI();
    }
}
