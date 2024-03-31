package com.LightningTech.service.impl;

import com.LightningTech.domain.Equipos;
import com.LightningTech.dao.EquiposDao;
import com.LightningTech.service.EquiposService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EquiposServiceImpl implements EquiposService {

    @Autowired
    private EquiposDao equiposDao;

    @Override
    @Transactional(readOnly = true)
    public List<Equipos> listarTodos() {
        return equiposDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Equipos equipo) {
        equiposDao.save(equipo);
    }

    @Override
    @Transactional(readOnly = true)
    public Equipos encontrarPorId(Long id) {
        return equiposDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void eliminar(Long id) {
        equiposDao.deleteById(id);
    }
}