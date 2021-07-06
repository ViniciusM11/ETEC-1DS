
package atividadesparepo;

import java.util.Scanner;

public class RaizQuadrado {
    double numero;
    
    Scanner input = new Scanner(System.in);
    
    public void raizQuadrado(){
        System.out.println("Digite um valor: ");
        numero = input.nextDouble();
        
        if(numero >= 0){               
            System.out.println("Raiz Quadrada: " + Math.sqrt(numero));
        
        }else{
            System.out.println("Quadrado: " + Math.pow(numero, 2.0));
        }
    }
    
}
