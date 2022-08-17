/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Pagina_Turismo.Pagina_Turismo.service;

;
import com.Pagina_Turismo.Pagina_Turismo.entity.Audiencia;
import java.util.List;

/**
 *
 * @author fabri
 */


public interface IAudienciaService {

    public List<Audiencia> getAllRestaurantes();

    public Audiencia getRestaurantesById(long id);

    public void saveRestaurantes(Audiencia restaurantes);

    public void delete(long id);

}
