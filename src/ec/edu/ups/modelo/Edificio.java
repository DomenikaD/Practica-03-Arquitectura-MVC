/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author Domenika Delgado
 */
public abstract class Edificio extends Empresa {
    
    //Atributos de la clase Padre Edificio
    private int numeroEdificio;
    private int numeroPiso;
    private String personaEncargada;
    private String direccion;
    
    //Constructor Vacio
    public Edificio() { 
    }
    
    //Constructor con todos los atributos propios (Clase Edificio)
    public Edificio(int numeroEdificio, int numeroPiso, String personaEncargada, String direccion) {
        this.numeroEdificio = numeroEdificio;
        this.numeroPiso = numeroPiso;
        this.personaEncargada = personaEncargada;
        this.direccion = direccion;
    }
    
    //Constructor con los atributos de la clase Abuelo (Empresa) mas atributos propios (Clase Edificio)
    public Edificio(int numeroEdificio, int numeroPiso, String personaEncargada, String direccion, String nombredueno, String nombreEmpresa, String telefonoEmpresa, Date fechaDeApertura) {
        super(nombredueno, nombreEmpresa, telefonoEmpresa, fechaDeApertura);
        this.numeroEdificio = numeroEdificio;
        this.numeroPiso = numeroPiso;
        this.personaEncargada = personaEncargada;
        this.direccion = direccion;
    }
    
    //Getters & Setters
    public int getNumeroEdificio() {
        return numeroEdificio;
    }

    public void setNumeroEdificio(int numeroEdificio) {
        this.numeroEdificio = numeroEdificio;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public String getPersonaEncargada() {
        return personaEncargada;
    }

    public void setPersonaEncargada(String personaEncargada) {
        this.personaEncargada = personaEncargada;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    //toString
    @Override
    public String toString() {
        return "Edificio{" + "numeroEdificio=" + numeroEdificio + ", numeroPiso=" + numeroPiso + ", personaEncargada=" + personaEncargada + ", direccion=" + direccion + '}';
    }
    
    
    //Metodo para asignar a una persona su cargo
    public void asignarPersona( String personaEncargada, int numeroEdificio){
        
    }
    
    
    //Metodo para agregar un Edificio
    public boolean agregarEdificio(int numeroEdificio, int numeroPiso){
        return false;
    }
    
    
    //Metoso para eliminar un Edificio
    public void eliminarEdificio(int numeroEdificio){
        
    }
    
    //Metodo Abstracto
    public abstract boolean verificarEdificio();
    


}
