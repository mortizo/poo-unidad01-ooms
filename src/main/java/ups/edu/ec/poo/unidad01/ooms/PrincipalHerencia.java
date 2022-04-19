/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.poo.unidad01.ooms;

/**
 *
 * @author morti
 */
public class PrincipalHerencia {
    
    public static void main(String [] args){
    
        var perro = new Animal();
        
        System.out.println("El animal nació en el año: "+perro.getYearNacimiento()+
                            " y tiene "+perro.calcularEdad()+" años");
    }
}
