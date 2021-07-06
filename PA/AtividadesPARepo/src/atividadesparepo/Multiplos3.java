
package atividadesparepo;

import java.util.Scanner;

public class Multiplos3 {
    int numero;
    
    Scanner input = new Scanner(System.in);
    
    public void multiplo3(){
        System.out.println("Digite um valor: ");
        numero = input.nextInt();
              
        if((numero % 3) == 0){
            System.out.println("O número " + numero + " é múltiplo de 3");
            
        }else{
            System.out.println("O número " + numero + " não é múltiplo de 3");
        }
    }
    
}
