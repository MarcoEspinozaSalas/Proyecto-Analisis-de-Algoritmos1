package Grafos;
/**
 *
 * @author Alejandro Acuña
 */
public class Arco {
 
   public Vertice destino;
   public Vertice origen;
   public Arco sigA;
   public int size;

    public Arco(Vertice destino, int size) {
        this.destino = destino;
        this.sigA = null;
        this.size = size;
    }
}
