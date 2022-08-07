/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_TurismoCLONE.Proyecto_Turismo.controller;

import Proyecto_TurismoCLONE.Proyecto_Turismo.entity.Audiencia;
import Proyecto_TurismoCLONE.Proyecto_Turismo.entity.Restaurante;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import Proyecto_TurismoCLONE.Proyecto_Turismo.service.IAudienciaService;
import Proyecto_TurismoCLONE.Proyecto_Turismo.service.IRestauranteService;

/**
 *
 * @author fabri
 */
@Controller
public class RestaurantesController {

    @Autowired
    private IAudienciaService audienciaService;

    @Autowired
    private IRestauranteService restauranteService;

    @GetMapping("/Restaurantes")
    public String index(Model model) {
        List<Audiencia> listaRest = audienciaService.getAllRestaurantes();
        model.addAttribute("titulo", "Tabla Restaurantes");/*donde en el html encuentre "titulo" lo va a sustituir por 
        "Tabla Persona" */
        model.addAttribute("personas", listaRest);/*donde en el html encuentre "personas" lo va a sustituir por 
        listaPersona (line 26) */
        return "restaurantes";//devolvera html persona
    }

    //Metodo que crear una nueva persona
    @GetMapping("/restauranteN")//cuando se usa ese url pasa lo de abajo
    public String crearRestaurante(Model model) {//model permite pasar informacion a un html
        List<Restaurante> listaRest = restauranteService.listRest();//pasamos toda la lista pais al html
        model.addAttribute("Restaurantes", new Audiencia());//creamos un objeto nuevo tipo persona para poder crear la fila
        model.addAttribute("restaurante", listaRest);/*donde en el html encuentre "paises" lo va a sustituir por 
        listaPaises (line 41) esto para poder hacer el dropdowm*/
        return "crear";//devolvera html crear
    }

    //Metodo que guardar la nueva persona y su info
    @PostMapping("/save")//cuando se usa ese url pasa lo de abajo
    public String guardarRestaurante(@ModelAttribute Audiencia restaurante) {//enviar informacion a mi metodo 
        audienciaService.saveRestaurantes(restaurante);//asi lo guardo en la base de datos
        return "redirect:/restaurante";
    }

    //Metodo que edita
    @GetMapping("/editRestaurante/{id}")//cuando se usa ese url pasa lo de abajo y le estoy especificando que quiero edutar por el id
    public String editarRestaurante(@PathVariable("id") Long idRestaurante, Model model) {//enviar informacion a mi metodo 
        Audiencia restaurante = audienciaService.getRestaurantesById(idRestaurante);
        List<Restaurante> listaRest = restauranteService.listRest();
        model.addAttribute("restaurante", restaurante);//ya no creamos el objeto por que el objeto lo creamos en la linea 64
        model.addAttribute("restaurante", listaRest);
        return "crear";//redirige a persona
    }

    //Metodo que elimina
    @GetMapping("/delete/{id}")//cuando se usa ese url pasa lo de abajo y le estoy especificando que quiero edutar por el id
    public String eliminarRestaurante(@PathVariable("id") Long idRestaurantes) {//enviar informacion a mi metodo 
        audienciaService.delete(idRestaurantes);
        return "redirect:/restaurantes";//redirige a persona
    }
}
