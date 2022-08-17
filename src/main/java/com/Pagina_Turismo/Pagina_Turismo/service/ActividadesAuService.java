/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pagina_Turismo.Pagina_Turismo.service;

import com.Pagina_Turismo.Pagina_Turismo.entity.ActividadesAu;
import com.Pagina_Turismo.Pagina_Turismo.repository.ActividadesAuRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadesAuService implements IActividadesAuService {

    @Autowired
    private ActividadesAuRepository actividadesRepository;

    @Override
    public List<ActividadesAu> listActividadesAu() {
        return (List<ActividadesAu>) actividadesRepository.findAll();
    }

}
