/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcedimientosGlobales;

import ArbolBinario.Arbol;
import Grafos.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author marco
 */
public class Procedimientos {
   //Globals
   //--------------Arbol--------------
   //Profundidad
   public  static   int cantidadDeAsignacionesAPro = 0;
   public  static  int cantidadDeComparacionesAPro = 0;
   public static double FinAPro = 0;
   public static double InicioAPro = 0;
   public static double tiempoAPro = 0;
   //Conteo Lineas
   public static int lineasAPro;
   //Anchura
   public  static   int cantidadDeAsignacionesAAnc = 0;
   public  static  int cantidadDeComparacionesAAnc = 0;
   public static double FinAAnc = 0;
   public static double InicioAAnc = 0;
   public static double tiempoAAnc = 0;
   //Conteo Lineas
   public static int lineasAAnc;
   
   //--------------Grafo--------------
   //Profundidad
   public  static   int cantidadDeAsignacionesGPro = 0;
   public  static  int cantidadDeComparacionesGPro = 0;
   public static double FinGPro = 0;
   public static double InicioGPro = 0;
   public static double tiempoGPro = 0;
   //Conteo Lineas
   public static int lineasGPro;
   //Amplitud
   public  static   int cantidadDeAsignacionesGAmp = 0;
   public  static  int cantidadDeComparacionesGAmp = 0;
   public static double FinGAmp= 0;
   public static double InicioGAmp = 0;
   public static double tiempoGAmp = 0;
   //Conteo Lineas
   public static int lineasGAmp;
   
   
   
    public static Procedimientos instance = null;
        public static Procedimientos getInstance(){
            if(instance == null){
                instance = new Procedimientos();
            }
            return instance;
        }
        
    public void recorridoProfundidad(Arbol aux) {
        cantidadDeComparacionesAPro++;
        lineasAPro++;
        if (aux == null) {
            lineasAPro++;
            return;
        }
        lineasAPro++;
        System.out.println("Nodo: "+ aux.num);
        cantidadDeAsignacionesAPro++;
        lineasAPro++;
        recorridoProfundidad(aux.izq);
        cantidadDeAsignacionesAPro++;
        lineasAPro++;
        recorridoProfundidad(aux.der);
    }
    
    public void recorridoAnchura(Arbol aux)  
    { 
        lineasAAnc++;
        Queue<Arbol> queue = new LinkedList<>(); 
        cantidadDeComparacionesAAnc++;
        lineasAAnc++;
        queue.add(aux);
        lineasAAnc++;
        while (!queue.isEmpty())  
        { 
            cantidadDeComparacionesAAnc++;
            cantidadDeAsignacionesAAnc++;
            lineasAAnc++;
            Arbol tempNode = queue.poll();
            lineasAAnc++;
            System.out.println("Nodo: " + tempNode.num); 
  
            /*Enqueue left child */
            cantidadDeComparacionesAAnc++;
            lineasAAnc++;
            if (tempNode.izq != null) { 
                cantidadDeAsignacionesAAnc++;
                lineasAAnc++;
                queue.add(tempNode.izq); 
            } 
  
            /*Enqueue right child */
            cantidadDeComparacionesAAnc++;
            lineasAAnc++;
            if (tempNode.der != null) { 
                cantidadDeAsignacionesAAnc++;
                lineasAAnc++;
                queue.add(tempNode.der); 
            } 
        }
             
    } 
           
   public void profundidadGrafo(Vertice grafo)//metodo que imprime el inicio en profundidadGrafo
        {
            cantidadDeComparacionesGPro++;
            lineasGPro++; 
            if ((grafo == null)|(grafo.visitado == true)){
                lineasGPro++; 
                return;
            }
            else{
                cantidadDeAsignacionesGPro++;
                lineasGPro++; 
                grafo.visitado = true;
                System.out.println("Vertice:" +grafo.num);
                cantidadDeAsignacionesGPro++;
                lineasGPro++; 
                Arco aux = grafo.subListaArcos;
                lineasGPro++; 
                while (aux != null){//cambiar los outPrint por listModel.addElement
                    cantidadDeComparacionesGPro++;
                    lineasGPro++; 
                    cantidadDeAsignacionesGPro++;
                    lineasGPro++; 
                    profundidadGrafo(aux.destino);
                    cantidadDeAsignacionesGPro++;
                    lineasGPro++; 
                    aux = aux.sigA;
                }
            }
        }

   public void amplitudGrafo(Vertice grafo)// metodo para imprimir el inicio en amplitudGrafo
        {
            cantidadDeComparacionesGAmp++;
            lineasGAmp++;
            if (grafo == null){
                lineasGAmp++;
                System.out.println("No hay grafo");
            }
            else
            {
                cantidadDeAsignacionesGAmp++;
                lineasGAmp++;
                Vertice temp = grafo;
                lineasGAmp++;
                while (temp != null)
                {
                    cantidadDeComparacionesGAmp++;
                    lineasGAmp++;
                    System.out.println("Vertice: " + temp.num);
                    cantidadDeAsignacionesGAmp++;
                    lineasGAmp++;
                    Arco aux = temp.subListaArcos;
                    lineasGAmp++;
                    while (aux != null)
                    {
                       cantidadDeComparacionesGAmp++;
                       //System.out.println("Destino: " + aux.destino.num);
                       cantidadDeAsignacionesGAmp++;
                       lineasGAmp++;
                       aux = aux.sigA;
                    }
                    //System.out.println("-----------");
                    cantidadDeAsignacionesGAmp++;
                    lineasGAmp++;
                    temp = temp.sigV;
                }
            }
        }
}
