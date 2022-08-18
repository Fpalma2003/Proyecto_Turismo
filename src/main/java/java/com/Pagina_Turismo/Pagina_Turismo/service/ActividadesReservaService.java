/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pagina_Turismo.Pagina_Turismo.service;

import com.Pagina_Turismo.Pagina_Turismo.entity.ActividadesReserva;
import com.Pagina_Turismo.Pagina_Turismo.repository.ActividadesReservaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadesReservaService implements IActividadesReservaService {

    @Autowired
    private ActividadesReservaRepository actividadesReservaRepository;

    @Override
    public List<ActividadesReserva> getAllActividadesReserva() {
        return (List<ActividadesReserva>) actividadesReservaRepository.findAll();
    }

    @Override
    public ActividadesReserva getActividadesReservaById(long id) {
        return actividadesReservaRepository.findById(id).orElse(null);
    }

    @Override
    public ActividadesReserva saveActividadesReserva(ActividadesReserva actividadesReserva) {
        return actividadesReservaRepository.save(actividadesReserva);
    }

    @Override
    public void deleteActividadReserva(long id) {
        actividadesReservaRepository.deleteById(id);
    }

}
