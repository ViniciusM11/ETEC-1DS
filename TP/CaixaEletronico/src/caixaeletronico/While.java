
package caixaeletronico;

import java.util.Scanner;


public class While {
    
    public void executarMenu(){
   /* 1ª DEMONSTRAÇÃO DE ESTRUTURA DE REPETIÇÃO - WHILE*/
    
/*    int cont = 0;
    while(cont <= 10){
        
        
        //cont = cont + 1;
        //cont + 1;
        cont++;
        System.out.println("O VALOR DE CONT É " + cont);
    }
    /*  2º DEMONSTRAÇÃO DE ESTRUTURA DE REPETIÇÃO - WHILE */
          Scanner objScanner =  new Scanner(System.in);
//
//        System.out.println("DIGITE UM VALOR NUMERICO INTEIRO PARA A QUANTIDADE DE LOOPS:");
//        int loops = objScanner.nextInt();
//        int cont = 0;
//
//        while(cont <= loops ){
//
//            cont++;
//            System.out.println("O VALOR DE CONT É -> " + cont + " WHILE ");
//
//        }
        
        /*  3º DEMONSTRAÇÃO DE ESTRUTURA DE REPETIÇÃO - WHILE */
        System.out.println("DIGITE UM VALOR NUMERICO INTEIRO PARA CONTINUAR OU ZERO PARA SAIR:");
        int flag = objScanner.nextInt();

        while(flag != 0){


            System.out.println("VOCÊ DIGITOU -> " + flag);

            System.out.println("DIGITE UM VALOR NUMERICO INTEIRO PARA CONTINUAR OU ZERO PARA SAIR:");
            flag = objScanner.nextInt();

        }

    
  }   
    
    
}
