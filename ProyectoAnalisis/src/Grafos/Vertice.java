package Grafos;

public class Vertice {

 public   int num;
 public   Vertice sigV;
 public   boolean visitado;
 public   Arco subListaArcos;

    public Vertice(int num) {
        this.num = num;
        this.sigV = null;
        this.visitado = false;
    }
}
