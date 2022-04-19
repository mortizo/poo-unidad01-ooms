/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.poo.unidad01.ooms;

import java.time.LocalDate;

/**
 *
 * @author Mauricio
 */
public class Animal {
    
    private String nombre;
    private int yearNacimiento;
    private String color;
    private String raza;
    
    public int calcularEdad(){
        return LocalDate.now().getYear()-this.yearNacimiento;
    }
    
    
    
    //Getters & Setters
    
    public int getYearNacimiento(){
        return this.yearNacimiento;
    }
    
    public void setYearNacimiento(int y){
        this.yearNacimiento=y;
    }
    
}
