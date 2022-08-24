/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PaginaTurismoFinal.Repository;

import com.PaginaTurismoFinal.entity.ActividadesReserva;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ala11
 */
@Repository
public interface ActividadesReservaRepository extends CrudRepository<ActividadesReserva, Long> {
    
        @Query("SELECT p FROM ActividadesReserva p WHERE p.cliente_actividades LIKE %?1%")
    public List<ActividadesReserva> findAllClienteAc(String palabraClave);
    
}
