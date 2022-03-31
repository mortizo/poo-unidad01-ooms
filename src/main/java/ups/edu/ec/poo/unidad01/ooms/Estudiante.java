/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.poo.unidad01.ooms;

/**
 *
 * @author morti
 */
public class Estudiante {
    
    String nombre;
    int calificacion;
    String carrera;
    double peso;
    int altura;
    
    
    public String equivalenciaCalificacion()
    {
        var retorno="Insuficiente";
        
        if(this.calificacion>=90){
            retorno="Sobresaliente";
        }else{
            if(this.calificacion>=80){
                retorno="Muy buena";
            }else{
                if(this.calificacion>=70){
                    retorno="Buena";
                }
            }
        }
        
        return retorno;
    }
    
    public boolean aprobado(){
        var retorno=false;
        
        retorno=(this.calificacion>=70)?true:false;
        
        return retorno;
    }
    
    public double calcularImc()
    {
        
        /*
            Fórmula IMC: peso (kg) / [estatura (m)]2
            Ejemplo: Peso = 68 kg, Estatura = 165 cm (1.65 m)
            Cálculo: 68 ÷ (1.65)2 = 24.98
        */
        var retorno=0d;
       
        retorno=this.peso/(this.altura^2);
       
        return retorno;
    }
   
}
