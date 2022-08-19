/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pagina_Turismo.Pagina_Turismo.controller;

import com.Pagina_Turismo.Pagina_Turismo.entity.AgenciasLocales;
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
    private IAgenciasLocalesService agenciaslocalesService;

    @GetMapping("/agencias")
    public String indexAgencias(Model model) {
        List<AgenciasLocales> listaAgencias = agenciaslocalesService.getAllAgenciasLocales();
        model.addAttribute("titulo", "Tabla Agencias Locales");
        model.addAttribute("agenciaslocales", listaAgencias);
        return "agenciaslocales";
    }

    //Metodo que crear una nueva persona
    @GetMapping("/agenciasN")//cuando se usa ese url pasa lo de abajo
    public String crearAgencia(Model model) {//model permite pasar informacion a un html
        model.addAttribute("Agencia", new AgenciasLocales());
        return "crearAgencia";//devolvera html crear
    }

    //Metodo que guardar la nueva persona y su info
    @PostMapping("/saveAgenciaLocal")//cuando se usa ese url pasa lo de abajo
    public String guardarAgenciasLocales(@ModelAttribute AgenciasLocales AgenciasLocales) {//enviar informacion a mi metodo 
        agenciaslocalesService.saveAgenciasLocales(AgenciasLocales);//asi lo guardo en la base de datos
        return "redirect:/agenciaslocales";
    }

    //Metodo que edita
    @GetMapping("/editAgenciasLocales/{id}")//cuando se usa ese url pasa lo de abajo y le estoy especificando que quiero edutar por el id
    public String editarAgenciasLocales(@PathVariable("id") Long idAgenciasLocales, Model model) {//enviar informacion a mi metodo 
        AgenciasLocales agencialocal = agenciaslocalesService.getAgenciasLocalesById(idAgenciasLocales);
        model.addAttribute("agenciaslocales", agencialocal);//ya no creamos el objeto por que el objeto lo creamos en la linea 64
        return "crearAgenciaLocal";//redirige a crearAgenciaLocal
    }

    //Metodo que elimina
    @GetMapping("/deleteAgenciaLocal/{id}")//cuando se usa ese url pasa lo de abajo y le estoy especificando que quiero edutar por el id
    public String eliminarAgenciasLocales(@PathVariable("id") Long idAgenciasLocales) {//enviar informacion a mi metodo 
        agenciaslocalesService.deleteAgenciasLocales(idAgenciasLocales);
        return "redirect:/agenciaslocales";//redirige a agenciaslocales
    }
}
