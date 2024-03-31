package com.LightningTech.controller;

import com.LightningTech.service.EquiposService;
import com.LightningTech.domain.Equipos; // Importa la clase Equipos
import java.util.List; // Importa la interfaz List
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/equipos")
public class EquiposController {

    @Autowired
    private EquiposService equiposService;

    @GetMapping("/listado")
    public String listarEquipos(Model model) {
        List<Equipos> equipos = equiposService.listarTodos();
        model.addAttribute("equipos", equipos);
        System.out.println("Ejecucion correcta de OPCION EQUIPOS_DE_COMPUTO");
        return "equipos/listado";
    }
}