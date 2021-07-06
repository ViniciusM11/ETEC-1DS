
package regiao;

import java.util.Scanner;

public class codRegiao {
    int cod;
    String nome;
    
    
    public void receberCodigo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        nome = input.next();
        System.out.println("Digite o código do produto: ");
        cod = input.nextInt();
        
        switch(cod){
            case 1:
            System.out.println(nome + ",o produto é da região Sul");
            break;
            
            case 2:
            System.out.println(nome + ",o produto é da região Norte");
            break;
   
            case 3:
            System.out.println(nome + ",o produto é da região Leste");
            break;
            
            case 4: 
            System.out.println(nome + ",o produto é da região Oeste");
            break;
            
            default:
            System.out.println("Código Inválido");
        }
    }
        
}
