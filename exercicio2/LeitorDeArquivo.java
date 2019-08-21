package exercicio2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a834173
 */
public class LeitorDeArquivo implements Runnable{
    @Override
    public void run() {
        Scanner in;
        try {
            in = new Scanner(new FileReader("src/exercicio2/arquivo.txt"));
            while(in.hasNext()) {
                System.out.println(in.next());
            }
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeitorDeArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}
