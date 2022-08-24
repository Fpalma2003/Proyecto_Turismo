package com.PaginaTurismoFinal.controller;

import com.PaginaTurismoFinal.Repository.PersonasRepository;
import com.PaginaTurismoFinal.Service.IAlquilerAutosReservaService;
import com.PaginaTurismoFinal.Service.IAlquilerAutosService;
import com.PaginaTurismoFinal.Service.IPersonasService;
import com.PaginaTurismoFinal.Service.Userprincipal;
import com.PaginaTurismoFinal.entity.AlquilerAutos;
import com.PaginaTurismoFinal.entity.AlquilerAutosReserva;
import com.PaginaTurismoFinal.entity.personas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AlquilerAutosReservaController {

    @Autowired
    private IAlquilerAutosReservaService alquilerautosReservaService;

    @Autowired
    private IAlquilerAutosService alquilerAutosService;

    @GetMapping("/AutosUsuario")
    public String indexAutos(Model model) {
        String palabraClave = SecurityContextHolder.getContext().getAuthentication().getName();
        List<AlquilerAutosReserva> listaAut = alquilerautosReservaService.listAll(palabraClave);
        model.addAttribute("titulo", "Reservaciones Autos");
        model.addAttribute("AlquilerAutosR", listaAut);
        return "AutosR";
    }

    @GetMapping("/reservacionAutos")
    public String indexAutosReserva(Model model) {
        List<AlquilerAutosReserva> listaAct = alquilerautosReservaService.getAllalquilerautosr();
        model.addAttribute("titulo", "Reservaciones Autos");
        model.addAttribute("AlquilerAutosR", listaAct);
        return "AutosR";
    }

    //Metodo reservacion nueva
    @GetMapping("/nuevaReservacionAuto")
    public String crearReservacionAutos(Model model) {
        List<AlquilerAutos> listaAutos = alquilerAutosService.getAllnombre_autos();
        model.addAttribute("ReservacionAutos", new AlquilerAutosReserva());
        model.addAttribute("dropdownAutos", listaAutos);
        return "nuevaReservacionAutos";
    }

    @PostMapping("/saveReservacionAutos")
    public String guardarReservacionAutos(@ModelAttribute AlquilerAutosReserva autosReserva) {
        alquilerautosReservaService.savealquilerautosr(autosReserva);
        return "redirect:/AutosUsuario";
    }

    @GetMapping("/editAutosR/{id}")//cuando se usa ese url pasa lo de abajo y le estoy especificando que quiero edutar por el id
    public String editarAutosReserva(@PathVariable("id") Long idAuto, Model model) {//enviar informacion a mi metodo 
        AlquilerAutosReserva auto = alquilerautosReservaService.getalquilerautosrById(idAuto);
        List<AlquilerAutos> listaAutos = alquilerAutosService.getAllnombre_autos();
        model.addAttribute("ReservacionAutos", auto);//ya no creamos el objeto por que el objeto lo creamos en la linea 64
        model.addAttribute("dropdownAutos", listaAutos);
        return "editarReservacionAutos";//redirige a persona
    }

    @GetMapping("/cancelarReservacionAutos/{id}")
    public String cancelarReservacionAutos(@PathVariable("id") Long idAlquilerAutosReserva) {
        alquilerautosReservaService.deletealquilerautosr(idAlquilerAutosReserva);
        return "redirect:/AutosUsuario";
    }

}
