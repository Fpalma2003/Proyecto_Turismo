/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PaginaTurismoFinal.Service;

import com.PaginaTurismoFinal.Repository.AlquilerAutosRepository;
import com.PaginaTurismoFinal.entity.AlquilerAutos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andra Mckenzie Araya
 */
@Service
public class AlquilerAutosService implements IAlquilerAutosService {

    @Autowired
    private AlquilerAutosRepository alquilerautosRepository;

    @Override
    public List<AlquilerAutos> getAllnombre_autos() {
        return (List<AlquilerAutos>) alquilerautosRepository.findAll();
    }

    @Override
    public AlquilerAutos getnombre_autosById(long id) {
        return alquilerautosRepository.findById(id).orElse(null);
    }

    @Override
    public AlquilerAutos savenombre_autos(AlquilerAutos alquilerautos) {
        return alquilerautosRepository.save(alquilerautos);
    }

    @Override
    public void deletenombre_autos(long id) {
        alquilerautosRepository.deleteById(id);
    }
}
