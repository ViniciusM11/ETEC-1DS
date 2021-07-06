package atividadesparepo;

import java.util.Scanner;

public class Divisivel3e7 {
    int numero;
    
    Scanner input = new Scanner(System.in);
    
    public void divisivel3e7(){
        System.out.println("Digite um número: ");
        numero = input.nextInt();
    
        if((numero % 3) == 0 && (numero % 7) == 0){
            System.out.println("O número " + numero + " é divisível por 3 e 7");
            
        }else{
            System.out.println("O número " + numero + " não é divisível por 3 e 7");
        }
    }
    
}
