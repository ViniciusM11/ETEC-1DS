
package conversao_real_dolar;

import java.util.Scanner;


public class Conversao {
    float valorReal, cotacacaoDolar, conversao;
    
    
    public void Conversao(){
        
         valorReal = 0;
         cotacacaoDolar = 0;
         conversao = 0;
         
         Scanner input = new Scanner(System.in);
         
         System.out.println("Programa para converter reais em dólares");
         System.out.println("Informe o valor disponível em reais (para comprar dólares): R$");
         
         valorReal = input.nextFloat();
         
         System.out.println("Informe o valor do dolar em reais (para comprar dólares): R$");
         
         cotacacaoDolar = input.nextFloat();
         conversao = valorReal / cotacacaoDolar;
         
         System.out.println("Com essa quantia será possível comprar: US$");
         System.out.println(conversao);
         System.out.println("Boa viagem!");
         
        
        
    
    } 
}
