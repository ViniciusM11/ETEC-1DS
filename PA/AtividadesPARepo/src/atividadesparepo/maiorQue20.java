
package atividadesparepo;

import java.util.Scanner;

public class maiorQue20 {
    int numero;
    
    Scanner input = new Scanner(System.in);
    
    public void imprimaMaiorQue20(){
        
        System.out.println("Digite um número: ");
        
        numero = input.nextInt();
        
        if(numero > 20){
            System.out.println("O número digitado foi " + numero);
        }else{
            System.out.println("FIM");
        }
        
    }
    
}
