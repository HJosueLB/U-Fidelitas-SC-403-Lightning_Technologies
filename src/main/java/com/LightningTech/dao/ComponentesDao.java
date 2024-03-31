package com.LightningTech.dao;

import com.LightningTech.domain.Componentes;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

public interface ComponentesDao extends JpaRepository<Componentes, Long> {
    
    @Query("SELECT DISTINCT e.marca FROM Componentes e")
    List<String> findDistinctMarcas();
    
    List<Componentes> findByMarca(String marca);

    List<Componentes> findByTipoCIIn(List<String> tiposCI);

    @Query("SELECT DISTINCT e.tipoCI FROM Componentes e")
    List<String> findDistinctTiposCI();
}
