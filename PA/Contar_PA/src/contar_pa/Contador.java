
package contar_pa;


public class Contador {
    int contador = 1;
    
    public void contarNumero(){
        do{
            System.out.println("O número é " + contador);
            contador++;
        }while(contador < 10);
        
        System.out.println("O contador vale " + contador);
      
    
    }
}
