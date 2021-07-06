
package atividades3pa;

import java.util.Scanner;
public class Verificar100 {
    
    int numero = 0;
    
    
    Scanner input = new Scanner(System.in);
    public void vericarMaoirQue100(){
        
      
        
        while(numero < 100){
                System.out.println("Digite um número: ");
                numero = input.nextInt();
            if(numero < 100){
                
                System.out.println(numero + " é menor que 100");
            }else{
                System.out.println("É 100");
            }
         } 
        
             System.out.println("FIM");
        }
  
    }
    

