/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PaginaTurismoFinal.Service;

import com.PaginaTurismoFinal.entity.Restaurante;
import java.util.List;

public interface IRestauranteService {

    public List<Restaurante> getAllNombre_rest();

    public Restaurante getNombre_restById(long id);

    public Restaurante saveNombre_rest(Restaurante nombre_rest);

    public void deleteNombre_rest(long id);

}
