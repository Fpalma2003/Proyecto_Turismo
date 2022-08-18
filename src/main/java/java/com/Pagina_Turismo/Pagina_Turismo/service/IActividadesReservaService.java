/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Pagina_Turismo.Pagina_Turismo.service;

import com.Pagina_Turismo.Pagina_Turismo.entity.ActividadesReserva;
import java.util.List;

/**
 *
 * @author ala11
 */
public interface IActividadesReservaService {

    public List<ActividadesReserva> getAllActividadesReserva();

    public ActividadesReserva getActividadesReservaById(long id);

    public ActividadesReserva saveActividadesReserva(ActividadesReserva actividadesReserva);

    public void deleteActividadReserva(long id);

}
