package com.LightningTech.service;

import com.LightningTech.domain.Perifericos;
import java.util.List;

public interface PerifericosService {
    
    List<Perifericos> listarTodos();
    void guardar(Perifericos periferico);
    Perifericos encontrarPorId(Long id);
    void eliminar(Long id);
    List<Perifericos> listarPorMarca(String marca); 
    List<String> encontrarMarcasUnicas();
    List<Perifericos> listarPorMarcas(List<String> marcas);
    
}
