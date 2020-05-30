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
    
    public static  Arbol raiz;
    
    public static MetodosArbol instance = null;
        public static MetodosArbol getInstance(){
            if(instance == null){
                instance = new MetodosArbol();
            }
            return instance;
        }
        
    public static int cont;
    public boolean insertar(Arbol aux)
    {
        int num = (int) (Math.random() * 1000000) + 1;
        Arbol nuevo = new Arbol(num);
        if (raiz == null)
        {
            raiz = nuevo;
            return true;
        }
        if (num < aux.num)
        {
            if (aux.izq == null) { 
                aux.izq = nuevo; 
                return true;
            }
            else
            { 
                insertar(aux.izq); 
            }
        }
        else
            if (num > aux.num)
            {
                if (aux.der == null) { 
                    aux.der = nuevo;  
                    return true;
                }
                else
                { 
                    insertar(aux.der); 
                }
            }
            else
                {
                   cont++;
                   return false;
                }
        return true;
    }
    
   
    
    
   
}
