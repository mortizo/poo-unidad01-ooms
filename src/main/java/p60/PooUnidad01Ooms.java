/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package p60;

import java.time.LocalDate;
import java.time.Month;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mauricio Ortiz
 */
public class PooUnidad01Ooms {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("Hola Ecuador");
        
        
        var p= new Guardia("0103667754","Mauricio Ortiz",
                LocalDate.of(1981, 9, 22));
        
        p.calcularSueldo();
        
        p.setYearNacimiento(LocalDate.now());
        
        System.out.println(p.getYearNacimiento().getYear());
        
        
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
        
      /*  
        var read = new Scanner(System.in);
        var x="";
        
        do
        {
            System.out.println("Ingrese un texto");
            x=read.next();
        }while(!(x.equals("salir")));
       */
    }
    
    
    public int suma (int p1, int p2)
    {
        return p1+p2;
    }
    
    
    public void calcularMayor3Numeros (int a, int b,int c)
    {
        var retorno="A y B son iguales";
        if(a>b){
            retorno = "A es mayor";
        }else{
            if(b>a)
                retorno = "B es mayor";
        }
        
        int temp;
        String mensaje = "";
        Random r = new Random();
        temp = r.nextInt(55)-10;
 
        if(temp<10){
            mensaje = "Hace mucho frío.";
        }
        else{
            if(temp<15){
                mensaje = "Hace poco frío.";
            }
            else{
                if(temp<25){
                    mensaje = "Hace una temperatura normal.";
                }
                else{
                    if(temp<30){
                        mensaje = "Hace poco calor.";
                    }
                    else{
                        mensaje = "Hace mucho calor.";
                    }
                }
            }
        }
        System.out.printf("La temperatura actual es de %d grados.", temp);
        System.out.println("\n" + mensaje);
    }
    
}
