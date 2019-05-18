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
public class Docente extends Persona{ //Herencia "después de docente se pone extends y la clase Madre

    private String especialidad;

    
    //después de la herencia se crea un constructor que abarca la clase madre y la hija
    public Docente(String especialidad, int cedula, String nombre, String genero, int telefono, String email) {
        super(cedula, nombre, genero, telefono, email);
        this.especialidad = especialidad;
    }
    
    public Docente (){
    }
    

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
   
   
   
}





