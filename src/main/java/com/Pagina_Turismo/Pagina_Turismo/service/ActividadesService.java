/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pagina_Turismo.Pagina_Turismo.service;

import com.Pagina_Turismo.Pagina_Turismo.entity.Actividades;
import com.Pagina_Turismo.Pagina_Turismo.repository.ActividadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadesService implements IActividadesService {

    @Autowired
    private ActividadesRepository actividadesRepository;

    @Override
    public List<Actividades> getAllActividades() {
        return (List<Actividades>) actividadesRepository.findAll();
    }

    @Override
    public Actividades getActividadesById(long id) {
        return actividadesRepository.findById(id).orElse(null);
    }

    @Override
    public Actividades saveActividades(Actividades actividades) {
        return actividadesRepository.save(actividades);
    }

    @Override
    public void deleteActividad(long id) {
        actividadesRepository.deleteById(id);
    }

    @Override
    public Actividades findByNombre(String nombre) {
        return actividadesRepository.findByNombre(nombre);
    }

}
