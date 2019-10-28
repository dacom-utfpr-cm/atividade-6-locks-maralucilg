
package Ex3;

import java.util.Random;

/**
 * Thread escritor
 * @maralucilg
 */
public class Writer extends Thread {
    
     
    ArrayListThreadSafe lista;
    
    public Writer (ArrayListThreadSafe lista) {
        
     this.lista = lista;
    }
    
    @Override
    public void run() {
    
    Random r = new Random();
    while(true) {
        
        lista.insere(r.nextInt(30));
            
    }
        
    }
    
}
