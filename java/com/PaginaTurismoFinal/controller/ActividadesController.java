package com.PaginaTurismoFinal.controller;

import com.PaginaTurismoFinal.entity.Actividades;
import com.PaginaTurismoFinal.Service.IActividadesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ActividadesController {

    @Autowired
    private IActividadesService actividadesService;
    

    //Metodo que arrastra los datos de base de datos al htnml
    @GetMapping("/Actividades")//cuando se usa ese url pasa lo de abajo
    public String indexActividades(Model model) {//model permite pasar informacion a un html
        List<Actividades> listaAct = actividadesService.getAllLocal_Actividades();//pasamos toda la lista actividades al html
        model.addAttribute("titulo", "Tabla Actividades");/*donde en el html encuentre "titulo" lo va a sustituir por 
        "Tabla Actividades" */
        model.addAttribute("Actividades", listaAct);/*donde en el html encuentre "Actividad" lo va a sustituir por 
        listaAct */
        return "Actividades";//devolvera html actividades
    }

    //Metodo que crear una nueva actividad
    @GetMapping("/actividadesN")//cuando se usa ese url pasa lo de abajo
    public String crearActividad(Model model) {//model permite pasar informacion a un html
        List<Actividades> listaActAu = actividadesService.getAllLocal_Actividades();//pasamos toda la lista auxiliar al html
        model.addAttribute("Actividades", new Actividades());//creamos un objeto nuevo tipo actividad para poder crear la fila
        model.addAttribute("Actividades", listaActAu);/*donde en el html encuentre "Actividades" lo va a sustituir por 
        lsitaActAu esto para poder hacer el dropdowm*/
        return "crearActividad";//devolvera html crea r
    }

    //Metodo que guardar la nueva actividad y su info
    @PostMapping("/saveActividad")//cuando se usa ese url pasa lo de abajo
    public String guardarActividad(@ModelAttribute Actividades Actividades) {//enviar informacion a mi metodo 
        actividadesService.saveLocal_Actividades(Actividades);//asi lo guardo en la base de datos
        return "redirect:/Actividades";
    }

    //Metodo que edita
    @GetMapping("/editActividad/{id}")//cuando se usa ese url pasa lo de abajo y le estoy especificando que quiero edutar por el id
    public String editarActividad(@PathVariable("id") Long idActividad, Model model) {//enviar informacion a mi metodo 
        Actividades act = actividadesService.getLocal_ActividadesById(idActividad);
        List<Actividades> listActividades = actividadesService.getAllLocal_Actividades();
        model.addAttribute("Actividades", act);//ya no creamos el objeto por que el objeto lo creamos en la linea 64
        model.addAttribute("dropdownActividades", listActividades);
        return "crearActividad";//redirige a crearActividad
    }

    //Metodo que elimina
    @GetMapping("/deleteActividad/{id}")//cuando se usa ese url pasa lo de abajo y le estoy especificando que quiero edutar por el id
    public String eliminarActividad(@PathVariable("id") Long idActividades) {//enviar informacion a mi metodo 
        actividadesService.deleteLocal_Actividades(idActividades);
        return "redirect:/Actividades";//redirige a Actividades
    }
}
