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
public class Arreglo {
    
    public int[] crearVector(int f){
        var retorno = new int[f];
        var lectura = new Scanner(System.in);
        for (int i = 0; i < f; i++) {
            System.out.println("Ingrese número en la posición: "+i);
            retorno[i]=lectura.nextInt();
        }   
        return retorno;
    }
    
    public int[][] crearMatriz(int f, int c){
        var retorno = new int[f][c];
        
        return retorno;
    }
    
    public int[] sumaVector(int[] v1, int[] v2){
        var retorno= new int[v1.length];
        
        return retorno;
    }
    
}
