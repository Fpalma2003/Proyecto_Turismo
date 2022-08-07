/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_TurismoCLONE.Proyecto_Turismo.service;
import Proyecto_TurismoCLONE.Proyecto_Turismo.entity.ActividadesAu;
import Proyecto_TurismoCLONE.Proyecto_Turismo.repository.ActividadesAuRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Andra Mckenzie Araya
 */
public class ActividadesAuService implements IActividadesAuService {
 @Autowired
    private ActividadesAuRepository actividadesauRepository;
 
    @Override
    public List<ActividadesAu> getAllActividades() {
        return (List<ActividadesAu>) actividadesauRepository;
    }

    @Override
    public ActividadesAu getActividadesById(long id) {
        return actividadesauRepository.findById(id).orElse(null);
    }

    @Override
    public void saveActividadesAu(ActividadesAu actividades) {
        actividadesauRepository.save(actividades);
    }

    @Override
    public void delete(long id) {
        actividadesauRepository.deleteById(id);
    }

    @Override
    public ActividadesAu findByNombre(String nombre) {
        return actividadesauRepository.findByNombre(nombre);
    }
    
}
