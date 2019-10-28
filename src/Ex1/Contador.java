
package Ex1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 1 - Faça um programa usando Lock para simular a atualização de um contador 
 *  que é acessado por múltiplas threads. O contador pode diminuir e aumentar.
 *  
 *  @maralucilg
 * 
 */
public class Contador {
    
    int contador = 0;
    Lock lock = new ReentrantLock(); // lock
    
    // método incrementar e get
    int incrementaGet() {
        int num = 0;
        
        try {
        lock.lock();
        num = contador++;
        }
        finally {
         lock.unlock();
       }
        return num;
        
    }
    
    // método decrementa e get
    int decrementaGet(){
        
        int num = 0;
        
        try {
        lock.lock();
        num = contador--;
        }
        finally {
            lock.unlock();
        }
        
         return num;
        
    } 
    
}
