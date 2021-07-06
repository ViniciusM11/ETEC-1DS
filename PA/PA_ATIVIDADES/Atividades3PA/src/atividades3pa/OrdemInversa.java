
package atividades3pa;

import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;

public class OrdemInversa {
//    declarar variável VETOR UNIDIMENSIONAL DE UMA DIMENSÃO
    int n1[] = new int[10];
    
//    declarar objeto de entrada   
    Scanner input = new Scanner(System.in);
    
    public void exibirOrdem(){

        
        for(int contador=0; contador <=9; contador++){
//        entrada de dados
        System.out.println("Digite um número: ");
        n1[contador] = input.nextInt();
        
   
        }
        
        System.out.println("\n Ordem Inversa: \n");
        
        for(int i = n1.length-1;i>=0;i--){
            System.out.println(n1[i]);
        
       }
    }
    
}
