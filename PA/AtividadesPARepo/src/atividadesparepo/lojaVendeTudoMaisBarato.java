
package atividadesparepo;

import java.util.Scanner;

public class lojaVendeTudoMaisBarato {
    double valorCompra, valorFinal;
    int prestacao;
    
    Scanner input = new Scanner(System.in);
    
    public void lojaVendeTudoMaisBarato(){
        System.out.println("Olá");
        System.out.println("Digite o valor da sua compra: ");
        valorCompra = input.nextDouble();
        System.out.println("Prestações em até 5 vezes SEM JUROS !");
        System.out.println("1X sem juros");
        System.out.println("2X sem juros");
        System.out.println("3X sem juros");
        System.out.println("4X sem juros");
        System.out.println("5X sem juros\n");
        
        prestacao = input.nextInt();
        
        valorFinal = valorCompra / prestacao;
        
        switch(prestacao){
            case 1: 
                System.out.println("1 parcela");
                System.out.println(valorFinal);
                break;
            case 2: 
                System.out.println("2 parcelas");
                System.out.println(valorFinal);
                break;
            case 3: 
                System.out.println("3 parcelas");
                System.out.println(valorFinal);
                break;
            case 4: 
                System.out.println("4 parcelas");
                System.out.println(valorFinal);
                break;
            case 5: 
                System.out.println("5 parcelas");
                System.out.println(valorFinal);
                break;
                
            default:
                System.out.println("!!!OCORREU UM ERRO!!!");
                
                      
        }
        
    }
    
    
}
