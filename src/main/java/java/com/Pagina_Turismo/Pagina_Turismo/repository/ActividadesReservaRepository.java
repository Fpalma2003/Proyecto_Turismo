/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Pagina_Turismo.Pagina_Turismo.repository;

import com.Pagina_Turismo.Pagina_Turismo.entity.ActividadesReserva;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ala11
 */
@Repository
public interface ActividadesReservaRepository extends CrudRepository<ActividadesReserva, Long> {
    
    
    
}
