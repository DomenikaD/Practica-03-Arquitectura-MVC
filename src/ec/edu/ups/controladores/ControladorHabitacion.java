/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Habitacion;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Domenika Delgado
 */
public class ControladorHabitacion {
    
    private SortedSet <Habitacion> lista;
    

    /**
     * ControladorLactante
     * Lista como TreeSet.
     */
    public ControladorHabitacion() {
        lista = new TreeSet<>();
        
    }
    
    /**
     * create
     * @param objeto objeto de tipo Habitacion
     */
    public void create(Habitacion objeto){
        
        lista.add(objeto);
    }
    
    /**
     * read
     * Busca el objeto con el codigo o numero de Habitacion y lo devuelve 
     * @param codigo codigo de tipo int
     * @return objeto de tipo Habitacion con todos sus atributos.
     */
    public Habitacion read(int codigo){
        for(Habitacion habitacion : lista){
            if(habitacion.getNumeroCuarto() == (codigo)){
                return habitacion;
            }
        }
        return null;
    }
    
    /**
     * update
     * Busca el objeto y lo reemplaza por un nuevo objeto
     * @param objeto objeto de tipo Habitacion
     */
    public void update(Habitacion objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    /**
     * delete
     * Busca el objeto y lo elimina
     * @param codigo codigo de tipo entero.
     */
    public void delete(int codigo){
        for(Habitacion objeto : lista){
            if(objeto.getNumeroCuarto() == codigo){
                lista.remove(objeto);
                break;
            }
        }
    }
    
    /**
     * imprimir
     * Lista todo los datos de la Habitacion
     */
    public void imprimir(){
        for (Habitacion habitacion : lista) {
            System.out.println(habitacion.toString());
        }
    }
    
}
