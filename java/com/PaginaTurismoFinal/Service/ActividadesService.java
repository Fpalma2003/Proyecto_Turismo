/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PaginaTurismoFinal.Service;

import com.PaginaTurismoFinal.entity.Actividades;
import com.PaginaTurismoFinal.Repository.ActividadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadesService implements IActividadesService {

    @Autowired
    private ActividadesRepository actividadesRepository;

    @Override
    public List<Actividades> getAllLocal_Actividades() {
        return (List<Actividades>) actividadesRepository.findAll();
    }

    @Override
    public Actividades getLocal_ActividadesById(long id) {
        return actividadesRepository.findById(id).orElse(null);
    }

    @Override
    public Actividades saveLocal_Actividades(Actividades actividades) {
        return actividadesRepository.save(actividades);
    }

    @Override
    public void deleteLocal_Actividades(long id) {
        actividadesRepository.deleteById(id);
    }

}
