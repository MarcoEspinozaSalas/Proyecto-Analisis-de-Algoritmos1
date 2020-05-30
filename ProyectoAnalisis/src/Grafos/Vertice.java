package Grafos;

public class Vertice {

    int num;
    Vertice sigV;
    boolean visitado;
    Arco subListaArcos;

    public Vertice(int num) {
        this.num = num;
        this.sigV = null;
        this.visitado = false;
    }
}
