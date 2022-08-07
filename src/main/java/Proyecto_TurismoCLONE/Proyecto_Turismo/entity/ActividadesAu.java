/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_TurismoCLONE.Proyecto_Turismo.entity;

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
@Table(name = "actividadesau")
public class ActividadesAu implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ubicacion;
    private int nivelintensidad;

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getNivelIntensidad() {
        return nivelintensidad;
    }

    public void setNivelIntensidad(int nivelintensidad) {
        this.nivelintensidad = nivelintensidad;
    }

}
