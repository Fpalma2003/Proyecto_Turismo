/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pagina_Turismo.Pagina_Turismo.service;

import com.Pagina_Turismo.Pagina_Turismo.entity.AgenciasLocales;
import java.util.List;

/**
 *
 * @author Andra Mckenzie Araya
 */
public interface IAgenciasLocalesService {

    public List<AgenciasLocales> getAllAgenciasLocales();

    public AgenciasLocales getAgenciasLocalesById(long id);

    public AgenciasLocales saveAgenciasLocales(AgenciasLocales agenciaslocales);

    public void deleteAgenciasLocales(long id);

    public AgenciasLocales findByNomAgenciaLocal(String nomAgencialocal);
}
