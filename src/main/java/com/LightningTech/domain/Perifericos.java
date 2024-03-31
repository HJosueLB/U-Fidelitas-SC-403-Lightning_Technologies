package com.LightningTech.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "perifericos")
public class Perifericos implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_perifericos")
    private Long idPerifericos;

    private String modelo;
    private String marca; 
    private String tipoCI; 
    private String rutaImagen;
    private int precio;

    public Perifericos() {
        
    }
    
}
