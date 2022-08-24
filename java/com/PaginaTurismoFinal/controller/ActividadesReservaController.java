/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PaginaTurismoFinal.controller;

import com.PaginaTurismoFinal.entity.ActividadesReserva;
import com.PaginaTurismoFinal.Service.IActividadesReservaService;
import com.PaginaTurismoFinal.Service.IActividadesService;
import com.PaginaTurismoFinal.entity.Actividades;
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
 * @author ala11
 */
@Controller
public class ActividadesReservaController {

    @Autowired
    private IActividadesReservaService actividadesReservaService;

    @Autowired
    private IActividadesService actividadesService;

    @GetMapping("/reservacionActividades")
    public String indexActividadesReserva(Model model) {
        List<ActividadesReserva> listaAct = actividadesReservaService.getAllActividadesReserva();
        model.addAttribute("titulo", "Reservaciones Actividades");
        model.addAttribute("ActividadesReserva", listaAct);
        return "ActividadesR";
    }

    @GetMapping("/ActividadesUsuario")
    public String indexActividadesUsuario(Model model) {
        String palabraClave = SecurityContextHolder.getContext().getAuthentication().getName();
        List<ActividadesReserva> listaAct = actividadesReservaService.findAllClienteAc(palabraClave);
        model.addAttribute("titulo", "Reservaciones Actividades");
        model.addAttribute("ActividadesReserva", listaAct);
        return "ActividadesR";
    }

    @GetMapping("/nuevaReservacionActividades")
    public String crearReservacionActividad(Model model) {
        List<Actividades> listaAutos = actividadesService.getAllLocal_Actividades();
        model.addAttribute("ReservacionActividad", new ActividadesReserva());
        model.addAttribute("dropdownActividad", listaAutos);
        return "nuevaReservacionActividades";
    }

    @PostMapping("/saveReservacionActividad")
    public String guardarReservacionActividad(@ModelAttribute ActividadesReserva actividadesReserva) {
        actividadesReservaService.saveActividadesReserva(actividadesReserva);
        return "redirect:/ActividadesUsuario";
    }

    @GetMapping("/editReservaActividad/{id}")
    public String editarReservaActividad(@PathVariable("id") Long idActividadReserva, Model model) {
        ActividadesReserva actR = actividadesReservaService.getActividadesReservaById(idActividadReserva);
        List<Actividades> listaAutos = actividadesService.getAllLocal_Actividades();
        model.addAttribute("ReservacionActividad", actR);//ya no creamos el objeto por que el objeto lo creamos en la linea 64
        model.addAttribute("dropdownActividad", listaAutos);
        return "editarReservacionActividades";
    }

    @GetMapping("/cancelarReservacionActividad/{id}")
    public String cancelarReservacionActiviadad(@PathVariable("id") Long idActividadesReserva) {
        actividadesReservaService.deleteActividadReserva(idActividadesReserva);
        return "redirect:/reservacionActividades";
    }
}
