package com.LightningTech.dao;

import com.LightningTech.domain.Equipos;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EquiposDao extends JpaRepository<Equipos, Long> {

}