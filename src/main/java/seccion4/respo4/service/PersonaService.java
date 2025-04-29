package seccion4.respo4.service;

import org.springframework.beans.factory.annotation.Autowired;

import seccion4.respo4.model.Persona;
import seccion4.respo4.repository.PersonaRepository;
import seccion4.respo4.repository.persona;

public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public Persona guardarPersona(Persona persona){
        return personaRepository.create(persona);
    }
}
