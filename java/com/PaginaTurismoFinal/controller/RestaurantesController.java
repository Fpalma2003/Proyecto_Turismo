/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PaginaTurismoFinal.controller;

import com.PaginaTurismoFinal.entity.Restaurante;
import com.PaginaTurismoFinal.Service.IRestauranteService;
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
 * @author fabri
 */
@Controller
public class RestaurantesController {

    @Autowired
    private IRestauranteService restauranteService;

    @GetMapping("/Restaurantes")
    public String indexRestaurantes(Model model) {
        List<Restaurante> listaRest = restauranteService.getAllNombre_rest();
        model.addAttribute("titulo", "Tabla Restaurantes");/*donde en el html encuentre "titulo" lo va a sustituir por 
        "Tabla Persona" */
        model.addAttribute("Restaurantes", listaRest);/*donde en el html encuentre "personas" lo va a sustituir por 
        listaPersona (line 26) */
        return "restaurantes";//devolvera html persona
    }

    //Metodo que crear una nueva persona
    @GetMapping("/restauranteN")//cuando se usa ese url pasa lo de abajo
    public String crearRestaurante(Model model) {//model permite pasar informacion a un html
        model.addAttribute("Restaurantes", new Restaurante());//creamos un objeto nuevo tipo persona para poder crear la fila
        return "crearRestaurante";//devolvera html crear
    }

    //Metodo que guardar la nueva persona y su info
    @PostMapping("/saveRestaurante")//cuando se usa ese url pasa lo de abajo
    public String guardarRestaurante(@ModelAttribute Restaurante restaurante) {//enviar informacion a mi metodo 
        restauranteService.saveNombre_rest(restaurante);//asi lo guardo en la base de datos
        return "redirect:/restaurantes";
    }

    //Metodo que edita
    @GetMapping("/editRestaurante/{id}")//cuando se usa ese url pasa lo de abajo y le estoy especificando que quiero edutar por el id
    public String editarRestaurante(@PathVariable("id") Long idRestaurante, Model model) {//enviar informacion a mi metodo 
        Restaurante act = restauranteService.getNombre_restById(idRestaurante);
        List<Restaurante> listActividades = restauranteService.getAllNombre_rest();
        model.addAttribute("ReservacionRestaurante", act);//ya no creamos el objeto por que el objeto lo creamos en la linea 64
        model.addAttribute("dropdownRest", listActividades);
        return "editarRestaurante";//redirige a persona
    }

    //Metodo que elimina
    @GetMapping("/deleteRestaurante/{id}")//cuando se usa ese url pasa lo de abajo y le estoy especificando que quiero edutar por el id
    public String eliminarRestaurante(@PathVariable("id") Long idRestaurantes) {//enviar informacion a mi metodo 
        restauranteService.deleteNombre_rest(idRestaurantes);
        return "redirect:/restaurantes";//redirige a persona
    }
}
