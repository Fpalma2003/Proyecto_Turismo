/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pagina_Turismo.Pagina_Turismo.controller;

import com.Pagina_Turismo.Pagina_Turismo.entity.RestaurantesReserva;
import com.Pagina_Turismo.Pagina_Turismo.service.IRestaurantesReservaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Andra Mckenzie Araya
 */
@Controller
public class RestaurantesReservaController {

    @Autowired
    private IRestaurantesReservaService restaurantesReservaService;

    @GetMapping("/reservacionRestaurantes")
    public String indexRestaurantesReserva(Model model) {
        List<RestaurantesReserva> listaReser = restaurantesReservaService.getAllRestaurantesReserva();
        model.addAttribute("titulo", "Reservaciones Restaurantes");
        model.addAttribute("RestaurantesReserva", listaReser);
        return "RestaurantesR";
    }

    @GetMapping("/nuevaReservacionRestaurantes")
    public String crearReservacionRestaurante(Model model) {
        model.addAttribute("ReservacionRestaurante", new RestaurantesReserva());
        return "nuevaReservacionRestaurantes";
    }

    @PostMapping("/saveReservacionRestaurantes")
    public String guardarReservacionRestaurante(@ModelAttribute RestaurantesReserva restaurantesReserva) {
        restaurantesReservaService.saveRestaurantesReserva(restaurantesReserva);
        return "redirect:/reservacionRestaurantes";
    }

    @GetMapping("/editReservaRestaurante/{id}")
    public String editarReservaRestaurantes(@PathVariable("id") Long idRestauranteReserva, Model model) {
        model.addAttribute("ReservacionRestaurante", new RestaurantesReserva());
        restaurantesReservaService.deleteRestauranteReserva(idRestauranteReserva);
        return "nuevaReservacionRestaurantes";
    }

    @GetMapping("/cancelarReservacionRestaurante/{id}")
    public String cancelarReservacionRestaurante(@PathVariable("id") Long idRestaurantesReserva) {
        restaurantesReservaService.deleteRestauranteReserva(idRestaurantesReserva);
        return "redirect:/reservacionRestaurantes";
    }
}
