package seccion4.respo4.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import seccion4.respo4.model.Persona;

@Repository
public class PersonaRepository {
    private List<persona> personas=new ArrayList<>();
    public Persona create(Persona persona){
        personas.addAll(persona);
        return persona;
    }
    public Persona create(Persona persona) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }
}
