/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LightningTech.domain;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *
 * @author Maik
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "metodos_pago")
public class MetodoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombrePropietario;
    private String numeroTarjeta;
    private String ccv;
    private String fechaVencimiento;
    private String direccion;
    private String provincia;
    private String canton;
    private String codigoPostal;

        public MetodoPago(Long id, String nombrePropietario, String numeroTarjeta, String ccv, String fechaVencimiento, String direccion, String provincia, String canton, String codigoPostal) {
            this.id = id;
            this.nombrePropietario = nombrePropietario;
            this.numeroTarjeta = numeroTarjeta;
            this.ccv = ccv;
            this.fechaVencimiento = fechaVencimiento;
            this.direccion = direccion;
            this.provincia = provincia;
            this.canton = canton;
            this.codigoPostal = codigoPostal;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNombrePropietario() {
            return nombrePropietario;
        }

        public void setNombrePropietario(String nombrePropietario) {
            this.nombrePropietario = nombrePropietario;
        }

        public String getNumeroTarjeta() {
            return numeroTarjeta;
        }

        public void setNumeroTarjeta(String numeroTarjeta) {
            this.numeroTarjeta = numeroTarjeta;
        }

        public String getCcv() {
            return ccv;
        }

        public void setCcv(String ccv) {
            this.ccv = ccv;
        }

        public String getFechaVencimiento() {
            return fechaVencimiento;
        }

        public void setFechaVencimiento(String fechaVencimiento) {
            this.fechaVencimiento = fechaVencimiento;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getProvincia() {
            return provincia;
        }

        public void setProvincia(String provincia) {
            this.provincia = provincia;
        }

        public String getCanton() {
            return canton;
        }

        public void setCanton(String canton) {
            this.canton = canton;
        }

        public String getCodigoPostal() {
            return codigoPostal;
        }

        public void setCodigoPostal(String codigoPostal) {
            this.codigoPostal = codigoPostal;
        }

    
}
