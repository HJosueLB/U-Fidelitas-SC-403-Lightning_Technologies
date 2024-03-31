package com.LightningTech.controller;

import com.LightningTech.service.PerifericosService;
import com.LightningTech.domain.Perifericos;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/perifericos")
public class PerifericosController {
    
    @Autowired
    private PerifericosService perifericosService;

    @GetMapping("/listado")
    public String listarPerifericos(@RequestParam(value = "marca", required = false) List<String> marcasSeleccionadas, Model model) {
        List<Perifericos> perifericos;
        if (marcasSeleccionadas == null || marcasSeleccionadas.isEmpty()) {
            perifericos = perifericosService.listarTodos();
        } else {
            perifericos = perifericosService.listarPorMarcas(marcasSeleccionadas);
        }
        List<String> todasLasMarcas = perifericosService.encontrarMarcasUnicas();
        model.addAttribute("perifericos", perifericos);
        model.addAttribute("marcas", todasLasMarcas);
        model.addAttribute("marcasSeleccionadas", marcasSeleccionadas != null ? marcasSeleccionadas : Collections.emptyList());
        return "perifericos/listado";
    }
    
}
