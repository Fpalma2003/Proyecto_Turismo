/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PaginaTurismoFinal.Service;

import com.PaginaTurismoFinal.entity.AgenciasLocales;
import com.PaginaTurismoFinal.Repository.AgenciasLocalesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andra Mckenzie Araya
 */
@Service
public class AgenciasLocalesService implements IAgenciasLocalesService {

    @Autowired
    private AgenciasLocalesRepository agenciaslocalesRepository;

    @Override
    public List<AgenciasLocales> getAllNom_Agencia_Local() {
        return (List<AgenciasLocales>) agenciaslocalesRepository.findAll();
    }

    @Override
    public AgenciasLocales getNom_Agencia_LocalById(long id) {
        return agenciaslocalesRepository.findById(id).orElse(null);
    }

    @Override
    public AgenciasLocales saveNom_Agencia_Local(AgenciasLocales nom_agencia_local) {
        return agenciaslocalesRepository.save(nom_agencia_local);
    }

    @Override
    public void deleteNom_Agencia_Local(long id) {
        agenciaslocalesRepository.deleteById(id);
    }

}
