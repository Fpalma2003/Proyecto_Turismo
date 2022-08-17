/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pagina_Turismo.Pagina_Turismo.service;

import com.Pagina_Turismo.Pagina_Turismo.entity.AgenciasAu;
import com.Pagina_Turismo.Pagina_Turismo.repository.AgenciasAuRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andra Mckenzie Araya
 */
@Service
public class AgenciasAuService implements IAgenciasAuService {

    @Autowired
    private AgenciasAuRepository agenciasauRepository;

    @Override
    public List<AgenciasAu> getAllAgencias() {
        return (List<AgenciasAu>) agenciasauRepository;
    }

    @Override
    public AgenciasAu getAgenciasById(long id) {
        return agenciasauRepository.findById(id).orElse(null);
    }

    @Override
    public void saveAgencias(AgenciasAu agenciaslocales) {
        agenciasauRepository.save(agenciaslocales);
    }

    @Override
    public void delete(long id) {
        agenciasauRepository.deleteById(id);
    }

}
