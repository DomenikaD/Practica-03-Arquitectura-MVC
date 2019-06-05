/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Restaurante;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Domenika Delgado
 */
public class ControladorRestaurante {
    
    private SortedSet <Restaurante> lista;
    

    /**
     * ControladorRestaurante
     * Lista como TreeSet.
     */
    public ControladorRestaurante() {
        lista = new TreeSet<>();
        
    }
    
    /**
     * create
     * @param objeto objeto de tipo Restaurante
     */
    public void create(Restaurante objeto){
        lista.add(objeto);
    }
    
    /**
     * read
     * Busca el objeto con el codigo o numero de Restaurante y lo devuelve 
     * @param codigo codigo de tipo int
     * @return objeto de tipo Restaurante con todos sus atributos.
     */
    public Restaurante read(int codigo){
        for(Restaurante restaurante: lista){
            if(restaurante.getCodigo() == (codigo)){
                return restaurante;
            }
        }
        return null;
    }
    
    /**
     * update
     * Busca el objeto y lo reemplaza por un nuevo objeto
     * @param objeto objeto de tipo Restaurante
     */
    public void update(Restaurante objeto){
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
        for(Restaurante objeto : lista){
            if(objeto.getCodigo() == codigo){
                lista.remove(objeto);
                break;
            }
        }
    }
    
    /**
     * imprimir
     * Lista todo los datos de la Restaurante
     */
    public void imprimir(){
        for (Restaurante restaurante : lista) {
            System.out.println(restaurante.toString());
        }
    }
    
}
