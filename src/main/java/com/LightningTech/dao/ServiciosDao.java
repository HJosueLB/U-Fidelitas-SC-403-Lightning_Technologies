package com.LightningTech.dao;

import com.LightningTech.domain.Servicios;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

public interface ServiciosDao extends JpaRepository<Servicios, Long>{
    
    
    
}
