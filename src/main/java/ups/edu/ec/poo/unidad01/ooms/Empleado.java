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
public class Empleado extends Persona{
    
    private double sueldo;

    public Empleado(double sueldo, String cedula, String nombre, LocalDate yearNacimiento) {
        super(cedula, nombre, yearNacimiento);
        this.sueldo = sueldo;
    }

    
    
    

    @Override
    public String obtenerInformacion() {
        return super.obtenerInformacion()+
                " y el sueldo es "+this.sueldo;
    }

}

