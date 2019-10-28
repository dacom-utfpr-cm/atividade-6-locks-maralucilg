
package Ex3;

/**
 * Thread leitor
 * @maralucilg
 */
public class Reader extends Thread {
    
    ArrayListThreadSafe lista;
    
    public Reader (ArrayListThreadSafe lista) {
        
        this.lista = lista;
    }
    
    @Override
    public void run() {
        
        while(true) {
            
            int index = lista.getTamanho() - 1;
            
            if(index > 0) {
                
                //lista.remover(index);
                System.out.println(lista.remover(index));
            }
            
        }
    }
    
    
}
