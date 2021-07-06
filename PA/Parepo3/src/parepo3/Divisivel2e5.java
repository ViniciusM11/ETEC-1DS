
package parepo3;

import java.util.Scanner;


public class Divisivel2e5 {
    int numero;
    
    Scanner input = new Scanner(System.in);
    
    public void divisivel2ou5(){
        System.out.println("Digite um número: ");
        numero = input.nextInt();
    
        if((numero % 2) == 0 || (numero % 5) == 0){
            System.out.println("O número " + numero + " é divisível por 2 ou 5");
            
        }else{
            System.out.println("O número " + numero + " não é divisível por 2 ou 5");
        }
        
    }   
}
