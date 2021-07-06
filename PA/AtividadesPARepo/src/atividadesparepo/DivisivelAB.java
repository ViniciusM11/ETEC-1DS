package atividadesparepo;

import java.util.Scanner;

public class DivisivelAB {
    int A, B;
    
    Scanner input = new Scanner(System.in);
    
    public void AB(){
        System.out.println("Digite o 1° número: ");
        A = input.nextInt();
        System.out.println("Digite o 2° número: ");
        B = input.nextInt();
              
        if((A % B) == 0){
            System.out.println("O número " + A + " é divisível por  " + B);
            
        }else{
            System.out.println("O número " + A + " não é divisível por  " + B);
        }
    }
    
}
