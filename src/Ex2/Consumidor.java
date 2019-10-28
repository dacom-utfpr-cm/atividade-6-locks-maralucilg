
package Ex2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Thread consumidor
 * @maralucilg
 */
public class Consumidor extends Thread {

   
    SharedFifoQueue queue;
    
    public Consumidor(SharedFifoQueue queue) {
        
    this.queue = queue;
    }
    
    @Override
    public void run() {
        
        while(true) {
            
            try {
                Thread.sleep(1000);
                 //queue.consumir();
                System.out.println(queue.consumir());
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }
    
}
