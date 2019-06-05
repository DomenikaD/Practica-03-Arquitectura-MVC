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
public final class Restaurante extends Edificio { 
    
   //Atributos de la clase Hija Restaurante
    private int numeroMesa;
    private int cantidadPersona;
    private String descripcion;
    private int calificacion;
    
    //Constrcutor Vacio

    public Restaurante() {
    }
    
    //Constructor con atributos propios (Clase Restaurante)
    public Restaurante(int numeroMesa, int cantidadPersona, String descripcion, int calificacion) {
        this.numeroMesa = numeroMesa;
        this.cantidadPersona = cantidadPersona;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
    }
    
    //Constructor con los Atributos de la clase Padre (Edificio) mas atributos propios (Clase Restaurante)
    public Restaurante(int numeroMesa, int cantidadPersona, String descripcion, int calificacion, int numeroEdificio, int numeroPiso, String personaEncargada, String direccion, String nombredueno, String nombreEmpresa, String telefonoEmpresa, Date fechaDeApertura) {
        super(numeroEdificio, numeroPiso, personaEncargada, direccion, nombredueno, nombreEmpresa, telefonoEmpresa, fechaDeApertura);
        this.numeroMesa = numeroMesa;
        this.cantidadPersona = cantidadPersona;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
    }
    
    //Getters & Setters
    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getCantidadPersona() {
        return cantidadPersona;
    }

    public void setCantidadPersona(int cantidadPersona) {
        this.cantidadPersona = cantidadPersona;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    
    //toString
    @Override
    public String toString() {
        return "Restaurante{" + "numeroMesa=" + numeroMesa + ", cantidadPersona=" + cantidadPersona + ", descripcion=" + descripcion + ", calificacion=" + calificacion + '}';
    }
    
    //Metodo para agregar la calificacion del restuaurante
    public boolean agregarCalificacion(int numeroMesa, int cantidadPersona, String descripcion, int calificacion){
        return false;
    }
    
    
    //Metodo para modificar la calficacion ya ingresada del restaurante
    public boolean modificarCalificacion(int numeroMesa, int cantidadPersona, String descripcion, int calificacion){
        return false;
    }
    
    
    //Metodo para ingresar una mesa
    public void ingresarMesa(int numeroMesa, int cantidadPersona){
        
    }

    //Implementacion del Metodo Abstracto de la clase Padre(Edifico) 
    @Override
    public boolean verificarEdificio() {
        return false; 
    }

    
    
}

