
package atividadesparepo;

import java.util.Scanner;


public class PNN {
    int numero;
    
    Scanner input = new Scanner(System.in);
    
    public void positivoNegativoNulo(){
        System.out.println("Digite um Valor: ");
        numero = input.nextInt();
        
        if(numero > 0){
            System.out.println(numero + " é POSITIVO!");
        }else if(numero < 0){
            System.out.println(numero + " é NEGATIVO!");
        }else{
            System.out.println(numero + " é NULO!");
        }
    }
    
}
