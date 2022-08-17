/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pagina_Turismo.Pagina_Turismo.service;

import com.Pagina_Turismo.Pagina_Turismo.entity.Actividades;
import java.util.List;

public interface IActividadesService {

    public List<Actividades> getAllActividades();

    public Actividades getActividadesById(long id);

    public Actividades saveActividades(Actividades actividades);

    public void deleteActividad(long id);

    public Actividades findByNombre(String nombre);

}
