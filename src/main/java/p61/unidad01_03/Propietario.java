/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad01_03;

/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public class Propietario {
    
    String nombre;
    String telefono;
    String direccion;
    int yearNacimiento;
    
    public String mostrarInfo(){
        return "El propietario se llama: "+this.nombre+ " su número de teléfono es:"
                +this.telefono+ "vive en la dirección"+this.direccion+" y tiene "
                +this.yearNacimiento+ "años";
    }
    
    public int calcularEdad(int yearActual){
        return yearActual-this.yearNacimiento;
    }
    
}
