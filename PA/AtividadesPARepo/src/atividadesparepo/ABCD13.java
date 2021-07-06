
package atividadesparepo;

import java.util.Scanner;

public class ABCD13 {  
    int A,B,C,D;
    
    Scanner input = new Scanner(System.in);
    
    public void abcd(){
        System.out.println("Digite o 1° número: ");
        A = input.nextInt();
        System.out.println("Digite o 2° número: ");
        B = input.nextInt();
        System.out.println("Digite o 3° número: ");
        C = input.nextInt();
        System.out.println("Digite o 4° número: ");
        D = input.nextInt();
        
        if(A>B && A>C && A>D){
            System.out.println("Maior: " + A);
        }else if(B>A && B>C && B>D){
            System.out.println("Maior: " + B);
        }else if(C>A && C>B && C>D){
            System.out.println("Maior: " + C);
        }else if(D>A && D>B && D>C){
            System.out.println("Maior: " + D);
        }else{
            System.out.println("Todos tem os mesmos valores");
        }
        
        
        if(A<B && A<C && A<D){
            System.out.println("Menor: " + A);
        }else if(B<A && B<C && B<D){
            System.out.println("Menor: " + B);
        }else if(C<A && C<B && C<D){
            System.out.println("Menor: " + C);
        }else if(D<A && D<B && D<C){
            System.out.println("Menor: " + D);
        }
    }
    
}
