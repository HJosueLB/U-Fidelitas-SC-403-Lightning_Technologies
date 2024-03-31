package com.LightningTech.service;

import com.LightningTech.domain.Equipos;
import java.util.List;

public interface EquiposService {
    
    List<Equipos> listarTodos();
    void guardar(Equipos equipo);
    Equipos encontrarPorId(Long id);
    void eliminar(Long id);
    List<Equipos> listarPorMarca(String marca); 
    List<String> encontrarMarcasUnicas();
    List<Equipos> listarPorMarcas(List<String> marcas);
}