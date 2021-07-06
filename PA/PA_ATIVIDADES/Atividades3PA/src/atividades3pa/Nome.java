
package atividades3pa;

import java.util.Scanner;


public class Nome {
    
    String nome, continua;
    
    Scanner input = new Scanner(System.in);
    
    public void repetirNome(){
        
       do{
       System.out.println("Digite seu nome:"); 
       nome = input.next();
       System.out.println(nome);
       System.out.println("CONTINUA?");
       continua = input.next();
       }while("SIM".equalsIgnoreCase(continua));
       input.close();
    }
    
}
