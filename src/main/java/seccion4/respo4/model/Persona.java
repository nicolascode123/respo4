package seccion4.respo4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor



public class Persona {
    private int id;
    private String rut;
    private String nombre;
    private String apellido;
    private int edad;


}
