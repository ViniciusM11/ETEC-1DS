
package matriz;

import java.util.Scanner;

public class Matriz {

    
    public static void main(String[] args) {
        //Objeto Entrada de dados
        Scanner input = new Scanner(System.in);
        
        //Declaração e criação da matriz
        // lado esquerdo = declaração lado direito = criação
        String[][] nome = new String[5][2]; //5 linhas e 2 colunas
        
        
        //laço de entrada
        for(int i = 0; i < 5; i++) {
            System.out.println("Digite seu nome: ");
            nome[i][0] = input.next();
            
            System.out.println("Digite seu telefone: ");
            nome[i][1] = input.next();
            
            
        }
        //Laço de saída
        for (int contador = 0; contador < 5; contador ++) {

            System.out.printf("nome " + nome[contador][0] + " Telefone: " + nome[contador][1]);
        }

           input.close();
    } 
    
}
