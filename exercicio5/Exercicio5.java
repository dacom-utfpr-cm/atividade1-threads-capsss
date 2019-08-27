/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a834173
 */
public class Exercicio5 {
    
    public static void main(String[] args) {
        
        try {
            Valores vals = new Valores();
            Thread soma = new Thread(new somaThread(vals));
            soma.start();
            soma.join();
            System.out.println(vals.x + vals.y);
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercicio5.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
