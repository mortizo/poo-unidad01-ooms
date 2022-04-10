/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.poo.unidad01.ooms;

/**
 *
 * @author morti
 */
public class Empleado extends Persona{
    
    private double sueldo;

    @Override
    public String obtenerInformacion() {
        return "El empleado se llama"+this.getNombre()+
                " y el sueldo es "+this.sueldo;
    }

}

