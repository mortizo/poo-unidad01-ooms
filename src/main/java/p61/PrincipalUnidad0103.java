/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61;

import java.util.Scanner;

/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public class PrincipalUnidad0103 {

    public static void main(String[] args) {

        var a = 0;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        while (a < 100) {
            System.out.println("a = " + a);
            a++;
        }
        var numero=0;
        //leer datos del teclado
        do {
            var lectura = new Scanner(System.in);
            System.out.println("Ingresar números menores a 10");
            numero = lectura.nextInt();
            System.out.println("numero = " + numero);
        } while (numero < 10);
        
        
        for (var i = 0; i < 10; i++) {
            System.out.println("Hola "+i);
        }
        
        var numeroList = new int[5];
        numeroList[0]=7;
        numeroList[1]=9;
        numeroList[2]=4;
        numeroList[3]=11;
        numeroList[4]=3;
        
        var numeroDecimalList = new double[5];
        numeroDecimalList[0]=8.5;
        numeroDecimalList[1]=4.0;
        numeroDecimalList[2]=9.3;
        numeroDecimalList[3]=6.4;
        numeroDecimalList[4]=3.9;
        
        
        for (var i = 0; i < numeroList.length; i++) {
            System.out.println(numeroList[i]);
        }
        for (var i = 0; i < numeroDecimalList.length; i++) {
            System.out.println(numeroDecimalList[i]);
        }
 
        
    }

}
