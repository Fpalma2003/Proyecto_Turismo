/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PaginaTurismoFinal.Repository;

import com.PaginaTurismoFinal.entity.RestaurantesReserva;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Andra Mckenzie Araya
 */
public interface RestaurantesReservaRepository extends CrudRepository<RestaurantesReserva, Long> {

    @Query("SELECT p FROM RestaurantesReserva p WHERE p.cliente_restaurantes LIKE %?1%")
    public List<RestaurantesReserva> findAllCliente(String palabraClave);
}
