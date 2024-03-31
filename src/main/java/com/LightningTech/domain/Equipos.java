package com.LightningTech.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "equipos")
public class Equipos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipos")
    private Long idEquipos;

    private String modelo;
    private String marca; 
    private String tipoCI; 
    private String procesador; 
    private String rutaImagen;
    private int precio;

    public Equipos() {
    }
}