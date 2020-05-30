package Grafos;

public class Arco {

    Vertice destino;
    Vertice origen;
    Arco sigA;
    int size;

    public Arco(Vertice destino, int size) {
        this.destino = destino;
        this.sigA = null;
        this.size = size;
    }
}
