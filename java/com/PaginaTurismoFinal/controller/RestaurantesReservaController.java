/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PaginaTurismoFinal.controller;

import com.PaginaTurismoFinal.Service.IRestauranteService;
import com.PaginaTurismoFinal.entity.RestaurantesReserva;
import com.PaginaTurismoFinal.Service.IRestaurantesReservaService;
import com.PaginaTurismoFinal.entity.Restaurante;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
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

    @Autowired
    private IRestauranteService restauranteService;

    @GetMapping("/reservacionRestaurantes")
    public String indexRestaurantesReserva(Model model) {
        List<RestaurantesReserva> listaReser = restaurantesReservaService.getAllRestaurantesReserva();
        model.addAttribute("titulo", "Reservaciones Restaurantes");
        model.addAttribute("RestaurantesReserva", listaReser);
        return "RestaurantesR";
    }

    @GetMapping("/RestaurantesUsuario")
    public String indexRestaurantesUsuario(Model model) {
        String palabraClave = SecurityContextHolder.getContext().getAuthentication().getName();
        List<RestaurantesReserva> listaReser = restaurantesReservaService.listAllClientesRest(palabraClave);
        model.addAttribute("titulo", "Reservaciones Restaurantes");
        model.addAttribute("RestaurantesReserva", listaReser);

        return "RestaurantesR";
    }

    @GetMapping("/nuevaReservacionRestaurantes")
    public String crearReservacionRestaurante(Model model) {
        String palabraClave = SecurityContextHolder.getContext().getAuthentication().getName();
        List<Restaurante> listActividades = restauranteService.getAllNombre_rest();
        model.addAttribute("ReservacionRestaurante", new RestaurantesReserva());
        model.addAttribute("dropdownRest", listActividades);
        model.addAttribute("usuario", palabraClave);
        return "nuevaReservacionRestaurantes";
    }

    @PostMapping("/saveReservacionRestaurantes")
    public String guardarReservacionRestaurante(@ModelAttribute RestaurantesReserva restaurantesReserva) {
        restaurantesReservaService.saveRestaurantesReserva(restaurantesReserva);
        return "redirect:/RestaurantesUsuario";
    }

    @GetMapping("/editReservaRestaurante/{id}")
    public String editarReservaRestaurantes(@PathVariable("id") Long idRestauranteReserva, Model model) {
        RestaurantesReserva act = restaurantesReservaService.getRestaurantesReservaById(idRestauranteReserva);
        List<Restaurante> listActividades = restauranteService.getAllNombre_rest();
        model.addAttribute("ReservacionRestaurante", act);//ya no creamos el objeto por que el objeto lo creamos en la linea 64
        model.addAttribute("dropdownRest", listActividades);
        return "editarReservacionRestaurantes";
    }

    @GetMapping("/cancelarReservacionRestaurante/{id}")
    public String cancelarReservacionRestaurante(@PathVariable("id") Long idRestaurantesReserva) {
        restaurantesReservaService.deleteRestauranteReserva(idRestaurantesReserva);
        return "redirect:/RestaurantesUsuario";
    }
}
