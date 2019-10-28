
package Ex2;

/**
 * 2. Crie uma classe SharedFifoQueue e use Conditions para controlar se a fila
 * está vazia ou cheia. 
 * Teste usando threads produtoras e consumidoras.
 * 
 * @maralucilg
 */
public class MainEx2 {
    
    public static void main(String[] args){
        
     SharedFifoQueue queue = new SharedFifoQueue();
     new Produtor(queue).start();
     new Consumidor(queue).start();
     
    }
}
