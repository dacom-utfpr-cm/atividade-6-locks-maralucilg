
package Ex1;

import java.util.Random;

/**
 * Thread Contador
 * @maralucilg
 */

    public class ThreadContador extends Thread {
    
    Contador count;
    
    public ThreadContador(Contador count) {
        
        this.count = count;
    }
    
    @Override
    public void run() {
        
        while(true) {
            
            if(new Random().nextBoolean()){ 
                //count.incrementaGet();
                System.out.println(count.incrementaGet());
            }
            else{
                 //count.decrementaGet();
                 System.out.println(count.decrementaGet());
            }
        }
    }
    
}
    

