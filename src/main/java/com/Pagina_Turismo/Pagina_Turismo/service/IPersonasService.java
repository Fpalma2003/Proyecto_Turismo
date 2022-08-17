/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Pagina_Turismo.Pagina_Turismo.service;

import com.Pagina_Turismo.Pagina_Turismo.entity.personas;
import java.util.List;

public interface IPersonasService {

    public List<personas> getAllpersonas();

    public personas getpersonasById(long id);

    public void savepersonas(personas personas);

    public void delete(long id);

    public personas findByNombre(String nombre);
}
