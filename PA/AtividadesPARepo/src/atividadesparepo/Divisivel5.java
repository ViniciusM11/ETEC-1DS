
package atividadesparepo;

import java.util.Scanner;

public class Divisivel5 {
    int numero;
    
    Scanner input = new Scanner(System.in);
    
    public void divisivel5(){
        System.out.println("Digite um valor: ");
        numero = input.nextInt();
              
        if((numero % 5) == 0){
            System.out.println("O número " + numero + " é divisível por 5");
            
        }else{
            System.out.println("O número " + numero + " não é divisível por 5");
        }
    }
    
}