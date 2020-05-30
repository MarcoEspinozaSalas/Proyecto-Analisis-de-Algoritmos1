/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
//importaciones

import ArbolBinario.*;
import ProcedimientosGlobales.*;

import Grafos.*;

/**
 *
 * @author Lester Trejos
 */
public class main {

    //llamadas a las instancias de cada clase
    static MetodosGrafo mg = new MetodosGrafo();
    static MetodosArbol metArbol = MetodosArbol.getInstance();
    static Procedimientos metProcedimientos = Procedimientos.getInstance();
    static MetodosGrafo metGrafo = MetodosGrafo.getInstance();

    public static void main(String[] args) {//llamadas a los métodos de inserción

        medicionArbol();

        medicionGrafo();

    }

    static boolean llenarArbol(int i) { //llamada al metodo de insercion
        Arbol aux = metArbol.raiz;
        boolean result = metArbol.insertar(aux);
        return result;
    }

    static void medicionArbol() { //medicion de los datos del árbol binario
        System.out.println("------------Arbol--------------");
        int cant = 1000;
        //int cant = 5000;
        //int cant = 10000;
        //int cant = 100000;
        //int cant = 200000;
        //int cant = 500000;
        for (int i = 0; i < cant; i++) {//comprueba que ningún valor se repita, ya que no se insetaría en el árbol
            boolean result = llenarArbol(i);
            if (!result) {
                i--;
            }
        }

        Arbol aux = metArbol.raiz;

        System.out.println("--------Profundidad--------");
        metProcedimientos.InicioAPro = System.currentTimeMillis();
        metProcedimientos.recorridoProfundidad(aux);//llamada al método de recorrido por profundidad
        metProcedimientos.FinAPro = System.currentTimeMillis();
        metProcedimientos.tiempoAPro = ((metProcedimientos.FinAPro - metProcedimientos.InicioAPro) / 1000);
        System.out.println("Cantidad de comparaciones:" + " " + metProcedimientos.cantidadDeComparacionesAPro);
        System.out.println("Cantidad de asignaciones:" + " " + metProcedimientos.cantidadDeAsignacionesAPro);
        System.out.println("Cantidad de tiempo ejecucion en milisegundos:" + " " + metProcedimientos.tiempoAPro);
        System.out.println("Cantidad de lineas:" + " " + metProcedimientos.lineasAPro);
        System.out.println("_______________________________");

        System.out.println("--------Anchura--------");
        metProcedimientos.InicioAAnc = System.currentTimeMillis();
        metProcedimientos.recorridoAnchura(aux);//llamada al método de recorrido por Anchura
        metProcedimientos.FinAAnc = System.currentTimeMillis();
        metProcedimientos.tiempoAAnc = ((metProcedimientos.FinAAnc - metProcedimientos.InicioAAnc) / 1000);
        System.out.println("Cantidad de comparaciones:" + " " + metProcedimientos.cantidadDeComparacionesAAnc);
        System.out.println("Cantidad de asignaciones:" + " " + metProcedimientos.cantidadDeAsignacionesAAnc);
        System.out.println("Cantidad de tiempo ejecucion en milisegundos:" + " " + metProcedimientos.tiempoAAnc);
        System.out.println("Cantidad de lineas:" + " " + metProcedimientos.lineasAAnc);
        System.out.println("_______________________________");
    }

    static void medicionGrafo() {//medicion de los datos del grafos
        System.out.println("------------Grafo--------------");
        mg.insertAutomatico(1000); 
        //mg.insertAutomatico(2500);
        //mg.insertAutomatico(3000); 
        //mg.insertAutomatico(4500);
        //mg.insertAutomatico(5000);

        System.out.println("--------Profundidad--------");
        metProcedimientos.InicioGPro = System.currentTimeMillis();
        metProcedimientos.profundidadGrafo(metGrafo.grafo);//llamada al método de recorrido por profundidad
        metProcedimientos.FinGPro = System.currentTimeMillis();
        metProcedimientos.tiempoGPro = ((metProcedimientos.FinGPro - metProcedimientos.InicioGPro) / 1000);
        System.out.println("Cantidad de comparaciones:" + " " + metProcedimientos.cantidadDeComparacionesGPro);
        System.out.println("Cantidad de asignaciones:" + " " + metProcedimientos.cantidadDeAsignacionesGPro);
        System.out.println("Cantidad de tiempo ejecucion en milisegundos:" + " " + metProcedimientos.tiempoGPro);
        System.out.println("Cantidad de lineas:" + " " + metProcedimientos.lineasGPro);
        System.out.println("_______________________________");

        System.out.println("--------Amplitud--------");
        System.out.println(mg.fuerteConexo());
        metProcedimientos.InicioGAmp = System.currentTimeMillis();
        metProcedimientos.amplitudGrafo(metGrafo.grafo);//llamada al método de recorrido por amplitud
        metProcedimientos.FinGAmp = System.currentTimeMillis();
        metProcedimientos.tiempoGAmp = ((metProcedimientos.FinGAmp - metProcedimientos.InicioGAmp) / 1000);
        System.out.println("Cantidad de comparaciones:" + " " + metProcedimientos.cantidadDeComparacionesGAmp);
        System.out.println("Cantidad de asignaciones:" + " " + metProcedimientos.cantidadDeAsignacionesGAmp);
        System.out.println("Cantidad de tiempo ejecucion en milisegundos:" + " " + metProcedimientos.tiempoGAmp);
        System.out.println("Cantidad de lineas:" + " " + metProcedimientos.lineasGAmp);
        System.out.println("_______________________________");
    }
}
