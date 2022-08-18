/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pagina_Turismo.Pagina_Turismo.controller;

import com.Pagina_Turismo.Pagina_Turismo.entity.ActividadesReserva;
import com.Pagina_Turismo.Pagina_Turismo.service.IActividadesReservaService;
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
 * @author ala11
 */
@Controller
public class ActividadesReservaController {

    @Autowired
    private IActividadesReservaService actividadesReservaService;

    @GetMapping("/reservacionActividades")
    public String indexActividadesReserva(Model model) {
        List<ActividadesReserva> listaAct = actividadesReservaService.getAllActividadesReserva();
        model.addAttribute("titulo", "Reservaciones Actividades");
        model.addAttribute("ActividadesReserva", listaAct);
        return "ActividadesR";
    }

    @GetMapping("/nuevaReservacionActividades")
    public String crearReservacionActividad(Model model) {
        model.addAttribute("ReservacionActividad", new ActividadesReserva());
        return "nuevaReservacionActividades";
    }

    @PostMapping("/saveReservacionActividad")
    public String guardarReservacionActividad(@ModelAttribute ActividadesReserva actividadesReserva) {
        actividadesReservaService.saveActividadesReserva(actividadesReserva);
        return "redirect:/reservacionActividades";
    }

    @GetMapping("/editReservaActividad")
    public String editarReservaActividad(@PathVariable("id") Long idActividadReserva, Model model) {
        ActividadesReserva actividadesReserva = actividadesReservaService.getActividadesReservaById(idActividadReserva);
        model.addAttribute("ActividadReserva", actividadesReserva);
        return "nuevaReservacionActividades";
    }

    @GetMapping("/cancelarReservacionActividad")
    public String cancelarReservacionActiviadad(@PathVariable("id") Long idActividadesReserva) {
        actividadesReservaService.deleteActividadReserva(idActividadesReserva);
        return "redirect:/reservacionActividades";
    }
}
