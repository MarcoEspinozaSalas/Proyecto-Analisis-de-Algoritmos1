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
        
        System.out.println("------------Arbol--------------");
        
        
        Arbol aux = metArbol.raiz;
        metProcedimientos.recorridoProfundidad(aux);
        System.out.println("Cantidad de comparaciones:" +" "+ metProcedimientos.cantidadDeComparacionesAPro);
        System.out.println("Cantidad de asignaciones:" +" "+ metProcedimientos.cantidadDeAsignacionesAPro);
        System.out.println("_______________________________");
        metProcedimientos.recorridoAnchura(aux);
        System.out.println("Cantidad de comparaciones:" +" "+ metProcedimientos.cantidadDeComparacionesAAnc);
        System.out.println("Cantidad de asignaciones:" +" "+ metProcedimientos.cantidadDeAsignacionesAAnc);
        
        System.out.println("------------Grafo--------------");

        
        //mg.insertAutomatico(10000);
        
        //System.out.println("hola");
        
        //System.out.println(mg.fuerteConexo());
        
        //mg.buscar(100000);
       
    }
    
    public static void llenarArbol(int i){
  
        Arbol aux = metArbol.raiz;
        String result = metArbol.insertar(aux);
        //System.out.println(result);
    }

}
