/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.LightningTech.service;
import com.LightningTech.domain.Usuario;
/**
 *
 * @author Maik
 */
public interface UsuarioService {
    Usuario guardarUsuario(Usuario usuario);
    Usuario obtenerUsuarioPorUsername(String username);
}
