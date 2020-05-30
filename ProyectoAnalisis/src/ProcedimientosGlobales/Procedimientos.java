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
   public static long FinAPro = 0;
   public static long InicioAPro = 0;
   public static long tiempoAPro = 0;
   //Anchura
   public  static   int cantidadDeAsignacionesAAnc = 0;
   public  static  int cantidadDeComparacionesAAnc = 0;
   public static long FinAAnc = 0;
   public static long InicioAAnc = 0;
   public static long tiempoAAnc = 0;
   //--------------Grafo--------------
   //Profundidad
   public  static   int cantidadDeAsignacionesGPro = 0;
   public  static  int cantidadDeComparacionesGPro = 0;
   public static long FinGPro = 0;
   public static long InicioGPro = 0;
   public static long tiempoGPro = 0;
   //Amplitud
   public  static   int cantidadDeAsignacionesGAmp = 0;
   public  static  int cantidadDeComparacionesGAmp = 0;
   public static long FinGAmp= 0;
   public static long InicioGAmp = 0;
   public static long tiempoGAmp = 0;
   
   
    public static Procedimientos instance = null;
        public static Procedimientos getInstance(){
            if(instance == null){
                instance = new Procedimientos();
            }
            return instance;
        }
        
    public void recorridoProfundidad(Arbol aux) {
        
        cantidadDeComparacionesAPro++;
        if (aux == null) {
            return;
        }
        //System.out.println(aux.num);
        cantidadDeAsignacionesAPro++;
        recorridoProfundidad(aux.izq);
        cantidadDeAsignacionesAPro++;
        recorridoProfundidad(aux.der);
    }
    
   public void profundidadGrafo(Vertice grafo)//metodo que imprime el inicio en profundidadGrafo
        {
                cantidadDeComparacionesGPro++;
            if ((grafo == null)|(grafo.visitado == true))
                return;
            else{
                cantidadDeAsignacionesGPro++;
                grafo.visitado = true;
                cantidadDeAsignacionesGPro++;
                Arco aux = grafo.subListaArcos;
                while (aux != null){//cambiar los outPrint por listModel.addElement
                    cantidadDeComparacionesGPro++;
                   /* System.out.println("Origen: " + grafo.num);
                    System.out.println("Peso: " + aux.size);
                    System.out.println("Destino: " + aux.destino.sigV);*/
                    cantidadDeAsignacionesGPro++;
                    profundidadGrafo(aux.destino);
                    cantidadDeAsignacionesGPro++;
                    aux = aux.sigA;
                }
            }
        }

   public void amplitudGrafo(Vertice grafo)// metodo para imprimir el inicio en amplitudGrafo
        {
            cantidadDeComparacionesGAmp++;
            if (grafo == null)
                System.out.println("No hay grafo");
            else
            {
                cantidadDeAsignacionesGAmp++;
                Vertice temp = grafo;
                while (temp != null)
                {
                    cantidadDeComparacionesGAmp++;
                    //System.out.println("Vertice: " + temp.num);
                    cantidadDeAsignacionesGAmp++;
                    Arco aux = temp.subListaArcos;
                    while (aux != null)
                    {
                        cantidadDeComparacionesGAmp++;
                       //System.out.println("Destino: " + aux.destino.num);
                       cantidadDeAsignacionesGAmp++;
                        aux = aux.sigA;
                    }
                    //System.out.println("-----------");
                    cantidadDeAsignacionesGAmp++;
                    temp = temp.sigV;
                }
            }
        }
   
   
       
   public void recorridoAnchura(Arbol aux)  
    { 
       
        Queue<Arbol> queue = new LinkedList<>(); 
        cantidadDeComparacionesAAnc++;
        queue.add(aux);  
       
        while (!queue.isEmpty())  
        { 
            cantidadDeComparacionesAAnc++;
            cantidadDeAsignacionesAAnc++;
            Arbol tempNode = queue.poll(); 
            //System.out.println(tempNode.num + " "); 
  
            /*Enqueue left child */
            cantidadDeComparacionesAAnc++;
            if (tempNode.izq != null) { 
                cantidadDeAsignacionesAAnc++;
                queue.add(tempNode.izq); 
            } 
  
            /*Enqueue right child */
            cantidadDeComparacionesAAnc++;
            if (tempNode.der != null) { 
                cantidadDeAsignacionesAAnc++;
                queue.add(tempNode.der); 
            } 
        }
             
    } 
           
   
}
