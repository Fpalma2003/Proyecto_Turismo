/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PaginaTurismoFinal.Service;

import com.PaginaTurismoFinal.entity.AgenciasLocales;
import java.util.List;

/**
 *
 * @author Andra Mckenzie Araya
 */
public interface IAgenciasLocalesService {

    public List<AgenciasLocales> getAllNom_Agencia_Local();

    public AgenciasLocales getNom_Agencia_LocalById(long id);

    public AgenciasLocales saveNom_Agencia_Local(AgenciasLocales agenciaslocales);

    public void deleteNom_Agencia_Local(long id);

  
}
