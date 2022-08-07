/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_TurismoCLONE.Proyecto_Turismo.service;

import Proyecto_TurismoCLONE.Proyecto_Turismo.entity.ActividadesAu;
import java.util.List;

/**
 *
 * @author Andra Mckenzie Araya
 */
public interface IActividadesAuService {
   public List<ActividadesAu> getAllActividades();

    public ActividadesAu getActividadesById(long id);

    public void saveActividadesAu(ActividadesAu actividades);

    public void delete(long id);

    public ActividadesAu findByNombre(String nombre);
}