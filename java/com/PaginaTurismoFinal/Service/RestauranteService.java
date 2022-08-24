package com.PaginaTurismoFinal.Service;

import com.PaginaTurismoFinal.entity.Restaurante;
import com.PaginaTurismoFinal.Repository.RestauranteRepository;
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
    public List<Restaurante> getAllNombre_rest() {
        return (List<Restaurante>) restauranteRepository.findAll();
    }

    @Override
    public Restaurante getNombre_restById(long id) {
        return restauranteRepository.findById(id).orElse(null);
    }

    @Override
    public Restaurante saveNombre_rest(Restaurante restaurante) {
        return restauranteRepository.save(restaurante);
    }

    @Override
    public void deleteNombre_rest(long id) {
        restauranteRepository.deleteById(id);
    }

}
