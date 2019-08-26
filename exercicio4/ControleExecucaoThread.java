/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author a834173
 */
public class ControleExecucaoThread  implements Runnable{
    
    private final Thread t1, t2, t3;
    
    public ControleExecucaoThread(Thread t1, Thread t2, Thread t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        
    }
    
    @Override
    public void run() {
        
        this.t1.start();
        this.t2.start();
        this.t3.start();
        
        try {
            while(true) {
                Thread.sleep(1000);
                if(this.t1.isInterrupted()) {
                    System.out.println("t1 interrompida");
                } else {
                    System.out.println("t1 executando");
                }
                
                if(this.t2.isInterrupted()) {
                    System.out.println("t2 interrompida");
                } else {
                    System.out.println("t2 executando");
                }
                
                if(this.t3.isInterrupted()) {
                    System.out.println("t3 interrompida");
                } else {
                    System.out.println("t3 executando");
                }
                System.out.println("");
            }
            
        } catch(InterruptedException ex) {
            System.out.println("alguem interrompeu a thread que monitora");
        }
    }
    
}
