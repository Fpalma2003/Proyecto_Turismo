/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Pagina_Turismo.Pagina_Turismo.service;

import com.Pagina_Turismo.Pagina_Turismo.entity.RestaurantesReserva;
import java.util.List;

/**
 *
 * @author Andra Mckenzie Araya
 */
public interface IRestaurantesReservaService {

    public List<RestaurantesReserva> getAllRestaurantesReserva();

    public RestaurantesReserva getRestaurantesReservaById(long id);

    public RestaurantesReserva saveRestaurantesReserva(RestaurantesReserva restaurantesReserva);

    public void deleteRestauranteReserva(long id);
}
