package com.LightningTech.dao;

import com.LightningTech.domain.Equipos;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

public interface EquiposDao extends JpaRepository<Equipos, Long> {
    @Query("SELECT DISTINCT e.marca FROM Equipos e")
    List<String> findDistinctMarcas();
    List<Equipos> findByMarca(String marca);
    List<Equipos> findByMarcaIn(List<String> marcas);
}