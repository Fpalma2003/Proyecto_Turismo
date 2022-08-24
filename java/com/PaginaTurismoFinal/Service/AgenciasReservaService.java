/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PaginaTurismoFinal.Service;

import com.PaginaTurismoFinal.entity.AgenciasReserva;
import com.PaginaTurismoFinal.Repository.AgenciasReservaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ala11
 */
@Service
public class AgenciasReservaService implements IAgenciasReservaService {

    @Autowired
    private AgenciasReservaRepository agenciasReservaRepository;

    @Override
    public List<AgenciasReserva> getAllAgenciasReserva() {
        return (List<AgenciasReserva>) agenciasReservaRepository.findAll();
    }

    @Override
    public AgenciasReserva getAgenciasReservaById(long id) {
        return agenciasReservaRepository.findById(id).orElse(null);
    }

    @Override
    public AgenciasReserva saveAgenciasReserva(AgenciasReserva agenciasReserva) {
        return agenciasReservaRepository.save(agenciasReserva);
    }

    @Override
    public void deleteAgenciasReserva(long id) {
        agenciasReservaRepository.deleteById(id);
    }

    @Override
    public List<AgenciasReserva> listAllClienteAgencia(String palabraClave) {
        if (palabraClave != null) {
            return agenciasReservaRepository.findAllCliente(palabraClave);
        }
        return (List<AgenciasReserva>) agenciasReservaRepository.findAll();
    }

}
