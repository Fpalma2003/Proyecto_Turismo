/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pagina_Turismo.Pagina_Turismo.service;


import com.Pagina_Turismo.Pagina_Turismo.entity.Audiencia;
import com.Pagina_Turismo.Pagina_Turismo.repository.AudienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 *
 * @author fabri
 */
@Service
public class AudienciaService implements IAudienciaService{
    
    @Autowired
    private AudienciaRepository restaurantesRepository;
    
    @Override
    public List<Audiencia> getAllRestaurantes() {
        return (List<Audiencia>) restaurantesRepository;
    }

    @Override
    public Audiencia getRestaurantesById(long id) {
        return restaurantesRepository.findById(id).orElse(null);
    }

    @Override
    public void saveRestaurantes(Audiencia restaurantes) {
        restaurantesRepository.save(restaurantes);
    }

    @Override
    public void delete(long id) {
        restaurantesRepository.deleteById(id);
    }

 
    
}