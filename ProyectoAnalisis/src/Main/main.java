/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import ArbolBinario.*;
import ProcedimientosGlobales.Procedimientos;

import Grafos.MetodosGrafo;

/**
 *
 * @author Lester Trejos
 */
public class main {
    static MetodosGrafo mg = new MetodosGrafo();

    
    static MetodosArbol metArbol = MetodosArbol.getInstance();
    static Procedimientos metProcedimientos = Procedimientos.getInstance();
    
    public static void main(String[] args) {
        
        int cant = 1000;
      
        for (int i = 0; i < cant; i++) {
            
            llenarArbol(i);
            
        }
        Arbol aux = metArbol.raiz;
        metProcedimientos.recorridoProfundidad(aux);
        //System.out.println(metProcedimientos);
        System.out.println("----------------------------------");

        //metProcedimientos.recorridoAnchura(aux);
      
    }
    
    public static void llenarArbol(int i){
  
        Arbol aux = metArbol.raiz;
        String result = metArbol.insertar(aux);
        System.out.println(result);
    }

}
