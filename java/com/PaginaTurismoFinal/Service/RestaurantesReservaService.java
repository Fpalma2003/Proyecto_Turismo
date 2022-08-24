package com.PaginaTurismoFinal.Service;

import com.PaginaTurismoFinal.entity.RestaurantesReserva;
import com.PaginaTurismoFinal.Repository.RestaurantesReservaRepository;
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

    @Override
    public List<RestaurantesReserva> listAllClientesRest(String palabraClave) {
        if (palabraClave != null) {
            return restaurantesReservaRepository.findAllCliente(palabraClave);
        }
        return (List<RestaurantesReserva>) restaurantesReservaRepository.findAll();
    }

}
