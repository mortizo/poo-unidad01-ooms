/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad01_04;

/**
 *
 * @author morti
 */
public class DirectorTecnico {
    
    private String nombre;
    private int fechaNacimiento;
    private String nacionalidad;
    private int yearsTrayectoria;
    
    public String mostrarInfo(){
        return "El técnico se llama: "+this.nombre+" es de nacionalidad"
                +this.nacionalidad+" Nació en el año:"
                +this.fechaNacimiento+" tiene "+this.yearsTrayectoria
                +" años de trayectoria";
    }
    
    public void setNombre(String n){
        this.nombre=n;
    }
    
    public void setNacionalidad(String n){
        this.nacionalidad=n;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setYearsTrayectoria(int yearsTrayectoria) {
        this.yearsTrayectoria = yearsTrayectoria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getYearsTrayectoria() {
        return yearsTrayectoria;
    }
    
    
    
    
}
