
package atividadesparepo;

import java.util.Scanner;

public class somarNumeros {
    int valor1, valor2, resultado, resposta;
     
    
    Scanner input = new Scanner(System.in);
    
    public void somarNumeros(){
        
       resposta = 1;
        
        while(resposta == 1){
            
            System.out.println("Digite o primeiro valor: ");
            valor1 = input.nextInt();
            System.out.println("Digite o segundo valor: ");
            valor2 = input.nextInt();
            resultado = valor1 + valor2;
            System.out.println("\n" + valor1 + " + " + valor2 + " = " + resultado + "\n");
            System.out.println("Deseja continuar?\n");
            System.out.println("0-NÃO");
            System.out.println("1-SIM \n");
            resposta = input.nextInt();
        }
        
    
    }
    
}
