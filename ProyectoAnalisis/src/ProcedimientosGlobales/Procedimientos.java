/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcedimientosGlobales;
//importaciones

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
    //Variables para recorrido de porfundidad del árbol binario

    public static int cantidadDeAsignacionesAPro = 0;
    public static int cantidadDeComparacionesAPro = 0;
    public static double FinAPro = 0;
    public static double InicioAPro = 0;
    public static double tiempoAPro = 0;
    //Conteo Lineas
    public static int lineasAPro;
    //Variables para recorrido de anchura del árbol binario
    public static int cantidadDeAsignacionesAAnc = 0;
    public static int cantidadDeComparacionesAAnc = 0;
    public static double FinAAnc = 0;
    public static double InicioAAnc = 0;
    public static double tiempoAAnc = 0;
    //Conteo Lineas
    public static int lineasAAnc;

    //--------------Grafo--------------
    //Variables para recorrido de porfundidad del grafo
    public static int cantidadDeAsignacionesGPro = 0;
    public static int cantidadDeComparacionesGPro = 0;
    public static double FinGPro = 0;
    public static double InicioGPro = 0;
    public static double tiempoGPro = 0;
    //Conteo Lineas
    public static int lineasGPro;
    //Variables para recorrido de amplitud del grafo
    public static int cantidadDeAsignacionesGAmp = 0;
    public static int cantidadDeComparacionesGAmp = 0;
    public static double FinGAmp = 0;
    public static double InicioGAmp = 0;
    public static double tiempoGAmp = 0;
    //Conteo Lineas
    public static int lineasGAmp;

    //creación de la instancia, singleton
    public static Procedimientos instance = null;

    public static Procedimientos getInstance() {
        if (instance == null) {
            instance = new Procedimientos();
        }
        return instance;
    }
    //recorrido recursivo por profundidad del árbol binario, también llamado recorrido en preorden

    public void recorridoProfundidad(Arbol aux) {
        cantidadDeComparacionesAPro++;
        lineasAPro++;
        if (aux == null) {//condición de parada
            lineasAPro++;
            return;
        }
        lineasAPro++;
        System.out.println("Nodo: " + aux.num);
        cantidadDeAsignacionesAPro++;
        lineasAPro++;
        recorridoProfundidad(aux.izq);//recursión
        cantidadDeAsignacionesAPro++;
        lineasAPro++;
        recorridoProfundidad(aux.der);//recursión
    }

    //recorrido iterativo por anchura del árbol binario
    public void recorridoAnchura(Arbol aux) {
        lineasAAnc++;
        Queue<Arbol> queue = new LinkedList<>();//se utiliza cola en vez de pila
        cantidadDeComparacionesAAnc++;
        lineasAAnc++;
        queue.add(aux);//se guarda en cola
        lineasAAnc++;
        while (!queue.isEmpty()) //pregunta si la cola está vacía
        {
            cantidadDeComparacionesAAnc++;
            cantidadDeAsignacionesAAnc++;
            lineasAAnc++;
            Arbol tempNode = queue.poll();// devuelve y elimina el elemento en la parte frontal del contenedor.
            lineasAAnc++;
            System.out.println("Nodo: " + tempNode.num);

            /*pone en cola el hijo izquierdo */
            cantidadDeComparacionesAAnc++;
            lineasAAnc++;
            if (tempNode.izq != null) {
                cantidadDeAsignacionesAAnc++;
                lineasAAnc++;
                queue.add(tempNode.izq); //se guarda en cola
            }

            /*pone en cola el hijo derecho */
            cantidadDeComparacionesAAnc++;
            lineasAAnc++;
            if (tempNode.der != null) {
                cantidadDeAsignacionesAAnc++;
                lineasAAnc++;
                queue.add(tempNode.der); //se guarda en cola
            }
        }
    }

    public void profundidadGrafo(Vertice grafo)//método recursivo que imprime el inicio en profundidad de un Grafo
    {
        cantidadDeComparacionesGPro++;
        lineasGPro++;
        if ((grafo == null) | (grafo.visitado == true)) {//condiciones de parada
            lineasGPro++;
            return;
        } else {
            cantidadDeAsignacionesGPro++;
            lineasGPro++;
            grafo.visitado = true;//mueve marca de false a true
            lineasGPro++;
            System.out.println("Vertice:" + grafo.num);
            cantidadDeAsignacionesGPro++;
            lineasGPro++;
            Arco aux = grafo.subListaArcos;
            lineasGPro++;
            while (aux != null) {//se podría imprimir la información de los vértices y sus arcos si se quiere
                cantidadDeComparacionesGPro++;
                cantidadDeAsignacionesGPro++;
                lineasGPro++;
                profundidadGrafo(aux.destino);//recursión
                cantidadDeAsignacionesGPro++;
                lineasGPro++;
                aux = aux.sigA;
            }
        }
    }

    public void amplitudGrafo(Vertice grafo)// método para imprimir el inicio en amplitud de un Grafo
    {
        cantidadDeComparacionesGAmp++;
        lineasGAmp++;
        if (grafo == null) {//si no hay vértices
            lineasGAmp++;
            System.out.println("No hay grafo");
        } else {
            cantidadDeAsignacionesGAmp++;
            lineasGAmp++;
            Vertice temp = grafo;//se posiciona en el vértice
            lineasGAmp++;
            while (temp != null)//condición para ir al siguiente vértice
            {
                cantidadDeComparacionesGAmp++;
                lineasGAmp++;
                System.out.println("Vertice: " + temp.num);
                cantidadDeAsignacionesGAmp++;
                lineasGAmp++;
                Arco aux = temp.subListaArcos;//posicionarse en los arcos del vértice
                lineasGAmp++;
                while (aux != null)//condición para ir al siguiente arco
                {
                    cantidadDeComparacionesGAmp++;
                    cantidadDeAsignacionesGAmp++;
                    lineasGAmp++;
                    aux = aux.sigA;
                }
                cantidadDeAsignacionesGAmp++;
                lineasGAmp++;
                temp = temp.sigV;
            }
        }
    }
}
