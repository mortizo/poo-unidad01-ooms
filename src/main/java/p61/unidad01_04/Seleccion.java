/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad01_04;

/**
 *
 * @author morti
 */
public class Seleccion {
    
    private String codigoFIFA;
    private String nombre;
    private int participacionesMundial;
    private DirectorTecnico seleccionador;
    
    
    
    public String obtienePais(){
        var retorno="Desconocido";
                
        switch (codigoFIFA) {
            case "ECU":
                retorno="ECUADOR";
                break;
            case "ARG":
                retorno="ARGENTINA";
                break;
            case "BRA":
                retorno="BRASIL";
                break;
            case "CHI":
                retorno="CHILE";
                break;
            
            default:
                throw new AssertionError();
        }
        
        return retorno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public String getNombre(){
        return this.nombre;
    }

    public String getCodigoFIFA() {
        return codigoFIFA;
    }

    public void setCodigoFIFA(String codigoFIFA) {
        this.codigoFIFA = codigoFIFA;
    }

    public int getParticipacionesMundial() {
        return participacionesMundial;
    }

    public void setParticipacionesMundial(int participacionesMundial) {
        this.participacionesMundial = participacionesMundial;
    }

    public DirectorTecnico getSeleccionador() {
        return seleccionador;
    }

    public void setSeleccionador(DirectorTecnico seleccionador) {
        this.seleccionador = seleccionador;
    }
    
    
}
