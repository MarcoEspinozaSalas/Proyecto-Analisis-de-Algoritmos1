/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Grafos.MetodosGrafo;

/**
 *
 * @author Lester Trejos
 */
public class main {
    static MetodosGrafo mg = new MetodosGrafo();

    
    public static void main(String[] args) {
        mg.insertAutomatico(100000);
        mg.print();

    }

}
