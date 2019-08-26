/*
 Faça uma Thread que monitora um conjunto de threads e exiba quais threads receberam sinais de interrupção.
 */
package exercicio4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a834173
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrintThread());
        Thread t2 = new Thread(new PrintThread());
        Thread t3 = new Thread(new PrintThread());
        
        Thread monitor = new Thread(new ControleExecucaoThread(t1, t2, t3));
        monitor.start();
        
        try {
            Thread.sleep(5000);
            t3.interrupt();
            Thread.sleep(5000);
            t1.interrupt();
            Thread.sleep(5000);
            t2.interrupt();
            Thread.sleep(5000);
            monitor.interrupt();
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercicio4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
