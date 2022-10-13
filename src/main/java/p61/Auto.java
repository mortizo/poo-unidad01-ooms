/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61;

/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public class Auto {

    String placa;
    String marca;
    String nombrePropietario;
    int year;
    String color;
    double precio;

    public String mostrarInfo() {
        var retorno = " El auto tiene placa: " + this.placa + " es de marca: "
                + this.marca + " y el propietario es: " + this.nombrePropietario
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
        var retorno = 0;

        return retorno;
    }

}
