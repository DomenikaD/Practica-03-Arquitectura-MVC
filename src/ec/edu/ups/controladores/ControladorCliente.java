/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Cliente;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Domenika Delgado
 */
public class ControladorCliente{
    
    private SortedSet <Cliente> lista;
    

    /**
     * ControladorCliente
     * Lista como TreeSet.
     */
    public ControladorCliente() {
        lista = new TreeSet<>();
        
    }
    
    /**
     * create
     * @param objeto objeto de tipo Cliente
     */
    public void create(Cliente objeto){
        lista.add(objeto);
    }
    
    /**
     * read
     * Busca el objeto con el codigo o numero de Cliente y lo devuelve 
     * @param codigo codigo de tipo int
     * @return objeto de tipo Cliente con todos sus atributos.
     */
    public Cliente read(int codigo){
        for(Cliente cliente: lista){
            if(cliente.getCodigoCliente() == (codigo)){
                return cliente;
            }
        }
        return null;
    }
    
    /**
     * update
     * Busca el objeto y lo reemplaza por un nuevo objeto
     * @param objeto objeto de tipo Cliente
     */
    public void update(Cliente objeto){
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
        for(Cliente objeto : lista){
            if(objeto.getCodigoCliente() == codigo){
                lista.remove(objeto);
                break;
            }
        }
    }
    
    /**
     * imprimir
     * Lista todo los datos de la Cliente
     */
    public void imprimir(){
        for (Cliente cliente : lista) {
            System.out.println(cliente.toString());
        }
    }
    
}
