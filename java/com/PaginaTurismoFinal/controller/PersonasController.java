package com.PaginaTurismoFinal.controller;



import com.PaginaTurismoFinal.entity.personas;
import com.PaginaTurismoFinal.Service.IPersonasService;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Andra Mckenzie Araya
 */
@Controller//definimos que es tipo controller
public class PersonasController {

    @Autowired
    private IPersonasService personaService;

    //Metodo que arrastra los datos de base de datos al htnml
    @GetMapping("/personas")//cuando se usa ese url pasa lo de abajo
    public String indexPersonas(Model model) {//model permite pasar informacion a un html
        List<personas> listaPersona = personaService.getAllpersonas();//pasamos toda la lista personas al html
        model.addAttribute("titulo", "Tabla Personas");/*donde en el html encuentre "titulo" lo va a sustituir por 
        "Tabla Persona" */
        model.addAttribute("personas", listaPersona);/*donde en el html encuentre "personas" lo va a sustituir por 
        listaPersona (line 26) */
        return "personas";//devolvera html persona
    }

    //Metodo que crear una nueva persona
    @GetMapping("/personaN")//cuando se usa ese url pasa lo de abajo
    public String crearPersona(Model model) {//model permite pasar informacion a un html
        model.addAttribute("personas", new personas());//creamos un objeto nuevo tipo persona para poder crear la fila
        return "crearPersona";//devolvera html crear
    }

    //Metodo que guardar la nueva persona y su info
    @PostMapping("/savePersonas")//cuando se usa ese url pasa lo de abajo
    public String guardarPersona(@ModelAttribute personas persona) {//enviar informacion a mi metodo 
        personaService.savepersonas(persona);//asi lo guardo en la base de datos
        return "redirect:/personas";//redirige a persona
    }

    //Metodo que edita
    @GetMapping("/editPersona/{id}")//cuando se usa ese url pasa lo de abajo y le estoy especificando que quiero edutar por el id
    public String editarPersona(@PathVariable("id") Long idPersona, Model model) {//enviar informacion a mi metodo 
        personas persona = personaService.getpersonasById(idPersona);
        model.addAttribute("persona", persona);//ya no creamos el objeto por que el objeto lo creamos en la linea 64
        return "crear";//redirige a persona
    }

    //Metodo que elimina
    @GetMapping("/deletePersonas/{id}")//cuando se usa ese url pasa lo de abajo y le estoy especificando que quiero edutar por el id
    public String eliminarPersona(@PathVariable("id") Long idPersona) {//enviar informacion a mi metodo 
        personaService.delete(idPersona);
        return "redirect:/persona";//redirige a persona
    }

}
