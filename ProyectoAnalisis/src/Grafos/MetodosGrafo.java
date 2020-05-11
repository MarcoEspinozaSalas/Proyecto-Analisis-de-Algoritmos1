
package Grafos;


public class MetodosGrafo {
    Vertice grafo;

    public MetodosGrafo() {
        this.grafo = null;
    }

    // Insertar vertice al inicio
    public void insertarVertices() {
        int val = (int)(200000.0 * Math.random());
        
        Vertice nuevo = new Vertice(val);
        nuevo.sigV = grafo;
        grafo = nuevo;
    }
    
    
    Vertice buscar(int nombre) {
        if (grafo == null) {
            return null;
        }
        Vertice temp = grafo;
        while (temp != null) {
            if (temp.num == nombre) {
                return temp;
            }
            temp = temp.sigV;
        }
        return null;
    }

    public void insertAutomatico(int cant) {
        int o = 0;
        
        while(o < cant){
            insertarVertices();
            o=o+1;
        }
    }
      
    public void print()
    {
        System.out.println("iniciando impresion");
        Vertice g = grafo;
        while (g != null) {
            System.out.println("-----Vertice: " + g.num);
            g = g.sigV;
        }
        System.out.println("nada");
          
    };
    
}
