/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PaginaTurismoFinal.Repository;

import com.PaginaTurismoFinal.entity.AlquilerAutos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Andra Mckenzie Araya
 */
@Repository
public interface AlquilerAutosRepository extends CrudRepository<AlquilerAutos, Long> {

}
