/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad01_04;

/**
 *
 * @author morti
 */
public class Mascota {
    
    private String nombre;
    private String tipoAnimal;
    private String raza;
    private double peso;
    private Dueño owner;

    public Mascota(String nombre, String tipoAnimal, String raza, double peso
            , Dueño owner) {
        this.nombre = nombre;
        this.tipoAnimal = tipoAnimal;
        this.raza = raza;
        this.peso = peso;
        this.owner = owner;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Dueño getOwner() {
        return owner;
    }

    public void setOwner(Dueño owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", tipoAnimal=" + tipoAnimal 
                + ", raza=" + raza + ", peso=" + peso + ", owner=" + owner.getNombre()+ '}';
    }
    
    
    
    
    
}
