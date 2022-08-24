/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PaginaTurismoFinal.Service;

import com.PaginaTurismoFinal.entity.AlquilerAutosReserva;
import java.util.List;

/**
 *
 * @author Andra Mckenzie Araya
 */
public interface IAlquilerAutosReservaService {

    public List<AlquilerAutosReserva> getAllalquilerautosr();

    public AlquilerAutosReserva getalquilerautosrById(long id);

    public AlquilerAutosReserva savealquilerautosr(AlquilerAutosReserva alquilerautosr);

    public void deletealquilerautosr(long id);
    
    public List<AlquilerAutosReserva> listAll(String palabraClave);
}


