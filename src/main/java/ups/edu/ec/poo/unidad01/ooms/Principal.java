/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ups.edu.ec.poo.unidad01.ooms;

/**
 *
 * @author PC-12
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world");
        
        var autoJuan = new Auto();
        autoJuan.color="amarillo";
        autoJuan.marca="chevrolet";
        autoJuan.year= 2017;
        autoJuan.placa="ABB 0102";
        autoJuan.precio= 5000;
        
        System.out.println(autoJuan.color+" | "+
                           autoJuan.marca+" | "+
                           autoJuan.year+" | "+
                           autoJuan.precio+" | "+
                           autoJuan.precio+" | ");
        
        ////System.out.println("Es taxi;"+autoJuan.esTaxi());
        var esTaxi=false;
        esTaxi= autoJuan.esTaxi();
        if(esTaxi==true){
            System.out.println("El auto de placa "+autoJuan.placa+ " es un taxi");
        }else{
            System.out.println("El auto de placa "+autoJuan.placa+ " NO es un taxi");
        }
       
        System.out.println(" El auto de precio "+ autoJuan.precio+ " Debe pagar de tasa solidaria "+ autoJuan.calcularTasaSolidaria());
        
        var autoLuis = new Auto();
        autoLuis.color="Blanco";
        autoLuis.marca="Toyota";
        autoLuis.year= 2019;
        autoLuis.placa="ABD 567";
        autoLuis.precio= 9000;
        
        System.out.println(autoLuis.color+" | "+
                           autoLuis.marca+" | "+
                           autoLuis.year+" | "+
                           autoLuis.precio+" | "+
                           autoLuis.placa+" | ");
        
        
       
        
        esTaxi= autoLuis.esTaxi();
        if(esTaxi==true){
            System.out.println("El auto de placa"+autoLuis.placa+ " es un taxi");
        }else{
             System.out.println("El auto de placa"+autoLuis.placa+ " NO es un taxi");       
        }
        
        
        System.out.println("El auto de precio "+ autoLuis.precio+ " Debe pagar de tasa solidaria "+ autoLuis.calcularTasaSolidaria());
        
            
    }
        
}

