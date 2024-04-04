/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LightningTech.service.impl;
import com.LightningTech.dao.UsuarioDao;
import com.LightningTech.domain.Usuario;
import com.LightningTech.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Maik
 */


@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    @Override
    public Usuario obtenerUsuarioPorUsername(String username) {
        return usuarioDao.findByUsername(username);
    }
}