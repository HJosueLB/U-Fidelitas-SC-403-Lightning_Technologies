/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LightningTech.controller;
import com.LightningTech.domain.Usuario;
import com.LightningTech.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Maik
 */


@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model modelo) {
        modelo.addAttribute("usuario", new Usuario());
        return "registro";
    }

    @PostMapping("/registro")
    public String registrarUsuario(@ModelAttribute("usuario") Usuario usuario) {
        usuarioService.guardarUsuario(usuario);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String mostrarFormularioLogin(Model modelo) {
        modelo.addAttribute("usuario", new Usuario());
        return "login";
    }

    @PostMapping("/login")
    public String iniciarSesion(@ModelAttribute("usuario") Usuario usuario) {
        Usuario usuarioExistente = usuarioService.obtenerUsuarioPorUsername(usuario.getUsername());
        if (usuarioExistente != null && usuarioExistente.getPassword().equals(usuario.getPassword())) {
            return "redirect:/";
        } else {
            return "redirect:/login?error";
        }
    }
}