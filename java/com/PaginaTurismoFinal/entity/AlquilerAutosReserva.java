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
 * @author Andra Mckenzie Araya
 */
@Entity
@Table(name = "alquilerautosreserva")
public class AlquilerAutosReserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String cliente_autos;
    private String alquilerautosr;
    private String fecha_alquilerautos;
    private String hora_alquilerautos;
    private int cantidad_pasajeros;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAlquilerautosr() {
        return alquilerautosr;
    }

    public void setAlquilerautosr(String alquilerautosr) {
        this.alquilerautosr = alquilerautosr;
    }

    public String getFecha_alquilerautos() {
        return fecha_alquilerautos;
    }

    public void setFecha_alquilerautos(String fecha_alquilerautos) {
        this.fecha_alquilerautos = fecha_alquilerautos;
    }

    public String getHora_alquilerautos() {
        return hora_alquilerautos;
    }

    public void setHora_alquilerautos(String hora_alquilerautos) {
        this.hora_alquilerautos = hora_alquilerautos;
    }

    public int getCantidad_pasajeros() {
        return cantidad_pasajeros;
    }

    public void setCantidad_pasajeros(int cantidad_pasajeros) {
        this.cantidad_pasajeros = cantidad_pasajeros;
    }

    public String getCliente_autos() {
        return cliente_autos;
    }

    public void setCliente_autos(String cliente_autos) {
        this.cliente_autos = cliente_autos;
    }

}
