/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60;

/**
 *
 * @author morti
 */
public class PrincipalAutoPropietario {
    
    public static void main(String [] args){
        
        var auto = new Auto();
        auto.color="plata";
        auto.marca="Chevrolet";
        auto.precio=13000;
        auto.placa="ABG8596";
        auto.year=2016;
        var propietario = new Propietario();
        propietario.nombre="Pedro";
        propietario.direccion="Paris y Oslo";
        propietario.telefono="0984357604";
        auto.unPropietario=propietario;
        
        System.out.println("El dueño del auto de placa: "+auto.placa+
                            " es: "+auto.unPropietario.nombre);
    }
    
}
