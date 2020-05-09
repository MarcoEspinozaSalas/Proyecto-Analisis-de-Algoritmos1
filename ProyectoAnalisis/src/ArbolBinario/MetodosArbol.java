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
public class MetodosArbol {
    public Arbol raiz;
    
    public boolean insertar (int num, Arbol aux){
        Arbol nuevo = new Arbol (num);
        if (raiz==null){
            raiz = nuevo;
            return true;
        }
        if (num == aux.num){
            return false;
        }
        if (num < aux.num){
            if (aux.izq == null){
                aux.izq = nuevo;
                return true;
            }
            insertar (num,aux.izq);
        }else{
            if (aux.der==null){
                aux.der = nuevo;
                return true;
            }else
            insertar(num,aux.der);
        }
        return false;
    }
    
       public void imprimirHojas(Arbol aux){
       if (aux == null){
           return; 
       }
       if (aux.izq == null && aux.der == null){
           System.out.println(aux.num);
       }
        imprimirHojas(aux.izq);
        imprimirHojas(aux.der);
   }
   
}
