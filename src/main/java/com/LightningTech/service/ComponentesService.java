package com.LightningTech.service;

import com.LightningTech.domain.Componentes;
import java.util.List;

public interface ComponentesService {
    
    List<Componentes> listarTodos();
    void guardar(Componentes componente);
    Componentes encontrarPorId(Long id);
    void eliminar(Long id);
    List<Componentes> listarPorMarca(String marca); 
    List<String> encontrarMarcasUnicas();
    List<Componentes> listarPorTipoCI(List<String> tiposCI);
    List<String> encontrarTiposCIUnicos();
}