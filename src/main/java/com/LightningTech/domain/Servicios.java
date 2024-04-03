package com.LightningTech.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "servicios")
public class Servicios implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_servicios")
    private Long idServicios;

    private String nombre;
    private String valor;
    private String descripcion;
    private String mensaje;

    public Servicios() {
        
    }
    
}