/*
Faça uma thread Java que realize a leitura de um arquivo texto com frases e exiba as frases a cada 10 segundos.
 */
package exercicio2;

/**
 *
 * @author a834173
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Thread t = new Thread(new LeitorDeArquivo());
        t.start();
    }
    
}
