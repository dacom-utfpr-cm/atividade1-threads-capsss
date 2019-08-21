/*
 Faça um programa Java que envia interrupções para as threads dos exercícios anteriores.
 As threads devem fazer o tratamento dessas interrupções e realizar uma finalização limpa.
 */
package exercicio3;

/**
 *
 * @author a834173
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t1 = new Thread(new TempoDeExecucaoAleatorioInterrupcao());
        t1.start();
        Thread t2 = new Thread(new TempoDeExecucaoAleatorioInterrupcao());
        t2.start();
        Thread t3 = new Thread(new TempoDeExecucaoAleatorioInterrupcao());
        t3.start();
        t1.interrupt();
        t2.interrupt();
        t3.interrupt();
    }
    
}
