/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PaginaTurismoFinal.controller;

import com.PaginaTurismoFinal.Service.AlquilerAutosReservaService;
import com.PaginaTurismoFinal.Service.RestaurantesReservaService;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Andra Mckenzie Araya
 */
@RestController
public class AlquilerAutosReportController {
  
  @Autowired
    private AlquilerAutosReservaService alquilerautosreservaservice;
 
    @GetMapping("/GenerarReporteAutos")
    public String generatedPdf() throws FileNotFoundException, JRException{
 
        JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(alquilerautosreservaservice.getAllalquilerautosr());
        JasperReport compileReport = JasperCompileManager.compileReport(new FileInputStream("C:\\Users\\ala11\\OneDrive\\Escritorio\\U shit\\Cuarto Cuatri\\Desarrollo Aplicaciones Web\\Proyecto\\FinalPaginaTurismo\\src\\main\\resources\\AlquilerAutos.jrxml"));
 
        HashMap<String,Object> map=new HashMap<>();
        JasperPrint report = JasperFillManager.fillReport(compileReport, map, beanCollectionDataSource);
        JasperExportManager.exportReportToPdfFile(report,"ReporteAutosReserva.pdf");
 
        return "El reporte se ha creado exitosamente";
    }  
}
