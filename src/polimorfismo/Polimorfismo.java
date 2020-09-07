/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author chejo
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        raton Raton = new raton("grande","jack","queso",2);
        Raton.mostrar();
        Raton.alimentacion();
        conejo Conejo = new conejo("cafe","vini","lechuga",3);
        Conejo.mostrar();
        Conejo.alimentacion();
    }
    
}
