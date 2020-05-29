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
        
    String mensaje;
    public String insertar(Arbol aux)
    {
        int num = (int) (Math.random() * 100000) + 1;
        Arbol nuevo = new Arbol(num);
        if (raiz == null)
        {
            raiz = nuevo;
            return mensaje = "";
        }
        if (num < aux.num)
        {
            if (aux.izq == null) { 
                aux.izq = nuevo; 
                return mensaje =  "";
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
                    return mensaje = "";
                }
                else
                { 
                    insertar(aux.der); 
                }
            }
            else
                {
                   return mensaje = "No se puede repetir id";
                }
        return mensaje;
    }
    
   
    
    
   
}
