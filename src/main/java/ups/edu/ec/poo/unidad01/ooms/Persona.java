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


public class Persona {
    
    private String cedula;
    private String nombre;
    private LocalDate yearNacimiento;
    
    public String obtenerInformacion() {
        return "El empleado se llama"+this.getNombre();
    }
    
    public int obtieneEdad(int yearActual){
        return yearActual - this.yearNacimiento.getYear();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getYearNacimiento() {
        return yearNacimiento;
    }

    public void setYearNacimiento(LocalDate yearNacimiento) {
        this.yearNacimiento = yearNacimiento;
    }
  
}

