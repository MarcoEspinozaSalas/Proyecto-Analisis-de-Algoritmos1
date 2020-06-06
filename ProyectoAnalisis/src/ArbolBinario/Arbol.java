/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolBinario;

/**
 *
 * @author Lester Trejos
 */
//Clase para general el arbol binario
public class Arbol {
   //Variables públicas necesarias para la creación y recorrido del árbol
   public Arbol izq;
   public Arbol der;
   public int num;
   //Instancia de la clase para ser utilizada en todo el proyecto
    public static Arbol instance = null;
    public static Arbol getInstance(){
        if(instance == null){
            instance = new Arbol();
        }
        return instance;
    }
    //Constructor de la clase arbol con parametro
     public Arbol(int num)
    {
        this.num = num;
    }
    //Constructor vacío de la calse
     public Arbol(){
     }

   /* public Arbol getIzq() {
        return izq;
    }

    public Arbol getDer() {
        return der;
    }

    public int getNum() {
        return num;
    }*/
}
