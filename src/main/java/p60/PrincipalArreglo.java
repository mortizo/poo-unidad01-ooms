/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60;

/**
 *
 * @author morti
 */
public class PrincipalArreglo {
    
    
    public static void main(String [] args){
        var arreglo= new Arreglo();
        var vec1 = arreglo.crearVector(10);
        var vec2 = arreglo.crearVector(10);
        var vecR = arreglo.sumarVector(vec1,vec2);
        
        for(var i=0;i<vecR.length;i++)
        {
            System.out.println(vec1[i]+" + "+vec2[i]+" = "+vecR[i]);
        }
        
        
    }
}
