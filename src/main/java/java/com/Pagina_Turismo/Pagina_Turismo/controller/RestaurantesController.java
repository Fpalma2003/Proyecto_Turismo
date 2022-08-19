/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pagina_Turismo.Pagina_Turismo.controller;

import com.Pagina_Turismo.Pagina_Turismo.entity.Restaurante;
import com.Pagina_Turismo.Pagina_Turismo.service.IRestauranteService;
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
        List<Restaurante> listaRest = restauranteService.getAllRestaurantes();
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
        restauranteService.saveRestaurantes(restaurante);//asi lo guardo en la base de datos
        return "redirect:/restaurante";
    }

    //Metodo que edita
    @GetMapping("/editRestaurante/{id}")//cuando se usa ese url pasa lo de abajo y le estoy especificando que quiero edutar por el id
    public String editarRestaurante(@PathVariable("id") Long idRestaurante, Model model) {//enviar informacion a mi metodo 
        Restaurante restaurante = restauranteService.getRestaurantesById(idRestaurante);
        model.addAttribute("restaurante", restaurante);//ya no creamos el objeto por que el objeto lo creamos en la linea 64
        return "crear";//redirige a persona
    }

    //Metodo que elimina
    @GetMapping("/delete/{id}")//cuando se usa ese url pasa lo de abajo y le estoy especificando que quiero edutar por el id
    public String eliminarRestaurante(@PathVariable("id") Long idRestaurantes) {//enviar informacion a mi metodo 
        restauranteService.deleteRestaurantes(idRestaurantes);
        return "redirect:/restaurantes";//redirige a persona
    }
}
