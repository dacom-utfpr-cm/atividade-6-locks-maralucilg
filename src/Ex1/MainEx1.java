
package Ex1;

/**
 * 1 - Faça um programa usando Lock para simular a atualização de um contador 
 *  que é acessado por múltiplas threads. O contador pode diminuir e aumentar.
 *  
 *  @maralucilg
 *
 */
public class MainEx1 {
    
    
    
     Contador count = new Contador();
    
     new ThreadContador(count).start();
    
}
