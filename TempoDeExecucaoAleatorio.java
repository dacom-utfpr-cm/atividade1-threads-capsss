package exercicio1;

/**
 *
 * @author a834173
 */

import java.util.Random;

public class TempoDeExecucaoAleatorio implements Runnable{
    public int x;
    @Override
    public void run() {
        try {
            Random gerador = new Random();
            int tempo = gerador.nextInt(10);
            System.out.println("sleep por " + tempo + " segundos");
            Thread.sleep(tempo*1000);
            System.out.println("id " + Thread.currentThread().getId() + " pronto");
        } catch(InterruptedException ex) {
            System.out.println("alguem interrompeu");
        }
        
                
    }
    
}
