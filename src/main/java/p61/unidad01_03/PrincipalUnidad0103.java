/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad01_03;

import p61.*;
import java.util.Scanner;


/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public class PrincipalUnidad0103 {

    public static void main(String[] args) {
        
        var propietario1 = new Propietario();
        propietario1.nombre="Juan Pérez";
        propietario1.direccion="París y Oslo";
        propietario1.telefono="0984357604";
        propietario1.yearNacimiento=1981;
        
        var propietario2 = new Propietario();
        propietario2.nombre="Carlos López";
        propietario2.direccion="Gran Colombia y Lamar";
        propietario2.telefono="09843578596";
        propietario2.yearNacimiento=1980;
        
        
        var auto1 = new Auto();
        auto1.color="Amarillo";
        auto1.cilindrajeMotor=1600;
        auto1.marca="Toyota";
        auto1.placa="AGF0526";
        auto1.precio=18000;
        auto1.year=2018;
        auto1.owner=propietario2;
        
        var auto2 = new Auto();
        auto2.color="Azul";
        auto2.cilindrajeMotor=2500;
        auto2.marca="Chevrolet";
        auto2.placa="UAF0526";
        auto2.precio=18000;
        auto2.year=2010;
        auto2.owner=propietario1;
        
        System.out.println(auto1.mostrarInfo());
        System.out.println(auto2.mostrarInfo());
  
        /*
        var arreglo = new Arreglo();
        var vector1= arreglo.crearVector(5);
        var vector2= arreglo.crearVector(5);
        var matriz1= arreglo.crearMatriz(3,5);
        var matriz2= arreglo.crearMatriz(3,5);
        var vectorSumado = arreglo.sumaVector(vector1, vector2);
        
        for (int i = 0; i < vector1.length; i++) {
            System.out.println(vector1[i]);
        }
        
        
        

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
        var numero = 0;
        //leer datos del teclado
        do {
            var lectura = new Scanner(System.in);
            System.out.println("Ingresar números menores a 10");
            numero = lectura.nextInt();
            System.out.println("numero = " + numero);
        } while (numero < 10);

        for (var i = 0; i < 10; i++) {
            System.out.println("Hola " + i);
        }

        var numeroList = new int[5];
        numeroList[0] = 7;
        numeroList[1] = 9;
        numeroList[2] = 4;
        numeroList[3] = 11;
        numeroList[4] = 3;

        var numeroDecimalList = new double[5];
        numeroDecimalList[0] = 8.5;
        numeroDecimalList[1] = 4.0;
        numeroDecimalList[2] = 9.3;
        numeroDecimalList[3] = 6.4;
        numeroDecimalList[4] = 3.9;

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
            System.out.println("Ingresar el número de la posición " + (i + 1));
            arreglo[i] = lectura.nextInt();
        }

        for (var i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

        System.out.println("Ingrese el número de filas que tendrá la matriz");
        var filas = lectura.nextInt();
        System.out.println("Ingrese el número de columnas que tendrá la matriz");
        var columnas = lectura.nextInt();

        var matriz = new int[2][3];

        System.out.println("Ingrese el valor correspondiente a la posición 0,0");
        matriz[0][0] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 0,1");
        matriz[0][1] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 0,2");
        matriz[0][2] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 1,0");
        matriz[1][0] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 1,1");
        matriz[1][1] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 1,2");
        matriz[1][2] = lectura.nextInt();

        System.out.println(matriz[0][0] + " " + matriz[0][1] + " " + matriz[0][2]);
        System.out.println(matriz[1][0] + " " + matriz[1][1] + " " + matriz[1][2]);

        var matrizDinamica = new int[filas][columnas];

        for (var i = 0; i < filas; i++) {
            for (var j = 0; j < columnas; j++) {
                System.out.println("Ingrese el valor correspondiente a la posición " + i + ","+j);
                matrizDinamica[i][j] = lectura.nextInt();
            }
        }
        
        for (var i = 0; i < filas; i++) {
            for (var j = 0; j < columnas; j++) {
                System.out.print(matrizDinamica[i][j] + "  ");
            }
            System.out.println("  ");
        }
        */
        
        

    }

}
