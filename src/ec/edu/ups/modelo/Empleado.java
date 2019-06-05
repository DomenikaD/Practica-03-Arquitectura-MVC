/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.interfaz.Interfaz;
import java.util.Date;

/**
 *
 * @author Domenika Delgado
 */
public final class Empleado extends Persona implements Interfaz { 
    
    //Atributos de la clase Hija Empleado
    private int codigo;
    private String cargo;
    private double salario;
    private Date horario;
    
    //Constructor Vacio
    public Empleado() {
    }
    
    //Constructor con atibutos propios (Clase Empleado)
    public Empleado(int codigo, String cargo, double salario, Date horario) {
        this.codigo = codigo;
        this.cargo = cargo;
        this.salario = salario;
        this.horario = horario;
    }
    
    //Constructor con los Atributos de la clase Padre (Persona) mas atributos propios (Clase Empleado)
    public Empleado(int codigo, String cargo, double salario, Date horario, String cedula, String nombre, String apellido, int edad, String nombredueno, String nombreEmpresa, String telefonoEmpresa, Date fechaDeApertura) {
        super(cedula, nombre, apellido, edad, nombredueno, nombreEmpresa, telefonoEmpresa, fechaDeApertura);
        this.codigo = codigo;
        this.cargo = cargo;
        this.salario = salario;
        this.horario = horario;
    }

    
    //Getters & Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }
    
    //toString
    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + ", cargo=" + cargo + ", salario=" + salario + ", horario=" + horario + '}';
    }
    
    
    //Metodo para crear al empleado
    public boolean crearEmpleado(int codigo, String cargo, double salario, Date horario){
        return false;
    }
    
    //Metodo para modificar datos de un empleado
    public boolean modificarEmpleado(int codigo, String cargo, double salario, Date horario){
        return false;
    }
    
    //Metodo para eliminar un empleado
    public boolean emliminarEmpleado(int codigo){
        return false;
    }

    
    //Implementacion del Metodo Abstracto de la clase Padre(Persona)
    @Override  
    public boolean VerificarPersona() {
        return false;
    }
              

    
    //Implementacion de los Metodos Abstractos del Paquete ec.edu.ups.interfaz (Clase Interfaz)
    @Override
    public String ubicacion() {
         return "Ubicacion " + super.getNombreEmpresa();
        
    }
    

    @Override
    public String informacion() {
        return "Nombre "+ super.getNombre() + super.getApellido();
    }
}

