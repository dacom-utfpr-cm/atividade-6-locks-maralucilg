
package Ex2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 2. Crie uma classe SharedFifoQueue e use Conditions 
 * para controlar se a fila está vazia ou cheia.
 * Teste usando threads produtoras e consumidoras.
 * 
 * @maralucilg
 */
public class SharedFifoQueue {
    
    int tamanho = 3; // tamanho máximo
    Queue<Integer> queue = new LinkedList<>(); // fila
    // locks
    Lock lock = new ReentrantLock();
    Condition vazia = lock.newCondition(); // if vazia
    Condition cheia = lock.newCondition(); // if cheia
    
    // produzir
    public void produzir() throws InterruptedException {
        
        try{
        lock.lock();
        Random r = new Random();
        while(queue.size() >= tamanho){
            cheia.await(); // await
        queue.add(r.nextInt(3));
            vazia.signalAll(); //sinaliza
        }}
        finally {
            lock.unlock();
        }
        }
  
    // consumir
    public int consumir() throws InterruptedException {
        
        int elemento = 0;
        try {
        lock.lock();
        while(queue.size() <= 0){
            vazia.await(); // await
            elemento = queue.poll();
            cheia.signalAll(); // sinaliza
        }
        }
        finally {
            lock.unlock();
        }
            
            return elemento;
        }
        
    }
    

