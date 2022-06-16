/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60;

/**
 *
 * @author Mauricio Ortiz
 */
public class Estudiante {
    
    private String nombre;
    private int calificacion;
    private String carrera;
    private double peso;
    private int altura;

    public Estudiante(String nombre, int calificacion, 
            String carrera, double peso, int altura) {
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.carrera = carrera;
        this.peso = peso;
        this.altura = altura;
    }
       
    public String calcularEquivalenciaCalificacion()
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
    
    public boolean esAprobado(){
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
    
    public String obtenerAreaConocimiento(){
        var retorno="TBD";
        
        switch(this.carrera){
            case "Computación":
                retorno="Área de Ciencia y Tecnología";
                break;
            case "Psicología":
                retorno="Áreas de Ciencias Humanas";
                break;
            case "Administración":
                retorno="Área de Ciencias Administrativa";
                break;
            default:
                retorno="Área no definida";
        }
        
        return retorno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    
}
