package com.LightningTech.service.impl;

import com.LightningTech.domain.Equipos;
import com.LightningTech.dao.EquiposDao;
import com.LightningTech.service.EquiposService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EquiposServiceImpl implements EquiposService {

    @Autowired
    private EquiposDao equiposDao;

    @Override
    public List<Equipos> listarTodos() {
        return equiposDao.findAll();
    }

    @Override
    public void guardar(Equipos equipo) {
        equiposDao.save(equipo);
    }

    @Override
    public Equipos encontrarPorId(Long id) {
        return equiposDao.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        equiposDao.deleteById(id);
    }

    @Override
    public List<Equipos> listarPorMarca(String marca) {
        if (marca == null || marca.isEmpty()) {
            return listarTodos();
        } else {
            return equiposDao.findByMarca(marca); 
        }
    }

    @Override
    public List<String> encontrarMarcasUnicas() {
        return equiposDao.findDistinctMarcas(); 
    }
    
     @Override
    public List<Equipos> listarPorMarcas(List<String> marcas) {
        if (marcas == null || marcas.isEmpty()) {
            return listarTodos();
        } else {
            return equiposDao.findByMarcaIn(marcas);
        }
    }
}