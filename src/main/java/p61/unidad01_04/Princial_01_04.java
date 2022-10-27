/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad01_04;

/**
 *
 * @author morti
 */
public class Princial_01_04 {
    
    
    public static void main(String[] args) {
        
        var alfaro= new DirectorTecnico();
        alfaro.setNombre("Gustavo Alfaro");
        alfaro.setNacionalidad("Argentina");
        alfaro.setFechaNacimiento(1962);
        alfaro.setYearsTrayectoria(20);
        
        
        var ecuador = new Seleccion("ECU","Federación Ecuatoriana de Fútbol (FEF)"
                ,4,alfaro);
        
        System.out.println(ecuador.obtienePais()+" Datos del D.T: "
                +ecuador.getSeleccionador().getNombre());
        
        var chile = new Seleccion();
        chile.setCodigoFIFA("CHI");
        chile.setNombre("Federación Chilena de Fútbol (FCF)");
        chile.setParticipacionesMundial(9);
        
        var enner = new Jugador();
        enner.setNombre("Enner Valencia");
        enner.setPosicion("Goleador");
        enner.setFechaNacimiento(1989);
        enner.setEquipo(ecuador);
        System.out.println("Datos del D.T de Enner "+enner.getEquipo().getSeleccionador().getNombre());
        
        var byron = new Jugador();
        byron.setNombre("Byron Castillo");
        byron.setPosicion("Defensa");
        byron.setFechaNacimiento(1998);
        byron.setEquipo(ecuador);
        
        var reyArturo = new Jugador();
        reyArturo.setNombre("Arturo Vidal");
        reyArturo.setPosicion("Mediocampo");
        reyArturo.setFechaNacimiento(1987);
        reyArturo.setEquipo(chile);
        
        
        System.out.println(enner.mostrarInfo());
        System.out.println(byron.mostrarInfoJugador());
        System.out.println(reyArturo.mostrarInfo());
        System.out.println(alfaro.mostrarInfo());
        System.out.println(alfaro.mostrarInfoDirectorTecnico());
        
        
        
        
        
        
        
    }
    
}
