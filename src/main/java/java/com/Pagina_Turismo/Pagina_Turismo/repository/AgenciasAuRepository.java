/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pagina_Turismo.Pagina_Turismo.repository;

import com.Pagina_Turismo.Pagina_Turismo.entity.AgenciasAu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Andra Mckenzie Araya
 */
@Repository
public interface AgenciasAuRepository extends CrudRepository<AgenciasAu, Long> {
   
}