/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PaginaTurismoFinal.Service;

import com.PaginaTurismoFinal.entity.AgenciasReserva;
import java.util.List;

/**
 *
 * @author ala11
 */
public interface IAgenciasReservaService {

    public List<AgenciasReserva> getAllAgenciasReserva();

    public AgenciasReserva getAgenciasReservaById(long id);

    public AgenciasReserva saveAgenciasReserva(AgenciasReserva agenciasReserva);

    public void deleteAgenciasReserva(long id);
    
    public List<AgenciasReserva> listAllClienteAgencia(String palabraClave);
}
