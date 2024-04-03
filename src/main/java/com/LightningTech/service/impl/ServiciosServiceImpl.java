package com.LightningTech.service.impl;

import com.LightningTech.domain.Servicios;
import com.LightningTech.dao.ServiciosDao;
import com.LightningTech.service.ServiciosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServiciosServiceImpl implements ServiciosService{
    
    @Autowired
    private ServiciosDao serviciosDao;
    
    @Override
    public List<Servicios> listarTodos() {
        return serviciosDao.findAll();
    }
    
}
