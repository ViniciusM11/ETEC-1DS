
package parepo3;

import java.util.Scanner;

public class maiorMenor {
    int numero1, numero2;
    
    Scanner input = new Scanner(System.in);
    
    public void maiorMenor(){
        System.out.println("Digite o 1° número: ");
        numero1 = input.nextInt();
        System.out.println("Digite o 2° número: ");
        numero2 = input.nextInt();
        
        if(numero1 > numero2){
            System.out.println("Maior número: " + numero1);
        }else if(numero2 > numero1){
            System.out.println("Maior número: " + numero2);
        }else{
            System.out.println("Os dois tem o mesmo valor");
        }
    }
}
