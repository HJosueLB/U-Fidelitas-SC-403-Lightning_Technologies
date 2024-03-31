package com.LightningTech.service.impl;

import com.LightningTech.domain.Perifericos;
import com.LightningTech.dao.PerifericosDao;
import com.LightningTech.service.PerifericosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PerifericosServiceImpl implements PerifericosService{
    
    @Autowired
    private PerifericosDao perifericosDao;

    @Override
    public List<Perifericos> listarTodos() {
        return perifericosDao.findAll();
    }

    @Override
    public void guardar(Perifericos perifericos) {
        perifericosDao.save(perifericos);
    }

    @Override
    public Perifericos encontrarPorId(Long id) {
        return perifericosDao.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        perifericosDao.deleteById(id);
    }

    @Override
    public List<Perifericos> listarPorMarca(String marca) {
        if (marca == null || marca.isEmpty()) {
            return listarTodos();
        } else {
            return perifericosDao.findByMarca(marca); 
        }
    }

    @Override
    public List<String> encontrarMarcasUnicas() {
        return perifericosDao.findDistinctMarcas(); 
    }
    
     @Override
    public List<Perifericos> listarPorMarcas(List<String> marcas) {
        if (marcas == null || marcas.isEmpty()) {
            return listarTodos();
        } else {
            return perifericosDao.findByMarcaIn(marcas);
        }
    }
    
}
