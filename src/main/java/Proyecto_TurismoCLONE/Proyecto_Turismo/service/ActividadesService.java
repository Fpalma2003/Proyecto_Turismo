/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_TurismoCLONE.Proyecto_Turismo.service;

import Proyecto_TurismoCLONE.Proyecto_Turismo.entity.Actividades;
import Proyecto_TurismoCLONE.Proyecto_Turismo.repository.ActividadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andra Mckenzie Araya
 */
@Service
public class ActividadesService implements IActividadesService {

    @Autowired
    private ActividadesRepository actividadesRepository;

    @Override
    public List<Actividades> listActividades() {
        return (List<Actividades>) actividadesRepository;
    }

}
