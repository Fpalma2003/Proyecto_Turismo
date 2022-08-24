/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PaginaTurismoFinal.Repository;

import com.PaginaTurismoFinal.entity.AgenciasReserva;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgenciasReservaRepository extends CrudRepository<AgenciasReserva, Long> {
    
    @Query("SELECT p FROM AgenciasReserva p WHERE p.cliente_agencias LIKE %?1%")
    public List<AgenciasReserva> findAllCliente(String palabraClave);
    
}
