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
public class PrintThread  implements Runnable{
    @Override
    public void run() {

        System.out.println("Thread " + Thread.currentThread().getId() + " executando");
        while(true){
//           if(Thread.currentThread().isInterrupted()){
//                break;
//           }
            Thread.yield();
        }

       
    }
}
