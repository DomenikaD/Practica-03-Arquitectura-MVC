/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/*
 *
 * @author Domenika Delgado
 */

import ec.edu.ups.interfaz.Interfaz;
import java.util.Date;

public final class Habitacion extends Edificio implements Interfaz { 
    
   //Atributos de la clase Hija Habitacion
    private int numeroCuarto;
    private int numeroPersonas;
    private Date fechaIngreso;
    private Date fechaSalida;
    
    
    //Constructor Vacio
    public Habitacion() {
    }
    
    
    //Constructor con atributos propios (Clase Habitacion)
    public Habitacion(int numeroCuarto, int numeroPersonas, Date fechaIngreso, Date fechaSalida) {
        this.numeroCuarto = numeroCuarto;
        this.numeroPersonas = numeroPersonas;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }
    
     
    //Constructor con los Atributos de la clase Padre (Edificio) mas atributos propios (Clase Habitacion)
    public Habitacion(int numeroCuarto, int numeroPersonas, Date fechaIngreso, Date fechaSalida, int numeroEdificio, int numeroPiso, String personaEncargada, String direccion, String nombredueno, String nombreEmpresa, String telefonoEmpresa, Date fechaDeApertura) {
        super(numeroEdificio, numeroPiso, personaEncargada, direccion, nombredueno, nombreEmpresa, telefonoEmpresa, fechaDeApertura);
        this.numeroCuarto = numeroCuarto;
        this.numeroPersonas = numeroPersonas;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }
    
    
    //Getters & Setters
    public int getNumeroCuarto() {
        return numeroCuarto;
    }

    public void setNumeroCuarto(int numeroCuarto) {
        this.numeroCuarto = numeroCuarto;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
     
    //toString
    @Override
    public String toString() {
        return "Habitacion{" + "numeroCuarto=" + numeroCuarto + ", numeroPersonas=" + numeroPersonas + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + '}';
    }
    
    
    //Metodo para reservar habitacion
    public boolean reservarHabitacion(int numeroCuarto, int numeroPersonas, Date fechaIngreso, Date fechaSalida){
        return false;
    }
    
    
    //Metodo para cancelar la habitacion
    public boolean cancelarHabitacion(int numeroCuarto){
        return false;
    }
    
    //Metodo para el costo de la habitacion
    public double costo(Date fechaIngreso, Date fechaSalida){
        return 0;
        
    }

    //Implementacion del Metodo Abstracto de la clase Padre(Edifico) 
    @Override
    public boolean verificarEdificio() {
        return false;
    }

    
    //Implementacion de los Metodos Abstractos del Paquete ec.edu.ups.interfaz (Clase Interfaz)
    @Override
    public String ubicacion() {
        return "Nombre "+ super.getDireccion();
    }

    @Override
    public String informacion() {
       return "Nombre " + super.getPersonaEncargada();
    }
    
}


