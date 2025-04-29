package seccion4.respo4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import seccion4.respo4.model.Persona;
import seccion4.respo4.service.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("/api/personas")
@RestController
public class PersonaController {
    @Autowiredprivate PersonaService personaService;
    

    @GetMapping
    public String Saludar()
    {
        return "Hola esto esta funcionando!!!";

    
    @PostMapping
    public Persona guardar(@RequestBody Persona persona)}
    }
