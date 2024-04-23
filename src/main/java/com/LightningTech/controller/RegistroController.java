/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LightningTech.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author Maik
 */
@Controller
public class RegistroController {

    @GetMapping("/registro")
    public String mostrarFormularioRegistro() {
        return "registro/formulario";
    }

}