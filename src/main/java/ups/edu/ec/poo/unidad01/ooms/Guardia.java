/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.poo.unidad01.ooms;

import java.time.LocalDate;

/**
 *
 * @author morti
 */
public class Guardia extends Persona {

    public Guardia(String cedula, String nombre, LocalDate yearNacimiento) {
        super(cedula, nombre, yearNacimiento);
    }

    @Override
    public double calcularSueldo() {
        return 1500;
    }
    
    
    
}
