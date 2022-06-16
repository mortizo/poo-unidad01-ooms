/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60;

/**
 *
 * @author morti
 */
public class Gato extends AnimalDomestico{
    
    private int numeroVidas;
    private int numeroAccidentesFatales;
    
    //Constructores

    public Gato(int numeroVidas, int numeroAccidentesFatales) {
        this.numeroVidas = numeroVidas;
        this.numeroAccidentesFatales = numeroAccidentesFatales;
    }
    
    public Gato(int numeroVidas) {
        this.numeroVidas = numeroVidas;
    }
    
    
    
    
    
    
    
    
    public int calcularVidasRestantes(){
        return this.numeroVidas-this.numeroAccidentesFatales;
    }
    
    
    //Getters & Setters

    public int getNumeroVidas() {
        return numeroVidas;
    }

    public void setNumeroVidas(int numeroVidas) {
        this.numeroVidas = numeroVidas;
    }

    public int getNumeroAccidentesFatales() {
        return numeroAccidentesFatales;
    }

    public void setNumeroAccidentesFatales(int numeroAccidentesFatales) {
        this.numeroAccidentesFatales = numeroAccidentesFatales;
    }
    
    
}
