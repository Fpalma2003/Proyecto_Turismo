/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PaginaTurismoFinal.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ala11
 */
@Entity
@Table(name = "agenciasreserva")
public class AgenciasReserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String agenciar;
    private String fecha_agencia;
    private String hora_agencia;
    private String cantidad_personas_agencia;
    
    private String cliente_agencias;

    public String getCliente_agencias() {
        return cliente_agencias;
    }

    public void setCliente_agencias(String cliente_agencias) {
        this.cliente_agencias = cliente_agencias;
    }
    
    
    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAgenciar() {
        return agenciar;
    }

    public void setAgenciar(String agenciar) {
        this.agenciar = agenciar;
    }

    public String getFecha_agencia() {
        return fecha_agencia;
    }

    public void setFecha_agencia(String fecha_agencia) {
        this.fecha_agencia = fecha_agencia;
    }

    public String getHora_agencia() {
        return hora_agencia;
    }

    public void setHora_agencia(String hora_agencia) {
        this.hora_agencia = hora_agencia;
    }

    public String getCantidad_personas_agencia() {
        return cantidad_personas_agencia;
    }

    public void setCantidad_personas_agencia(String cantidad_personas_agencia) {
        this.cantidad_personas_agencia = cantidad_personas_agencia;
    }

}
