/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_TurismoCLONE.Proyecto_Turismo.service;

import Proyecto_TurismoCLONE.Proyecto_Turismo.entity.AgenciasAu;
import java.util.List;

/**
 *
 * @author Andra Mckenzie Araya
 */
public interface IAgenciasAuService {
    
    public List<AgenciasAu> getAllAgencias();

    public AgenciasAu getAgenciasById(long id);

    public void saveAgencias(AgenciasAu agenciaslocales);

    public void delete(long id);

    public AgenciasAu findByNombre(String nombre);
}