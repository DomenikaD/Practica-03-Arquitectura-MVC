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
public abstract class Persona extends Empresa {
    
    //Atributos de la clase Padre Persona
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    
    //Constuctor Vacio
    public Persona() {
    }
    
    //Constructor con atributos propios (Clase Persona)
    public Persona(String cedula, String nombre, String apellido, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    //Constructor con los Atributos de la clase Abuelo (Empresa) mas atributos propios (Clase Persona)
    public Persona(String cedula, String nombre, String apellido, int edad, String nombredueno, String nombreEmpresa, String telefonoEmpresa, Date fechaDeApertura) {
        super(nombredueno, nombreEmpresa, telefonoEmpresa, fechaDeApertura);
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    
    //Getters & Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //toString
    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
    
    //Metodo para crear a la persona
    public boolean crearPersona(String cedula, String nombre, String apellido, int edad){
        return false;
    }
    
    
    //Metodo para modificar datos de la Persona
    public boolean modificarPersona(String cedula, String nombre, String apellido, int edad){
        return false;
    }
    
    //Metodo para eliminar persona
    public boolean eliminarPersona(String cedula){
        return false;
    }
    
    //Metodo Abstracto
    public abstract boolean VerificarPersona();  
}
