/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Proyecto_TurismoCLONE.Proyecto_Turismo.repository;

import Proyecto_TurismoCLONE.Proyecto_Turismo.entity.Audiencia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fabri
 */
@Repository
public interface AudienciaRepository extends CrudRepository<Audiencia, Long> {

    Audiencia findByNombre(String nombre);
}
