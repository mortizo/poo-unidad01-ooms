/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60;

import java.time.LocalDate;

/**
 *
 * @author morti
 */
public class Empleado extends Persona{

    public Empleado(String cedula, String nombre, LocalDate yearNacimiento) {
        super(cedula, nombre, yearNacimiento);
    }

    @Override
    public double calcularSueldo() {
        return 2000;
    }
    
    

    

    
    
    


}

