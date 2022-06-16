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
public class GuardiaNocturno extends Guardia{
    
    private int numeroGuardias;

    public GuardiaNocturno(int numeroGuardias, String cedula, String nombre, LocalDate yearNacimiento) {
        super(cedula, nombre, yearNacimiento);
        this.numeroGuardias = numeroGuardias;
    }

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo()*1.5; 
    }

    
    
    
    

    public int getNumeroGuardias() {
        return numeroGuardias;
    }

    public void setNumeroGuardias(int numeroGuardias) {
        this.numeroGuardias = numeroGuardias;
    }
    
    
    
    
}
