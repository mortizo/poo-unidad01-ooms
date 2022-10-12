/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61;

/**
 *
 * @author Mauricio Ortiz
 */
public class Principal {
    
    public static void main(String [] args){
        var progra = new Asignatura();
        progra.codigo=1;
        progra.costoHora=3.5;
        progra.horas=160;
        progra.nombre="Programación Orientada a Objetos";
        progra.nombreDocente="Mauricio Ortiz Ochoa";
        progra.vigente=true;
        
        System.out.println(progra.mostrarInformacion());
        
        var auto1 = new Auto();
        auto1.placa="ABF8592";
        auto1.marca="Chevrolet";
        auto1.nombrePropietario="Juana Moreno";
        
    }
    
    
    
}
