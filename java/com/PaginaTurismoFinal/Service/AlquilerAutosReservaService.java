/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PaginaTurismoFinal.Service;

import com.PaginaTurismoFinal.Repository.AlquilerAutosReservaRepository;
import com.PaginaTurismoFinal.entity.AlquilerAutosReserva;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andra Mckenzie Araya
 */
@Service
public class AlquilerAutosReservaService implements IAlquilerAutosReservaService {

    @Autowired
    private AlquilerAutosReservaRepository alquilerautosReservaRepository;

    @Override
    public List<AlquilerAutosReserva> getAllalquilerautosr() {
        return (List<AlquilerAutosReserva>) alquilerautosReservaRepository.findAll();
    }

    @Override
    public AlquilerAutosReserva getalquilerautosrById(long id) {
        return alquilerautosReservaRepository.findById(id).orElse(null);
    }

    @Override
    public AlquilerAutosReserva savealquilerautosr(AlquilerAutosReserva autosReserva) {
        return alquilerautosReservaRepository.save(autosReserva);
    }

    @Override
    public void deletealquilerautosr(long id) {
        alquilerautosReservaRepository.deleteById(id);
    }

    @Override
    public List<AlquilerAutosReserva> listAll(String palabraClave) {
        if (palabraClave != null) {
            return alquilerautosReservaRepository.findAllCliente(palabraClave);
        }
        return (List<AlquilerAutosReserva>) alquilerautosReservaRepository.findAll();
    }

}
