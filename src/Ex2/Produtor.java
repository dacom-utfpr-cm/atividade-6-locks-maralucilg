
package Ex2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Thread produtor
 * @maralucilg
 */
public class Produtor extends Thread {
    
    
    SharedFifoQueue queue;
    
    public Produtor(SharedFifoQueue queue) {
        
        this.queue = queue;
    }
    
    @Override
    public void run() {
        
        while(true) {
            
            try {
                Thread.sleep(1000);
                queue.produzir();
            } catch (InterruptedException ex) {
                Logger.getLogger(Produtor.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
    
}
