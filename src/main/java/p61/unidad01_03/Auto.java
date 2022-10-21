/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad01_03;

import p61.*;

/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public class Auto {

    String placa;
    String marca;
    int year;
    String color;
    double precio;
    int cilindrajeMotor;
    Propietario owner;

    public String mostrarInfo() {
        var retorno = " El auto tiene placa: " + this.placa + " es de marca: "
                + this.marca + ". El propietario es: " + this.owner.nombre
                + " la dirección del propietario es: " + this.owner.direccion
                + " . El auto cuesta "+this.precio+ " USD y es modelo: " + this.year;

        return retorno;
    }

    public String getProvincia() {
        var retorno = "";
        var primeraLetra="";
        primeraLetra=this.placa.substring(0,1);
        switch(primeraLetra){
            case "A":
                retorno="Azuay";
                break;
           case "P":
                retorno="Pichincha";
                break;
           case "G":
                retorno="Guayas";
                break;
            case "U":
                retorno="Cañar";
                break;
            default:
                retorno="Provincia no definida";
        }
        return retorno;
    }

    public String getPaisMarca() {
        var retorno = "";
        if (this.marca.equals("Chevrolet")) {
            retorno = "EE.UU";
        } else {
            if (this.marca.equals("Toyota")) {
                retorno = "Japón";
            } else {
                retorno = "No definido";
            }
        }
        return retorno;
    }

    public int getNumeroContinente() {
        //1: Africa 2:America 3:Asia 4:Europa 5:Oceania
        var retorno = 0;
        var marcaPais=this.getPaisMarca();
        switch(marcaPais){
            case "EE.UU":
                retorno=2;
                break;
            case "Japón":
                retorno=3;
                break;
            default:
                retorno=0;
        }
        return retorno;
    }
    
    public double calcularIVA(){
        var retorno=0.0d;
      
        
        return retorno;
    }
    
    public int calcularEdad(int yearActual){
        var retorno=0;    
        
        
        return retorno;
    }
    
    //10% por cada año de uso
    //La depreciacion no puede exceder el precio
    public double calcularDepreciacion(int yearActual){
        var retorno=0.0d;
        var edad=this.calcularEdad(yearActual);
    
        
        return retorno;
    }
    
    /*
    Edad 0-5: 10% del precio
    Edad 5-10: 8% del precio
    Edad 10-15: 7% del precio
    Edad >15: 6% del precio
    */
    
    public double calcularCostoMatricula(int yearActual){
        var retorno=0.0d;
        var edad=this.calcularEdad(yearActual);
    
        
        return retorno;
    }
    
      /*
    Edad 0-5 y precio menos de 10000 SI
    Edad 10-15 y precio de 10000 a 20000 SI
    Edad >15 y precio de 20000 a 30000 SI
    Edad >15 NO
     */
    public boolean sePuedeAsegurar(int yearActual){
        var retorno=false;
        var edad=this.calcularEdad(yearActual);
        if(edad<=5 && this.precio<10000)
        {
            retorno=true;
        }else{
            
        }
        return retorno;
    }
    
    public boolean esClasico(int yearActual, int yearClasico){
        var retorno=false;
        
        return retorno;
    }
    
    /*
    Edad 0-5 y cilindraje < 1500 : tasa solidaria 15% costo
    Edad 0-5 y cilindraje > 1500 < 2000 : tasa solidaria 20% costo
    Edad 0-5 y cilindraje > 2000 : tasa solidaria 25% costo
    Edad 5-15 y cilindraje < 1500 : tasa solidaria 10% costo
    Edad 5-15 y cilindraje > 1500 < 2000 : tasa solidaria 15% costo
    Edad 5-15 y cilindraje > 2000 : tasa solidaria 18% costo
    Edad 15-20 : tasa solidaria 5%
    Edad >20 : tasa solidaria 0
    En cualquier Caso existe un límte de pago de tasa solidaria que no se podría superar.
    */
    
    //g1 y g2 Auto 7años, 1600cc, 18000USD = 2700USD
    //g3 y g8 Auto 4años, 1000cc, 8000USD = 1200USD
    //g3 y g9 Auto 16años, 2000cc, 10000USD = 5000USD
    //g4 y g10 Auto 8años, 3600cc, 17000USD = 3060USD
    //g5 y g11 Auto 9años, 1200cc, 1100USD = 110 USD
    //g6 y g12 Auto 21años, 1000cc, 14000USD = 0 USD
    //g7 y g13 Auto 19años, 24000cc, 16000USD = 
    
    
    public double calcularTasaSolidaria(int yearActual, double limiteTasaSolidaria){
        var retorno=0.0d;
        
        return retorno;
    }
    
    public boolean esPlacaValida(){
        var retorno=false;
        var longitud=this.placa.length();
        if(longitud==7){
            var caracter1=this.placa.charAt(0);
            var caracter2=this.placa.charAt(1);
            var caracter3=this.placa.charAt(2);
            var caracter4=this.placa.charAt(3);
            var caracter5=this.placa.charAt(4);
            var caracter6=this.placa.charAt(5);
            var caracter7=this.placa.charAt(6);
            
      
        }
        
        return retorno;
    }

}
