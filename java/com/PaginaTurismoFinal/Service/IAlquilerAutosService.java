/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PaginaTurismoFinal.Service;

import com.PaginaTurismoFinal.entity.AlquilerAutos;
import java.util.List;


/**
 *
 * @author Andra Mckenzie Araya
 */
public interface IAlquilerAutosService {

    public List<AlquilerAutos> getAllnombre_autos();

    public AlquilerAutos getnombre_autosById(long id);

    public AlquilerAutos savenombre_autos(AlquilerAutos nombre_autos);

    public void deletenombre_autos(long id);
}
