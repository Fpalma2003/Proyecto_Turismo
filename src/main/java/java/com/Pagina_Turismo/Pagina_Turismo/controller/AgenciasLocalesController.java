/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pagina_Turismo.Pagina_Turismo.controller;


import com.Pagina_Turismo.Pagina_Turismo.entity.AgenciasAu;
import com.Pagina_Turismo.Pagina_Turismo.entity.AgenciasLocales;
import com.Pagina_Turismo.Pagina_Turismo.service.IAgenciasAuService;
import com.Pagina_Turismo.Pagina_Turismo.service.IAgenciasLocalesService;
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
public class AgenciasLocalesController {

    @Autowired
    private IAgenciasAuService agenciasauService;

    @Autowired
    private IAgenciasLocalesService agenciaslocalesService;

    @GetMapping("/agencias")
    public String indexAgencias(Model model) {
        List<AgenciasAu> listaAgencias = agenciasauService.getAllAgencias();
        model.addAttribute("titulo", "Tabla Agencias Locales");
        model.addAttribute("personas", listaAgencias);
        return "agenciaslocales";
    }

    //Metodo que crear una nueva persona
    @GetMapping("/agenciasN")//cuando se usa ese url pasa lo de abajo
    public String crearAgencia(Model model) {//model permite pasar informacion a un html
        List<AgenciasLocales> listaAgencias = agenciaslocalesService.listAgencias();//pasamos toda la lista pais al html
        model.addAttribute("Agencias Locales", new AgenciasAu());//creamos un objeto nuevo tipo persona para poder crear la fila
        model.addAttribute("Agencia", listaAgencias);/*donde en el html encuentre "paises" lo va a sustituir por 
        listaPaises (line 41) esto para poder hacer el dropdowm*/
        return "crear";//devolvera html crear
    }

    //Metodo que guardar la nueva persona y su info
    @PostMapping("/saveAgenciaLocal")//cuando se usa ese url pasa lo de abajo
    public String guardarAgenciasLocales(@ModelAttribute AgenciasAu AgenciasLocales) {//enviar informacion a mi metodo 
        agenciasauService.saveAgencias(AgenciasLocales);//asi lo guardo en la base de datos
        return "redirect:/agenciaslocales";
    }

    //Metodo que edita
    @GetMapping("/editAgenciasLocales/{id}")//cuando se usa ese url pasa lo de abajo y le estoy especificando que quiero edutar por el id
    public String editarAgenciasLocales(@PathVariable("id") Long idAgenciasLocales, Model model) {//enviar informacion a mi metodo 
        AgenciasAu AgenciasLocales = agenciasauService.getAgenciasById(idAgenciasLocales);
        List<AgenciasLocales> listaAgencias = agenciaslocalesService.listAgencias();
        model.addAttribute("agenciaslocales", AgenciasLocales);//ya no creamos el objeto por que el objeto lo creamos en la linea 64
        model.addAttribute("agenciaslocales", listaAgencias);
        return "crear";//redirige a persona
    }

    //Metodo que elimina
    @GetMapping("/deleteAgenciaLocal/{id}")//cuando se usa ese url pasa lo de abajo y le estoy especificando que quiero edutar por el id
    public String eliminarAgenciasLocales(@PathVariable("id") Long idAgenciasLocales) {//enviar informacion a mi metodo 
        agenciasauService.delete(idAgenciasLocales);
        return "redirect:/agenciaslocales";//redirige a persona
    }
}
