/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import ArbolBinario.*;
import ProcedimientosGlobales.Procedimientos;

import Grafos.MetodosGrafo;
import Grafos.Vertice;

/**
 *
 * @author Lester Trejos
 */
public class main {
    static MetodosGrafo mg = new MetodosGrafo();

    
    static MetodosArbol metArbol = MetodosArbol.getInstance();
    static Procedimientos metProcedimientos = Procedimientos.getInstance();
     static MetodosGrafo metGrafo = MetodosGrafo.getInstance();
    
    public static void main(String[] args) {
        
        int cant = 500000;
      
        for (int i = 0; i < cant; i++) {
            
            llenarArbol(i);
            
        }
        
        System.out.println("------------Arbol--------------");
        
        
        Arbol aux = metArbol.raiz;
        metProcedimientos.InicioAPro = System.currentTimeMillis();
        metProcedimientos.recorridoProfundidad(aux);
           metProcedimientos.FinAPro = System.currentTimeMillis();
         metProcedimientos.tiempoAPro = metProcedimientos.FinAPro - metProcedimientos.InicioAPro;
        System.out.println("Cantidad de comparaciones:" +" "+ metProcedimientos.cantidadDeComparacionesAPro);
        System.out.println("Cantidad de asignaciones:" +" "+ metProcedimientos.cantidadDeAsignacionesAPro);
        System.out.println("Cantidad de tiempo ejecucion en milisegundos:" +" "+ metProcedimientos.tiempoAPro );
        System.out.println("_______________________________");
        metProcedimientos.InicioAAnc = System.currentTimeMillis();
        metProcedimientos.recorridoAnchura(aux);
        metProcedimientos.FinAAnc = System.currentTimeMillis();
        metProcedimientos.tiempoAAnc = metProcedimientos.FinAAnc -metProcedimientos.InicioAAnc ;
        System.out.println("Cantidad de comparaciones:" +" "+ metProcedimientos.cantidadDeComparacionesAAnc);
        System.out.println("Cantidad de asignaciones:" +" "+ metProcedimientos.cantidadDeAsignacionesAAnc);
        System.out.println("Cantidad de tiempo ejecucion en milisegundos:" +" "+ metProcedimientos.tiempoAAnc);
        
        System.out.println("------------Grafo--------------");
        mg.insertAutomatico(1000);     
        System.out.println(mg.fuerteConexo());
        metProcedimientos.InicioGAmp = System.currentTimeMillis();
        metProcedimientos.amplitudGrafo(metGrafo.grafo);
        metProcedimientos.FinGAmp =  System.currentTimeMillis();
        metProcedimientos.tiempoGAmp = metProcedimientos.FinGAmp -metProcedimientos.InicioGAmp;
        System.out.println("Cantidad de comparaciones:" +" "+ metProcedimientos.cantidadDeComparacionesGAmp);
        System.out.println("Cantidad de asignaciones:" +" "+ metProcedimientos.cantidadDeAsignacionesGAmp);
        System.out.println("Cantidad de tiempo ejecucion en milisegundos:" +" "+  metProcedimientos.tiempoGAmp);
        System.out.println("_______________________________");
        metProcedimientos.InicioGPro = System.currentTimeMillis();
        metProcedimientos.profundidadGrafo(metGrafo.grafo);
        metProcedimientos.FinGPro = System.currentTimeMillis();
        metProcedimientos.tiempoGPro = metProcedimientos.FinGPro - metProcedimientos.InicioGPro;
        System.out.println("Cantidad de comparaciones:" +" "+ metProcedimientos.cantidadDeComparacionesGPro);
        System.out.println("Cantidad de asignaciones:" +" "+ metProcedimientos.cantidadDeAsignacionesGPro);
        System.out.println("Cantidad de tiempo ejecucion en milisegundos:" +" "+  metProcedimientos.tiempoGPro );
         System.out.println("_______________________________");
        
       
    }
    
    public static void llenarArbol(int i){
  
        Arbol aux = metArbol.raiz;
        String result = metArbol.insertar(aux);
        //System.out.println(result);
    }

}
