/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PaginaTurismoFinal.controller;

import com.PaginaTurismoFinal.entity.AgenciasLocales;
import com.PaginaTurismoFinal.entity.AgenciasReserva;
import com.PaginaTurismoFinal.Service.IAgenciasLocalesService;
import com.PaginaTurismoFinal.Service.IAgenciasReservaService;
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

    @GetMapping("/AgenciasUsuario")
    public String indexAgenciaLocalUsuario(Model model) {
        String palabraClave = SecurityContextHolder.getContext().getAuthentication().getName();
        List<AgenciasReserva> listaAct = agenciasReservaService.listAllClienteAgencia(palabraClave);
        model.addAttribute("titulo", "Reservaciones Agencias Locales");
        model.addAttribute("AgenciasLocales", listaAct);
        return "AgenciasR";
    }

    //Metodo reservacion nueva
    @GetMapping("/nuevaReservacionAgenciaLocal")
    public String crearReservacionAgencia(Model model) {
        List<AgenciasLocales> listaAgencias = agenciaslocalesService.getAllNom_Agencia_Local();
        model.addAttribute("ReservacionAgencias", new AgenciasReserva());
        model.addAttribute("dropdownAgencias", listaAgencias);
        return "nuevaReservacionAgencia";
    }

    @PostMapping("/saveReservacionAgencia")
    public String guardarReservacionAgencia(@ModelAttribute AgenciasReserva agenciaReserva) {
        agenciasReservaService.saveAgenciasReserva(agenciaReserva);
        return "redirect:/AgenciasUsuario";
    }

    @GetMapping("/editReservaAgencia/{id}")
    public String editarReservaAgencia(@PathVariable("id") Long idAgenciaReserva, Model model) {
        AgenciasReserva act = agenciasReservaService.getAgenciasReservaById(idAgenciaReserva);
        List<AgenciasLocales> listActividades = agenciaslocalesService.getAllNom_Agencia_Local();
        model.addAttribute("ReservacionAgencias", act);//ya no creamos el objeto por que el objeto lo creamos en la linea 64
        model.addAttribute("dropdownAgencias", listActividades);
        return "editarReservacionAgencia";
    }

    @GetMapping("/cancelarReservacionAgencia/{id}")
    public String cancelarReservacionAgencia(@PathVariable("id") Long idAgenciasReserva) {
        agenciasReservaService.deleteAgenciasReserva(idAgenciasReserva);
        return "redirect:/reservacionAgenciaLocal";
    }
}
