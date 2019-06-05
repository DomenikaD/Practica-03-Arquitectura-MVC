/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Empleado;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Domenika Delgado
 */
public class ControladoEmpleado {
    
    private SortedSet <Empleado> lista;
    

    /**
     * ControladorEmpleado
     * Lista como TreeSet.
     */
    public ControladoEmpleado() {
        lista = new TreeSet<>();
    }
    
    /**
     * create
     * @param objeto objeto de tipo Empleado
     */
    public void create(Empleado objeto){
        lista.add(objeto);
    }
    
    /**
     * read
     * Busca el objeto con el codigo o numero de Empleado y lo devuelve 
     * @param codigo codigo de tipo int
     * @return objeto de tipo Empleado con todos sus atributos.
     */
    public Empleado read(int codigo){
        for(Empleado empleado: lista){
            if(empleado.getCodigo() == (codigo)){
                return empleado;
            }
        }
        return null;
    }
    
    /**
     * update
     * Busca el objeto y lo reemplaza por un nuevo objeto
     * @param objeto objeto de tipo Empleado
     */
    public void update(Empleado objeto){
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
        for(Empleado objeto : lista){
            if(objeto.getCodigo() == codigo){
                lista.remove(objeto);
                break;
            }
        }
    }
    
    /**
     * imprimir
     * Lista todo los datos de la Empleado
     */
    public void imprimir(){
        for (Empleado empleado : lista) {
            System.out.println(empleado.toString());
        }
    }
    
}

