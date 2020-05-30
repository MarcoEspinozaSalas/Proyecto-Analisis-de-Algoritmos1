package Grafos;

public class MetodosGrafo {
    
    Vertice grafo;

    public MetodosGrafo() {
        this.grafo = null;
    }
    
    public Vertice buscar(int nombre) {
        if (grafo == null) {
            return null;
        }
        Vertice temp = grafo;
        while (temp != null) {
            if (temp.num == nombre) {
                //System.out.println("-----Vertice encontrado");
                return temp;
            }
            temp = temp.sigV;
        }
        System.out.println("-----Vertice NO encontrado");
        return null;
    }

    void insertarVertices(int nombre) {
        Vertice nuevo = new Vertice(nombre);

        nuevo.sigV = grafo;
        grafo = nuevo;
    }
    
    public void insertAutomatico(int cant) {
        

        for (int i = 0; i < cant; i++) {

            insertarVertices(i);
        }

        for (int i = 0; i < cant; i++) {

            for (int j = 0; j < cant; j++) {

                insertarArco(i, j, 2);
            }

        }
    }
      
    public void print()
    {
        System.out.println("Iniciando impresión...");
        Vertice g = grafo;
        while (g != null) {
            System.out.println("-----Vertice: " + g.num);
            g = g.sigV;
        }
        System.out.println("-----Fin");
          
    };
    
    
    public void insertarArco(int origen, int destino, int distancia) {
        Vertice vOrigen = buscar(origen); //Se busca el origen     <--
        Vertice vDestino = buscar(destino);//Se busca el destino   <--

        Arco nnArco = new Arco(vDestino, distancia);
        nnArco.sigA = vOrigen.subListaArcos;
        vOrigen.subListaArcos = nnArco;  //Se enlaza
    }
    
    
    
    public String fuerteConexo(){
        if (grafo != null) {
            Vertice aux = grafo;
            int cantV = 0;
            while (aux != null) {
                cantV++;
                aux = aux.sigV;
            }
            aux = grafo;
            while (aux != null) {
                if (gradoExterno(aux) != cantV-1) {
                    return "No es fuertemente Conexo";
                }
                aux = aux.sigV;
            }
            return "Si es fuertemente Conexo";
        }
        return "No se encontró un grafo";  
    }
    
    public int gradoExterno(Vertice vertice){
        int cont = 0;
        if(vertice.subListaArcos.sigA!=null){
            Arco aux = vertice.subListaArcos.sigA;
          while(aux!=null){         
            cont++;
            aux = aux.sigA;
          }
        }
        return cont;
    }
    
    
    
    
    mg.insertAutomatico(1000);
        //mg.print();
        //System.out.println();
        
        
        System.out.println(mg.fuerteConexo());
        
        //mg.buscar(100000);
    

    
}