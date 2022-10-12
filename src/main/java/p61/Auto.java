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

    public String mostrarInfo() {
        var retorno = " El auto tiene placa: "+this.placa+" es de marca: "
                +this.marca+" y el propietario es: "+this.nombrePropietario;

        return retorno;
    }

    public String getProvincia() {
        var retorno = "";

        return retorno;
    }

    public String getPaisMarca() {
        var retorno = "";

        return retorno;
    }

    public int getNumeroContinente() {
        var retorno = 0;

        return retorno;
    }

}
