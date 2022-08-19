/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pagina_Turismo.Pagina_Turismo.service;

import com.Pagina_Turismo.Pagina_Turismo.entity.AgenciasLocales;
import com.Pagina_Turismo.Pagina_Turismo.repository.AgenciasLocalesRepository;
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
    public List<AgenciasLocales> getAllAgenciasLocales() {
        return (List<AgenciasLocales>) agenciaslocalesRepository.findAll();
    }

    @Override
    public AgenciasLocales getAgenciasLocalesById(long id) {
        return agenciaslocalesRepository.findById(id).orElse(null);
    }

    @Override
    public AgenciasLocales saveAgenciasLocales(AgenciasLocales agenciaslocales) {
        return agenciaslocalesRepository.save(agenciaslocales);
    }

    @Override
    public void deleteAgenciasLocales(long id) {
        agenciaslocalesRepository.deleteById(id);
    }

    @Override
    public AgenciasLocales findByNomAgenciaLocal(String nomAgencialocal) {
        return agenciaslocalesRepository.findBynomAgenciaLocal(nomAgencialocal);
    }

}
