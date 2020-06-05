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
//Clase utilizada para el método de insertar árbol automáticamente
public class MetodosArbol {
    //Globales
    //Raiz
    public static  Arbol raiz;
    //Instancia para que pueda ser usado en todo el proyecto
    public static MetodosArbol instance = null;
        public static MetodosArbol getInstance(){
            if(instance == null){
                instance = new MetodosArbol();
            }
            return instance;
        }
    //Cont para un test de repetidos    
    public static int cont;
    //Método para insertar árbol retorna true si inserta, y false para lo contrario
    public boolean insertar(Arbol aux)
    {
        int num = (int) (Math.random() * 1000000) + 1; //Random 1-1000000
        Arbol nuevo = new Arbol(num); //Crea el nuevo nodo
        if (raiz == null)// Verifica si ya existe el primer nodo(raíz)
        {
            raiz = nuevo;// Crea la Raiz
            return true;
        }
        if (num < aux.num) //Verifica si el valor del nuevo es menor que el que llega por parametro
        {
            if (aux.izq == null) { //Si es menor y la izquierda del noto es null inserta el nuevo
                aux.izq = nuevo; 
                return true;
            }
            else
            { 
                insertar(aux.izq); //Si no regresa recursivamente para vanazar por la izquierda
            }
        }
        else
            if (num > aux.num) //Verifica si el valor del nuevo es mayor que el que llega por parametro
            {
                if (aux.der == null) {//Si es menor y la derecga del noto es null inserta el nuevo
                    aux.der = nuevo;  
                    return true;
                }
                else
                { 
                    insertar(aux.der); //Si no regresa recursivamente para vanazar por la derecha
                }
            }
            else
                {
                   cont++;// Si no se cumple nada retorna false
                   return false;
                }
        return true;
    }
    
   
    
    
   
}
