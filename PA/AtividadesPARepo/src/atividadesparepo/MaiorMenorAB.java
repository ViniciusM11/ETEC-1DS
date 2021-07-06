
package atividadesparepo;

import java.util.Scanner;

public class MaiorMenorAB {
    int A,B;
    
    Scanner input = new Scanner(System.in);
    
    public void maiorMenorAB(){
        System.out.println("Digite o 1° número: ");
        A = input.nextInt();
        System.out.println("Digite o 2° número: ");
        B = input.nextInt();
        
        if(A > B){
            System.out.println("O maior: " + A);
            System.out.println("O menor: " + B);
        }else if(B > A){
            System.out.println("O maior: " + B);
            System.out.println("O menor: " + A);
        }else{
            System.out.println("Os dois tem os mesmos valores");
        }
    }
    
}
