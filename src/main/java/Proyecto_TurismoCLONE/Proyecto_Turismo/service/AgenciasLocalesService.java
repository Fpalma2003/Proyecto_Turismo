/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_TurismoCLONE.Proyecto_Turismo.service;

import Proyecto_TurismoCLONE.Proyecto_Turismo.entity.AgenciasLocales;
import Proyecto_TurismoCLONE.Proyecto_Turismo.repository.AgenciasLocalesRepository;
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
    public List<AgenciasLocales> listAgencias() {
        return (List<AgenciasLocales>) agenciaslocalesRepository.findAll();
    }

}
