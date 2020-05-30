/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcedimientosGlobales;

import ArbolBinario.Arbol;
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
   //Anchura
   public  static   int cantidadDeAsignacionesAAnc = 0;
   public  static  int cantidadDeComparacionesAAnc = 0;
   //--------------Grafo--------------
   //Profundidad
   public  static   int cantidadDeAsignacionesGPro = 0;
   public  static  int cantidadDeComparacionesGPro = 0;
   //Amplitud
   public  static   int cantidadDeAsignacionesGAmp = 0;
   public  static  int cantidadDeComparacionesGAmp = 0;
   
   
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
    /*
   public void profundidad(vertice grafo)//metodo que imprime el inicio en profundidad
        {
            if ((grafo == null)|(grafo.marca == true))
                return;
            else{
                grafo.marca = true;
                arco aux = grafo.sigA;
                while (aux != null){//cambiar los outPrint por listModel.addElement
                    System.out.println("Origen: " + grafo.nombre);
                    System.out.println("Peso: " + aux.peso);
                    System.out.println("Destino: " + aux.destino.nombre);
                    profundidad(aux.destino);
                    aux = aux.sigA;
                }
            }
        }

   public void amplitud(vertice grafo)// metodo para imprimir el inicio en amplitud
        {
            if (grafo == null)
                System.out.println("No hay grafo");
            else
            {
                vertice temp = grafo;
                while (temp != null)
                {
                    System.out.println("Vertice: " + temp.nombre);
                    arco aux = temp.sigA;
                    while (aux != null)
                    {
                        //listModel.addElement("Peso: " + aux.peso);
                       System.out.println("Destino: " + aux.destino.nombre);
                        aux = aux.sigA;
                    }
                    System.out.println("-----------");
                    temp = temp.sigV;
                }
            }
        }
   
   */
       
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
                //cantidadDeAsignaciones++;
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
