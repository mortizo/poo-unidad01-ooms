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
 
        
        System.out.println("Ingresar la dimensión del arreglo unidimensional o arreglo");
        var lectura = new Scanner(System.in);
        var dimension = lectura.nextInt();
        
        var arreglo = new int[dimension];
        
        for (var i = 0; i < arreglo.length; i++) {
            System.out.println("Ingresar el número de la posición "+(i+1));
            arreglo[i] = lectura.nextInt();
        }
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
        
        
        System.out.println("Ingrese el número de filas que tendrá la matriz");
        var filas = lectura.nextInt();
        System.out.println("Ingrese el número de columnas que tendrá la matriz");
        var columnas = lectura.nextInt();
        
        var matriz = new int [2][3];
        
        System.out.println("Ingrese el valor correspondiente a la posición 0,0");
        matriz [0][0] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 0,1");
        matriz [0][1] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 0,2");
        matriz [0][2] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 1,0");
        matriz [1][0] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 1,1");
        matriz [1][1] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 1,2");
        matriz [1][2] = lectura.nextInt();
        
        System.out.println(matriz [0][0]+" "+matriz [0][1]+" "+matriz [0][2]);
        System.out.println(matriz [1][0]+" "+matriz [1][1]+" "+matriz [1][2]);
        
        
        
    }

}
