package Proyecto_TurismoCLONE.Proyecto_Turismo.service;

import Proyecto_TurismoCLONE.Proyecto_Turismo.entity.Audiencia;
import Proyecto_TurismoCLONE.Proyecto_Turismo.entity.Restaurante;
import Proyecto_TurismoCLONE.Proyecto_Turismo.repository.RestauranteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ala11
 */
@Service
public class RestauranteService implements IRestauranteService {

    @Autowired
    private RestauranteRepository restauranteRepository;

    @Override
    public List<Restaurante> listRest() {
        return (List<Restaurante>) restauranteRepository.findAll();
    }

}
