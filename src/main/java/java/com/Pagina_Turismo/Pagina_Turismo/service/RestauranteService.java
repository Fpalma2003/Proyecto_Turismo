package com.Pagina_Turismo.Pagina_Turismo.service;

import com.Pagina_Turismo.Pagina_Turismo.entity.Restaurante;
import com.Pagina_Turismo.Pagina_Turismo.repository.RestauranteRepository;
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
    public List<Restaurante> getAllRestaurantes() {
        return (List<Restaurante>) restauranteRepository.findAll();
    }

    @Override
    public Restaurante getRestaurantesById(long id) {
        return restauranteRepository.findById(id).orElse(null);
    }

    @Override
    public Restaurante saveRestaurantes(Restaurante restaurante) {
        return restauranteRepository.save(restaurante);
    }

    @Override
    public void deleteRestaurantes(long id) {
        restauranteRepository.deleteById(id);
    }

    @Override
    public Restaurante findByNombreRest(String nombreRest) {
        return restauranteRepository.findByNombreRest(nombreRest);
    }

}
