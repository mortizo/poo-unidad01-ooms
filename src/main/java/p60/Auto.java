/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package p60;

/**
 *
 * @author Juan Coraisaca
 */
public class Auto {
    String placa;
    String color;
    int year;
    double precio;
    String marca;
    Propietario unPropietario;
    
    public boolean esTaxi(){
        var retorno = false;
        
        if(this.color=="amarillo"){
            retorno=true;
        }
        
        return retorno;
        
    }
    public int calcularTasaSolidaria(){
        var retorno= 1000000;
        if(this.precio> 0 && this.precio< 1000){
            retorno= 0;
            
        }else{
            if(this.precio>=1001 && this.precio <=10000){
                retorno= 100;
            }else{
                    if(this.precio >= 10001 && this.precio <= 25000 ){
                        retorno= 250;
                    }else{
                        retorno= 370;
                    }
            }
        }
        return retorno;
    }
    
    public double calcularMatricula(int limitYear, int limitPrecio){
        var retorno=10000d;
        if(this.year>=0 && this.year<=limitYear){
            if(this.precio>=0 && this.precio<=limitPrecio)
                retorno=this.precio*0.1;
            else
                retorno=this.precio*0.2;
        }else{
             if(this.precio>=0 && this.precio<=limitPrecio)
                retorno=this.precio*0.15;
            else
                retorno=this.precio*0.25;           
        }
        return retorno;
    }
    
    public String obtenerProvincia(){
        var retorno="TBD";
        var primerCaracterPlaca=this.placa.charAt(0);
        switch(primerCaracterPlaca)
        {
            case 'A':
                retorno="Azuay";
                break;
            case 'B':
                retorno="Bolivar";
                break;
            case 'C':
                retorno="Carchi";
                break;
            case 'U':
                retorno="Cañar";
                break;
            case 'G':
                retorno="Guayas";
                break;
            case 'P':
                retorno="Pichincha";
                break;
            default:
                retorno="Provincia no disponible";
        }
        return retorno;
    }  
    
    public int calcularYears(int currentYear){
        var retorno=1000;
        retorno=currentYear-this.year;
        return retorno;
    }
    
    private boolean sePuedeAsegurar(int currentYear, int edadMaxima){
        return this.calcularYears(currentYear)<=edadMaxima;
    }
    
    public boolean esProvinciaDe(String provincia)
    {
        var retorno=false;
        var primeraLetraPlaca=this.placa.substring(0, 1);
        
        if(provincia=="Azuay" && primeraLetraPlaca=="A")
            retorno=true;
        if(provincia=="Guayas" && primeraLetraPlaca=="G")
            retorno=true;
        if(provincia=="Cañar" && primeraLetraPlaca=="U")
            retorno=true;
        if(provincia=="Pichincha" && primeraLetraPlaca=="P")
            retorno=true;
        
        return retorno;
    }
    
    
    public boolean esNumeros(String cadena){
        boolean retorno=true;
        if(cadena.length()==4){
            if(!Character.isDigit(cadena.charAt(0)))
                retorno=false;
            if(!Character.isDigit(cadena.charAt(1)))
                retorno=false;
            if(!Character.isDigit(cadena.charAt(2)))
                retorno=false;
            if(!Character.isDigit(cadena.charAt(3)))
                retorno=false;
        }else{
            retorno=false;
        }
        return retorno;
    }
    
    public boolean esLetras(String cadena){
        boolean retorno=true;
        if(cadena.length()==3)
        {
            if(!Character.isAlphabetic(cadena.charAt(0)))
                retorno=false;
            if(!Character.isAlphabetic(cadena.charAt(1)))
                retorno=false;
            if(!Character.isAlphabetic(cadena.charAt(2)))
                retorno=false;
        }else{
            retorno=false;
        }
        return retorno;
    }
    
    public boolean esNLetras(String cadena){
        var retorno=true;
        var i=0; 
        var cList = new char[cadena.length()];
        while(i<cadena.length()){
            cList[i]=cadena.charAt(i);
            if(!Character.isAlphabetic(cList[i]))
                retorno=false;
            i++;
        }
        return retorno;
    }
    
}

   

