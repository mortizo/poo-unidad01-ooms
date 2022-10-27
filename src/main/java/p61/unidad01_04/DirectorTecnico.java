/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad01_04;

/**
 *
 * @author Mauricio Ortiz
 */
public class DirectorTecnico extends Persona{
    
    private String nacionalidad;
    private int yearsTrayectoria;

    public DirectorTecnico(String nacionalidad, int yearsTrayectoria) {
        this.nacionalidad = nacionalidad;
        this.yearsTrayectoria = yearsTrayectoria;
    }
    
   
    public void setNacionalidad(String n){
        this.nacionalidad=n;
    }


    public void setYearsTrayectoria(int yearsTrayectoria) {
        this.yearsTrayectoria = yearsTrayectoria;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getYearsTrayectoria() {
        return yearsTrayectoria;
    }

    @Override
    public String mostrarInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
