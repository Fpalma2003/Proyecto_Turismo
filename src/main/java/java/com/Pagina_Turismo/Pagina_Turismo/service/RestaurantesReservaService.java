package com.Pagina_Turismo.Pagina_Turismo.service;

import com.Pagina_Turismo.Pagina_Turismo.entity.RestaurantesReserva;
import com.Pagina_Turismo.Pagina_Turismo.repository.RestaurantesReservaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andra Mckenzie Araya
 */
@Service
public class RestaurantesReservaService implements IRestaurantesReservaService {

    @Autowired
    private RestaurantesReservaRepository restaurantesReservaRepository;

    @Override
    public List<RestaurantesReserva> getAllRestaurantesReserva() {
        return (List<RestaurantesReserva>) restaurantesReservaRepository.findAll();
    }

    @Override
    public RestaurantesReserva getRestaurantesReservaById(long id) {
        return restaurantesReservaRepository.findById(id).orElse(null);
    }

    @Override
    public RestaurantesReserva saveRestaurantesReserva(RestaurantesReserva restaurantesReserva) {
        return restaurantesReservaRepository.save(restaurantesReserva);
    }

    @Override
    public void deleteRestauranteReserva(long id) {
        restaurantesReservaRepository.deleteById(id);
    }

}
