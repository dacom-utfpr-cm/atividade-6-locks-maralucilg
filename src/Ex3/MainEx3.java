
package Ex3;

/**
 * 3. Faça uma classe ArrayListThreadSafe usando ReadWriteLock. 
 * Teste usando threads que realizam leitura e escrita para essa estrutura.
 * 
 * 
 * @maralucilg
 */
public class MainEx3 {
    
    public static void main(String[] args) {
        
    ArrayListThreadSafe lista = new ArrayListThreadSafe();
    
    new Writer(lista).start();
    new Reader(lista).start();
    new Reader(lista).start();
    
    }
}
