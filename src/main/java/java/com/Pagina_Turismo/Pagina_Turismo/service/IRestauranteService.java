/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Pagina_Turismo.Pagina_Turismo.service;

import com.Pagina_Turismo.Pagina_Turismo.entity.Restaurante;
import java.util.List;

public interface IRestauranteService {

    public List<Restaurante> getAllRestaurantes();

    public Restaurante getRestaurantesById(long id);

    public Restaurante saveRestaurantes(Restaurante restaurante);

    public void deleteRestaurantes(long id);

    public Restaurante findByNombreRest(String nombreRest);

}
