/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.LightningTech.dao;
import com.LightningTech.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
/**
 *
 * @author Maik
 */
public interface ClienteDao extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNombreContainingIgnoreCase(String nombre);
    Cliente findByEmailIgnoreCase(String email);
    List<Cliente> findByProvinciaIgnoreCase(String provincia);
    @Query("SELECT c.canton, COUNT(c) FROM Cliente c GROUP BY c.canton")
    List<Object[]> contarClientesPorCanton();
}


