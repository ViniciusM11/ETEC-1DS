
package atividades3pa;

import java.util.Arrays;
import java.util.Scanner;

public class numeros10 {
//    declarar variável VETOR UNIDIMENSIONAL DE UMA DIMENSÃO
    int n1[] = new int[10];
    
//    declarar objeto de entrada   
    Scanner input = new Scanner(System.in);
    
    public void exibirOrdem(){

        
        for(int contador=0; contador <10; contador++){
//        entrada de dados
        System.out.println("Digite um número: ");
        n1[contador] = input.nextInt();
        
   
        }
        
        
     System.out.println("A ordem dos números digitados foi essa " + Arrays.toString(n1));
     
     
    }
    
}
