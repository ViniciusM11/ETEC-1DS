package parepo3;

import java.util.Scanner;

public class NumerosMM3 {
    int valor1, valor2, valor3;
    
    Scanner input = new Scanner(System.in);
    
    public void NumerosMM3(){
        System.out.println("Digite o 1° número: ");
        valor1 = input.nextInt();
        System.out.println("Digite o 2° número: ");
        valor2 = input.nextInt();
        System.out.println("Digite o 3° número: ");
        valor3 = input.nextInt();
        
        if(valor1>valor2 && valor2>valor3){
            System.out.println("Maior: " + valor1);
        }else if(valor2>valor1 && valor2>valor3){
            System.out.println("Maior: " + valor2);
        }else if(valor3>valor1 && valor3>valor2){
            System.out.println("Maior: "  + valor3);
            
        }
        
        
        if(valor1>valor2 && valor2>valor3){
            System.out.println("Menor: " + valor1);
        }else if(valor2<valor1 && valor2<valor3){
            System.out.println("Menor: " + valor2);
        }else if(valor3<valor1 && valor3<valor2){
            System.out.println("Menor: "  + valor3);
            
        }
    } 
}
