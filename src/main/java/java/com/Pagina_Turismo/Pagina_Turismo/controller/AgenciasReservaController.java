/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pagina_Turismo.Pagina_Turismo.controller;

import com.Pagina_Turismo.Pagina_Turismo.entity.AgenciasLocales;
import com.Pagina_Turismo.Pagina_Turismo.entity.AgenciasReserva;
import com.Pagina_Turismo.Pagina_Turismo.service.IAgenciasLocalesService;
import com.Pagina_Turismo.Pagina_Turismo.service.IAgenciasReservaService;
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
public class AgenciasReservaController {

    @Autowired
    private IAgenciasReservaService agenciasReservaService;

    @Autowired
    private IAgenciasLocalesService agenciaslocalesService;

    @GetMapping("/reservacionAgenciaLocal")
    public String indexAgenciaLocalReserva(Model model) {
        List<AgenciasReserva> listaAct = agenciasReservaService.getAllAgenciasReserva();
        model.addAttribute("titulo", "Reservaciones Agencias Locales");
        model.addAttribute("AgenciasLocales", listaAct);
        return "AgenciasR";
    }

    //Metodo reservacion nueva
    @GetMapping("/nuevaReservacionAgenciaLocal")
    public String crearReservacionAgencia(Model model) {
        List<AgenciasLocales> listaAgencias = agenciaslocalesService.getAllAgenciasLocales();
        model.addAttribute("ReservacionAgencias", new AgenciasReserva());
        model.addAttribute("dropdownAgencias", listaAgencias);
        return "nuevaReservacionAgencia";
    }

    @PostMapping("/saveReservacionAgencia")
    public String guardarReservacionAgencia(@ModelAttribute AgenciasReserva agenciaReserva) {
        agenciasReservaService.saveAgenciasReserva(agenciaReserva);
        return "redirect:/reservacionAgenciaLocal";
    }

    @GetMapping("/editReservaAgencia/{id}")
    public String editarReservaAgencia(@PathVariable("id") Long idAgenciaReserva, Model model) {
        model.addAttribute("ReservacionAgencias", new AgenciasReserva());
        agenciasReservaService.deleteAgenciasReserva(idAgenciaReserva);
        return "nuevaReservacionAgencia";
    }

    @GetMapping("/cancelarReservacionAgencia/{id}")
    public String cancelarReservacionAgencia(@PathVariable("id") Long idAgenciasReserva) {
        agenciasReservaService.deleteAgenciasReserva(idAgenciasReserva);
        return "redirect:/reservacionAgenciaLocal";
    }

}
