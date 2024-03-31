package com.LightningTech.controller;

import com.LightningTech.service.ComponentesService;
import com.LightningTech.domain.Componentes;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/componentes")
public class ComponentesController {
    
    @Autowired
    private ComponentesService componentesService;

    @GetMapping("/listado")
    public String listarComponentes(@RequestParam(value = "tipoCI", required = false) List<String> tiposSeleccionados, Model model) {
        List<Componentes> componentes = componentesService.listarPorTipoCI(tiposSeleccionados);
        List<String> todosLosTipos = componentesService.encontrarTiposCIUnicos(); 
        model.addAttribute("componentes", componentes);
        model.addAttribute("tiposCI", todosLosTipos);
        model.addAttribute("tiposSeleccionados", tiposSeleccionados != null ? tiposSeleccionados : Collections.emptyList());
        return "componentes/listado";
    }
}