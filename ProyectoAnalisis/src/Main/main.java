/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import ArbolBinario.*;

/**
 *
 * @author Lester Trejos
 */
public class main {
    
    static MetodosArbol metArbol = MetodosArbol.getInstance();
    
    public static void main(String[] args) {
        
        int cant = 10;
      
        for (int i = 0; i < cant; i++) {
            
            llenarArbol(i);
            
        }
        Arbol aux = metArbol.raiz;
        metArbol.preOrden(aux);
    }
    
    public static void llenarArbol(int i){
  
        Arbol aux = metArbol.raiz;
        String result = metArbol.insertar(aux);
    }

}
