/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pagina_Turismo.Pagina_Turismo.service;

import com.Pagina_Turismo.Pagina_Turismo.entity.personas;
import com.Pagina_Turismo.Pagina_Turismo.repository.PersonasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andra Mckenzie Araya
 */
@Service
public class PersonasService implements IPersonasService {

    @Autowired
    private PersonasRepository personasRepository;

    @Override
    public List<personas> getAllpersonas() {
        return (List<personas>) personasRepository.findAll();
    }

    @Override
    public personas getpersonasById(long id) {
        return personasRepository.findById(id).orElse(null);
    }

    @Override
    public void savepersonas(personas personas) {
        personasRepository.save(personas);
    }

    @Override
    public void delete(long id) {
        personasRepository.deleteById(id);
    }

    @Override
    public personas findByNombre(String nombre) {
        return personasRepository.findByNombre(nombre);
    }

}
