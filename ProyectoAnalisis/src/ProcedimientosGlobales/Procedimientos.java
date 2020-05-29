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
       public  static   int cantidadDeAsignaciones = 0;
   public  static  int cantidadDeComparaciones = 0;
    
    public static Procedimientos instance = null;
        public static Procedimientos getInstance(){
            if(instance == null){
                instance = new Procedimientos();
            }
            return instance;
        }
        

    public void recorridoProfundidad(Arbol aux) {
        cantidadDeComparaciones++;
        if (aux == null) {
            return;
        }
        System.out.println(aux.num);
        cantidadDeAsignaciones++;
        recorridoProfundidad(aux.izq);
        cantidadDeAsignaciones++;
        recorridoProfundidad(aux.der);
        
        System.out.println("Cantidad de comparaciones:" +" "+ cantidadDeComparaciones);
        System.out.println("Cantidad de asignaciones:" +" "+ cantidadDeAsignaciones);
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
       /* public void MorrisTraversal (Arbol root) 
        {
            Arbol curr = root;
            while (curr != null)
            {
                if (curr.getIzq() != null) 
                {
                    // find inorder predecessor of left subtree
                    Arbol pre = curr.getIzq();
                    while (pre.getDer() != null && pre.getDer() != curr) 
                    {
                        pre = pre.getDer();
                    }
                    if (pre.getDer() == null) 
                    {
                        // Threaded property for this node was not set. Set it now
                        pre.getDer() = curr;
                        curr = curr.getIzq(); // Thread created. Switch to this subtree now
                    } else 
                    {
                        // This means pre.right = curr
                        // Which implies that thread for this was set already, 
                        // So we do not need to traverse this subtree again
                        pre.getDer() = null; // reset the thread we created earlier
                        //print (curr); 
                        curr = curr.getDer();
                    }
                } else 
                {
                    // no left subtree, print yourself and get to right subtree
                    print (curr); 
                    // we will never get right=null till the end because of above threads
                    curr = curr.right; 
                }
            }
        }*/
   /*public void morrisTraversalPreorder(Arbol node) { 
        while (node != null) { 
  
            // If left child is null, print the current node data. Move to 
            // right child. 
            if (node.izq == null) { 
                System.out.println(node.num + " "); 
                node = node.der; 
            } else { 
  
                // Find inorder predecessor 
                Arbol current = node.izq; 
                while (current.der != null && current.der != node) { 
                    current = current.der; 
                } 
  
                // If the right child of inorder predecessor  
                // already points to this node 
                if (current.der == node) { 
                    current.der = null; 
                    node = node.der; 
                } 
   
                // If right child doesn't point to this node, then print 
                // this node and make right child point to this node 
                else { 
                    System.out.println(node.num + " "); 
                    current.der = node; 
                    node = node.izq; 
                } 
            } 
        } 
    }*/ 
    
   public void recorridoAnchura(Arbol aux)  
    { 
      
        Queue<Arbol> queue = new LinkedList<>(); 
        cantidadDeComparaciones++;
        queue.add(aux);  
       
        while (!queue.isEmpty())  
        { 
            cantidadDeComparaciones++;
            cantidadDeAsignaciones++;
            Arbol tempNode = queue.poll(); 
            System.out.println(tempNode.num + " "); 
  
            /*Enqueue left child */
            cantidadDeComparaciones++;
            if (tempNode.izq != null) { 
                //cantidadDeAsignaciones++;
                queue.add(tempNode.izq); 
            } 
  
            /*Enqueue right child */
            cantidadDeComparaciones++;
            if (tempNode.der != null) { 
                cantidadDeAsignaciones++;
                queue.add(tempNode.der); 
            } 
        }
        
        System.out.println("Cantidad de comparaciones:" +" "+ cantidadDeComparaciones);
        System.out.println("Cantidad de asignaciones:" +" "+ cantidadDeAsignaciones);
        
    } 
           
   
}
