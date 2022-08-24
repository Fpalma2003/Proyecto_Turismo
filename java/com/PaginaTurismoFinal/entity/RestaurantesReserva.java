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
@Table(name = "restaurantesreserva")
public class RestaurantesReserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String restaurantesr;
    private String fecha_restaurantes;
    private String hora_restaurantes;
    private int cantidad_personas_restaurantes;
    private String cliente_restaurantes;

    public String getCliente_restaurantes() {
        return cliente_restaurantes;
    }

    public void setCliente_restaurantes(String cliente_restaurantes) {
        this.cliente_restaurantes = cliente_restaurantes;
    }
    
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRestaurantesr() {
        return restaurantesr;
    }

    public void setRestaurantesr(String restaurantesr) {
        this.restaurantesr = restaurantesr;
    }

    public String getFecha_restaurantes() {
        return fecha_restaurantes;
    }

    public void setFecha_restaurantes(String fecha_restaurantes) {
        this.fecha_restaurantes = fecha_restaurantes;
    }

    public String getHora_restaurantes() {
        return hora_restaurantes;
    }

    public void setHora_restaurantes(String hora_restaurantes) {
        this.hora_restaurantes = hora_restaurantes;
    }

    public int getCantidad_personas_restaurantes() {
        return cantidad_personas_restaurantes;
    }

    public void setCantidad_personas_restaurantes(int cantidad_personas_restaurantes) {
        this.cantidad_personas_restaurantes = cantidad_personas_restaurantes;
        
    }
}