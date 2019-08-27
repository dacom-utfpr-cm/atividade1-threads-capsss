/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author a834173
 */
public class somaThread  implements Runnable{
    
    Valores vals;
    
    public somaThread(Valores vals) {
        this.vals = vals;
    }
    
    @Override
    public void run() {
        
        Scanner x = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        vals.x = x.nextInt();
        System.out.println("Digite o segundo valor: ");
        vals.y = x.nextInt();
       
    }
}