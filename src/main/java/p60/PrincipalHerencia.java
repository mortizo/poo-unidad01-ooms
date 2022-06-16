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
public class PrincipalHerencia {
    
    public static void main(String [] args){
        
        var gatoMama = new Gato(7);
        
        gatoMama.setColor("plomo");
        gatoMama.setNombre("Mishi");
        gatoMama.setRaza("Mestizo");
        gatoMama.setPropietario("Mauricio");
        gatoMama.setYearNacimiento(2017);
        
        
        
        var guardia = new GuardiaNocturno(6,"0103667754","Mauricio Ortiz",
                LocalDate.of(1981, 9, 22));
        var empleado = new Empleado("0103667754","Mauricio Ortiz",
                LocalDate.of(1981, 9, 22));
        
        System.out.println(guardia.calcularSueldo());
        System.out.println(empleado.calcularSueldo());
        
        
        
    }
}
