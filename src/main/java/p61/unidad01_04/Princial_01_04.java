/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad01_04;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author morti
 */
public class Princial_01_04 {
    
    
    public static void main(String[] args) {
        /*
        var alfaro= new DirectorTecnico("Argentina",20);
        alfaro.setNombre("Gustavo Alfaro");
        alfaro.setFechaNacimiento(1962);
        
        var shurer= new DirectorTecnico("Argentina",10);
        shurer.setNombre("Gabriel Shurer");
        shurer.setFechaNacimiento(1958);
        
        

        var ecuador = new Seleccion("ECU","Federación Ecuatoriana de Fútbol (FEF)"
                ,4,alfaro);
        
        System.out.println(ecuador.obtienePais()+" Datos del D.T: "
                +ecuador.getSeleccionador().getNombre());
        
        var chile = new Seleccion("CHI","Federación Chilena de Fútbol (FCF)"
        ,9,shurer);
        
        var enner = new Jugador("Enner Valencia",1989, "Goleador",ecuador);
        var tuca = new Jugador("Roberto Ordoñez", "Goleador",ecuador);
        var piedra = new Jugador("Hamilton Piedra","Arquero");
        piedra.setEquipo(ecuador);
        var byron = new Jugador("Byron Castillo",1989,"Defensa",ecuador);
        var reyArturo = new Jugador("Arturo Vidal",1987,"Mediocampo", chile);
                
        System.out.println(enner.mostrarInfo());
        System.out.println(byron.mostrarInfo());
        System.out.println(reyArturo.mostrarInfo());
        System.out.println(alfaro.mostrarInfo());
        System.out.println(alfaro.mostrarInfo());
        System.out.println(shurer.mostrarInfo());
        
        */
        
        var mauricio = new Dueño("0103667785","Mauricio Ortiz Ochoa", "0984357604");
        var pilichi = new Mascota("Pilichi","Gato","Mestizo",3,mauricio);
       // var atencion = new Atencion(LocalDate.now(),"Dr. Masache",45,pilichi);
        var atencion = new Atencion(LocalDate.of(2022, Month.OCTOBER, 7),"Dr. Masache",45,pilichi);
        System.out.println(mauricio.toString());
        System.out.println(pilichi.toString());
        System.out.println(atencion.toString());
        System.out.println("El día de la atencion fué: "+atencion.getFecha().getDayOfWeek().name());
        
        
        
        
    }
    
}
