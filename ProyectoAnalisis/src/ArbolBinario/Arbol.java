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
public class Arbol {
   public Arbol izq;
   public Arbol der;
   public int num;
   
    public static Arbol instance = null;
    public static Arbol getInstance(){
        if(instance == null){
            instance = new Arbol();
        }
        return instance;
    }
    
     public Arbol(int num)
    {
        this.num = num;
    }
     
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
