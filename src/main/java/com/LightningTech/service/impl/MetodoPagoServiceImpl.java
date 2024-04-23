/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LightningTech.service.impl;
import com.LightningTech.dao.MetodoPagoDao;
import com.LightningTech.domain.MetodoPago;
import com.LightningTech.service.MetodoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Maik
 */
@Service
public class MetodoPagoServiceImpl implements MetodoPagoService {

    @Autowired
    private MetodoPagoDao metodoPagoDao;

    @Override
    public void guardarMetodoPago(MetodoPago metodoPago) {
        metodoPagoDao.save(metodoPago);
    }
}