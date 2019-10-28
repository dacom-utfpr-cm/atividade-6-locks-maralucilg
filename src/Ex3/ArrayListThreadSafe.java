
package Ex3;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 3. Faça uma classe ArrayListThreadSafe usando ReadWriteLock. 
 * Teste usando threads que realizam leitura e escrita para essa estrutura.
 * 
 * @maralucilg
 */
public class ArrayListThreadSafe {
    
    ArrayList<Integer> lista = new ArrayList<>();
    // lock
    ReentrantReadWriteLock rw_lock = new ReentrantReadWriteLock(); 
    Lock readLock = rw_lock.readLock(); // leitor
    Lock writeLock = rw_lock.writeLock(); // escritor
    
    public void insere(int elemento) { // inserir
        
        try{
        writeLock.lock();
        lista.add(elemento);
        }
        finally {
            
            writeLock.unlock();
        }
    }
        
        public int remover(int index) { // remover
        
        try {
        readLock.lock();
        
        return lista.get(index);
        
        }
        finally {
            
            readLock.unlock();
        }
        
    }
    
    public int getTamanho() { // tamanho
        
        try {
        readLock.lock();
        
        return lista.size();
        
        }
        finally {
            
        readLock.unlock();
        }
        
    }
    
}

