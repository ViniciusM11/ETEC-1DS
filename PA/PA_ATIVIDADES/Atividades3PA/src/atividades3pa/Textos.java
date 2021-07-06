
package atividades3pa;

import java.util.Scanner;
public class Textos {
    String texto;
    int contador;
    
    
    Scanner input = new Scanner(System.in);
    public void imprimirTextos(){
        
        contador = 1;
        System.out.println("Digite um texto: ");
        texto = input.nextLine();
        
        for(contador=1;contador<=20;contador++){
            System.out.println(texto);
           
        }
       
 
    }
    
}
