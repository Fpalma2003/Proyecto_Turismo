package com.Pagina_Turismo.Pagina_Turismo.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "restaurantes")
public class Restaurante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String nombreRest;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreRest() {
        return nombreRest;
    }

    public void setNombreRest(String nombreRest) {
        this.nombreRest = nombreRest;
    }

}
