package com.LightningTech.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "componentes")
public class Componentes implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_componentes")
    private Long idComponentes;

    private String modelo;
    private String marca; 
    private String tipoCI; 
    private String rutaImagen;
    private int precio;

    public Componentes() {
    }
}