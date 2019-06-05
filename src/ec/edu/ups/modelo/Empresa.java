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
public class Empresa { 
    
    //Atributos de la clase Abuelo Empresa
    private String nombredueno;
    private String nombreEmpresa;
    private String telefonoEmpresa;
    private Date fechaDeApertura;

    //Constructor Vacio es para instanciar 
    public Empresa() {
    }
    
    //Constructor con atributos propios menos FechaApertura (Clase Empresa)
    public Empresa(String nombredueno, String nombreEmpresa, String telefonoEmpresa) {    
        this.nombredueno = nombredueno;
        this.nombreEmpresa = nombreEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
    }

    //Constructor con todo los atributos propios (Clase Empresa)
    public Empresa(String nombredueno, String nombreEmpresa, String telefonoEmpresa, Date fechaDeApertura) {
        this.nombredueno = nombredueno;
        this.nombreEmpresa = nombreEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.fechaDeApertura = fechaDeApertura;
    }
    
    //Getters & Setters
    public String getNombredueno() {
        return nombredueno;
    }

    public void setNombredueno(String nombredueno) {
        this.nombredueno = nombredueno;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public Date getFechaDeApertura() {
        return fechaDeApertura;
    }

    public void setFechaDeApertura(Date fechaDeApertura) {
        this.fechaDeApertura = fechaDeApertura;
    }
    
    
    //toString
    @Override
    public String toString() {
        return "Empresa{" + "nombredueno=" + nombredueno + ", nombreEmpresa=" + nombreEmpresa + ", telefonoEmpresa=" + telefonoEmpresa + ", fechaDeApertura=" + fechaDeApertura + '}';
    }
    
    
    //Metodo de agregar una Empresa
    public boolean agregarEmpresa(String nombreDueno, String nombreEmpresa, String telefonoEmpresa, Date fechaApertua){
        return false;
    }
    
    //Metodo para modificar nombre de la Empresa
    public void modificarNombreEmpresa(String nombreDueno, String nombreEmpresa){
        
    }
    
    //Metodo para eliminar empresa
    public void eliminarEmpresa(String nombreDueno, String nombreEmpresa){
        
    }
}
