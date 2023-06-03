package com.mx.poo2.ingsoft.examen3.controlador;

import com.mx.poo2.ingsoft.examen3.interfaceService.IPersonaService;
import com.mx.poo2.ingsoft.examen3.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class Controlador {
    @Autowired
    private IPersonaService service;
    @GetMapping("/listar")
    public String listar(Model modelo){
        List<Persona> personas = service.listar();
        modelo.addAttribute("personas", personas);
        return "index";
    }
}
