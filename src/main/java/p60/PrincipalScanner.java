/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60;

import java.util.Scanner;

/**
 *
 * @author morti
 */
public class PrincipalScanner {
    
    public static void main(String [] args){
    
        var numero=0;
        while(numero<10){    
            System.out.println("Ingrese un número");
            numero = (new Scanner(System.in)).nextInt();
        }
        System.out.println(numero);
        
        var numeroList = new int[7];
        var i=0;
        while(i<7){
            System.out.println("Ingrese un número");
            numeroList[i]=(new Scanner(System.in)).nextInt();     
            System.out.println(numeroList[i]);
            i=i+1;
        }
        
        var textoList = new String[5];
        i=0;
        do{
            System.out.println("Ingrese un texto");
            textoList[i]=(new Scanner(System.in)).next();  
            System.out.println(textoList[i]);
            i=i+1;
        }while(i<5);
        
        
        
    }
    
}
