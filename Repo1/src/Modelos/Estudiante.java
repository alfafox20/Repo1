/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author laboratorio
 */
public class Estudiante extends Persona{
    
    private int carnetNumero;
    private int anosDeEstudio;

    public Estudiante(int carnetNumero, int anosDeEstudio, int cedula, String nombre, String genero, int telefono, String email) {
        super(cedula, nombre, genero, telefono, email);
        this.carnetNumero = carnetNumero;
        this.anosDeEstudio = anosDeEstudio;
    }

    public Estudiante (){}
    

    public int getCarnetNumero() {
        return carnetNumero;
    }

    public void setCarnetNumero(int carnetNumero) {
        this.carnetNumero = carnetNumero;
    }

    public int getAnosDeEstudio() {
        return anosDeEstudio;
    }

    public void setAnosDeEstudio(int anosDeEstudio) {
        this.anosDeEstudio = anosDeEstudio;
    }
    
    
    
}
 