/*
 Faça um programa em Java que inicie três threads e, cada thread, espere um tempo aleat́orio para terminar
 */
package exercicio1;
/**
 *
 * @author a834173
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        new Thread (new TempoDeExecucaoAleatorio()).start()
        for(int i=0; i<3; i++){
            Thread t = new Thread(new TempoDeExecucaoAleatorio());
            t.start();
        }
    }
    
}

