package com.LightningTech.controller;

import com.LightningTech.service.ServiciosService;
import com.LightningTech.domain.Servicios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/servicios")
public class ServiciosController {

    @Autowired
    private ServiciosService serviciosService;

    @GetMapping("/listado")
    public String listarServicios(Model model) {
        List<Servicios> servicios = serviciosService.listarTodos();
        model.addAttribute("servicios", servicios);
        return "servicios/listado"; 
    }
}