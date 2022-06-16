/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p60;

/**
 *
 * @author PC-12
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        var arreglo = new int[5];
        arreglo[0]=10;
        arreglo[1]=20;
        arreglo[2]=30;
        arreglo[3]=40;
        arreglo[4]=50;
        var i=0;
        while(i<arreglo.length){
            System.out.println(arreglo[i]);
            i++;
        }
        for(i=0; i<arreglo.length; i++){
            System.out.println(arreglo[i]*10);
        }
        for(var x:arreglo){
            System.out.println(x*100);
        }
        
        
        var matriz = new int[2][3];
        matriz[0][0]=00;
        matriz[0][1]=01;
        matriz[0][2]=02;
        matriz[1][0]=10;
        matriz[1][1]=11;
        matriz[1][2]=12;     
     
        while(i<matriz.length){
            var j=0;
            while(j<matriz[i].length){
                System.out.println(matriz[i][j]);
                j++;
            }
            i++;
        }
        for(i=0; i<matriz.length; i++){
            for(var j=0; j<matriz[i].length; j++){
                System.out.println(matriz[i][j]*10);
            }    
        }
        for(int x[]:matriz){
            for(var y:x){
                System.out.println(y*100);
            }    
        }
            
        System.out.println(Character.isDigit('2'));
        System.out.println(Character.isAlphabetic('C'));
             
        var autoJuan = new Auto();
        autoJuan.color="amarillo";
        autoJuan.marca="chevrolet";
        autoJuan.year= 2017;
        autoJuan.placa="UBB 0102";
        autoJuan.precio= 5000;
        
        System.out.println(autoJuan.color+" | "+
                           autoJuan.marca+" | "+
                           autoJuan.year+" | "+
                           autoJuan.precio+" | "+
                           autoJuan.precio+" | ");
        
        var esTaxi=false;
        esTaxi= autoJuan.esTaxi();
        if(esTaxi==true){
            System.out.println("El auto de placa "+autoJuan.placa+ " es un taxi");
        }else{
            System.out.println("El auto de placa "+autoJuan.placa+ " NO es un taxi");
        }
       
        System.out.println(" El auto de precio "+ autoJuan.precio+ " Debe pagar de tasa solidaria "+ autoJuan.calcularTasaSolidaria());
        
        var costoMatricula=10000d;
        costoMatricula=autoJuan.calcularMatricula(2010, 10000);
        System.out.println("Debe pagar "+costoMatricula+" USD por concepto de matrícula");
        
        System.out.println("El auto es de la provincia de: "+autoJuan.obtenerProvincia());
        
        
    }
        
}

