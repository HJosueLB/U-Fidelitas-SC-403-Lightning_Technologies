package com.LightningTech.dao;

import com.LightningTech.domain.Perifericos;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

public interface PerifericosDao extends JpaRepository<Perifericos, Long>{
    
    @Query("SELECT DISTINCT e.marca FROM Perifericos e")
    List<String> findDistinctMarcas();
    List<Perifericos> findByMarca(String marca);
    List<Perifericos> findByMarcaIn(List<String> marcas);
    
}
