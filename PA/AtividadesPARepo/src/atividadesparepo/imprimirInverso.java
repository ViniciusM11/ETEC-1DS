
package atividadesparepo;

import java.util.Scanner;

public class imprimirInverso {
    int valor1, valor2;
    
    Scanner input = new Scanner(System.in);
    
    public void imprimirInverso(){
        System.out.println("Digite o primeiro valor: ");
        valor1 = input.nextInt();
        System.out.println("Digite o segundo valor: ");
        valor2 = input.nextInt();
        System.out.println("\n");
        System.out.println(valor2);
        System.out.println(valor1);
        
    }
}
