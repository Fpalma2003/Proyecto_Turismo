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
@Table(name = "actividadesreserva")
public class ActividadesReserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String actividadesr;
    private String fecha_actividades;
    private String hora_actividades;
    private int cantidad_personas_actividades;
    private String cliente_actividades;

    public String getCliente_actividades() {
        return cliente_actividades;
    }

    public void setCliente_actividades(String cliente_actividades) {
        this.cliente_actividades = cliente_actividades;
    }
    
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getActividadesr() {
        return actividadesr;
    }

    public void setActividadesr(String actividadesr) {
        this.actividadesr = actividadesr;
    }

    public String getFecha_actividades() {
        return fecha_actividades;
    }

    public void setFecha_actividades(String fecha_actividades) {
        this.fecha_actividades = fecha_actividades;
    }

    public String getHora_actividades() {
        return hora_actividades;
    }

    public void setHora_actividades(String hora_actividades) {
        this.hora_actividades = hora_actividades;
    }

    public int getCantidad_personas_actividades() {
        return cantidad_personas_actividades;
    }

    public void setCantidad_personas_actividades(int cantidad_personas_actividades) {
        this.cantidad_personas_actividades = cantidad_personas_actividades;
    }

}
