/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.LightningTech.dao;
import com.LightningTech.domain.MetodoPago;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
/**
 *
 * @author Maik
 */
public interface MetodoPagoDao extends JpaRepository<MetodoPago, Long> {
    List<MetodoPago> findByNombrePropietarioContainingIgnoreCase(String nombrePropietario);
    MetodoPago findByNumeroTarjeta(String numeroTarjeta);
    
    List<MetodoPago> findByProvinciaIgnoreCase(String provincia);
    
    List<MetodoPago> findByCanton(String canton);
    
    List<MetodoPago> findByCodigoPostal(String codigoPostal);
    @Query("SELECT mp.provincia, COUNT(mp) FROM MetodoPago mp GROUP BY mp.provincia")
    
    List<Object[]> contarMetodosPagoPorProvincia();
    @Query("SELECT mp.canton, COUNT(mp) FROM MetodoPago mp GROUP BY mp.canton")
    
    List<Object[]> contarMetodosPagoPorCanton();
}

