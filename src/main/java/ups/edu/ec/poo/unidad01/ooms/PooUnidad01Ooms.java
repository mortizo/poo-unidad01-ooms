/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ups.edu.ec.poo.unidad01.ooms;

import java.util.Scanner;

/**
 *
 * @author Mauricio Ortiz
 */
public class PooUnidad01Ooms {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("Hola Ecuador");
        
        var a=5;
        var b=10;
 
        var retorno=" ";
        
        if(a>b)retorno = "A es mayor";
        
        if(a>b)
            retorno = "A es mayor";
                      
        if(a>b){    
            retorno = "A es mayor";
        }
        
        if(b>a){    
            retorno = "B es mayor";
        }
        
        
        if(a>b){    
            retorno = "A es mayor";
        }
        else{    
            retorno = "B es mayor";
        }
        
        if(a>b)
            retorno = "A es mayor";
        
        if(a>b) retorno = "A es mayor";
        
        
        if(a>b){
            retorno = "A es mayor";
        }else if(b>a){
            retorno = "B es mayor";
        }else if(a==b){
            retorno = "A y B son iguales";
        }
        
        retorno = (a>b)?"A es mayor":"B es menor";
        
        retorno = (a>b)?"A es mayor":(b>a)?"B es mayor":"A y B son iguales";
        
        
        var read = new Scanner(System.in);
        var x="";
        
        do
        {
            System.out.println("Ingrese un texto");
            x=read.next();
        }while(!(x.equals("salir")));
       
    }
}
