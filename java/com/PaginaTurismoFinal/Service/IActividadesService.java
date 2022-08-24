/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PaginaTurismoFinal.Service;

import com.PaginaTurismoFinal.entity.Actividades;
import java.util.List;

public interface IActividadesService {

    public List<Actividades> getAllLocal_Actividades();

    public Actividades getLocal_ActividadesById(long id);

    public Actividades saveLocal_Actividades(Actividades local_actividades);

    public void deleteLocal_Actividades(long id);

}
