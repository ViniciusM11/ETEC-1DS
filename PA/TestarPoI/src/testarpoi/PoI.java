
package testarpoi;

import java.util.Scanner;

public class PoI { 
    int numero;
                   
     Scanner input = new Scanner(System.in); 
     public void verificarParouImpar(){ 

        System.out.println("Digite Um Valor: ");
        numero = input.nextInt(); 
        
     if ((numero % 2) == 0) { 
        System.out.println(numero + " É um número PAR !!!");
     }else{
        System.out.println(numero + " É um número ÍMPAR !!!");
     }
   }
}
