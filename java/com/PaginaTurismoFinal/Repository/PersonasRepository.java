/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PaginaTurismoFinal.Repository;

import com.PaginaTurismoFinal.entity.personas;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Andra Mckenzie Araya
 */
@Repository
public interface PersonasRepository extends CrudRepository<personas, Long> {

//    @Query("SELECT p FROM Personas p WHERE p.nombre LIKE %?1%")
//    public List<personas> findAllPersonas(String usuario);

    personas findByNombre(String nombre);
}
