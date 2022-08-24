/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PaginaTurismoFinal.controller;

import com.PaginaTurismoFinal.Service.AlquilerAutosService;
import com.PaginaTurismoFinal.Service.IAlquilerAutosService;
import com.PaginaTurismoFinal.entity.AlquilerAutos;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Andra Mckenzie Araya
 */
@Controller
public class AlquilerAutosController {

    @Autowired
    private IAlquilerAutosService alquilerautosService;

    @GetMapping("/AlquilerAutos")
    public String indexAlquilerAutos(Model model) {
        List<AlquilerAutos> listaAct = alquilerautosService.getAllnombre_autos();
        model.addAttribute("titulo", "Tabla Alquiler Autos");
        model.addAttribute("alquilerAutos", listaAct);
        return "alquilerAutos";
    }

    //Metodo reservacion nueva
    @GetMapping("/AutosN")
    public String crearAutos(Model model) {
        model.addAttribute("AlquilerAutos", new AlquilerAutos());
        return "crearAutos";
    }

    @PostMapping("/saveAutos")
    public String guardarAutos(@ModelAttribute AlquilerAutos alquilerAutos) {
        alquilerautosService.savenombre_autos(alquilerAutos);
        return "redirect:AlquilerAutos";
    }

    @GetMapping("/editAutos/{id}")
    public String editarAutos(@PathVariable("id") Long idalquilerAutos, Model model) {
        AlquilerAutos act = alquilerautosService.getnombre_autosById(idalquilerAutos);
        List<AlquilerAutos> listActividades = alquilerautosService.getAllnombre_autos();
        model.addAttribute("AlquilerAutos", act);//ya no creamos el objeto por que el objeto lo creamos en la linea 64
        model.addAttribute("dropdownAutos", listActividades);
        return "crearAutos";
    }

    @GetMapping("/eliminarAutos/{id}")
    public String eliminarAutos(@PathVariable("id") Long idAlquilerAutos) {
        alquilerautosService.deletenombre_autos(idAlquilerAutos);
        return "redirect:/AlquilerAutos";
    }

}
