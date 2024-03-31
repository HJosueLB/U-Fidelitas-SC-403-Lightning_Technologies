package com.LightningTech.controller;

import com.LightningTech.service.EquiposService;
import com.LightningTech.domain.Equipos;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/equipos")
public class EquiposController {

    @Autowired
    private EquiposService equiposService;

    @GetMapping("/listado")
    public String listarEquipos(@RequestParam(value = "marca", required = false) List<String> marcasSeleccionadas, Model model) {
        List<Equipos> equipos;
        if (marcasSeleccionadas == null || marcasSeleccionadas.isEmpty()) {
            equipos = equiposService.listarTodos();
        } else {
            equipos = equiposService.listarPorMarcas(marcasSeleccionadas);
        }
        List<String> todasLasMarcas = equiposService.encontrarMarcasUnicas();
        model.addAttribute("equipos", equipos);
        model.addAttribute("marcas", todasLasMarcas);
        model.addAttribute("marcasSeleccionadas", marcasSeleccionadas != null ? marcasSeleccionadas : Collections.emptyList());
        return "equipos/listado";
    }
}
