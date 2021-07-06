
package alunos;

import java.util.Scanner;

public class Alunos {
    

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nome[];
        nome = new String[5];
        
        int[][] nota = new int[5][4];
        
        for(int cont = 0; cont < 5; cont++) {            
            for(int neoCont = 0; neoCont < 4; neoCont++) {
                
//                 System.out.println("Digite o nome: ");
//                 nome[cont]= input.next();
                 
                 System.out.println("1ª Nota: ");
                 nota[cont][neoCont] = input.nextInt();
                 System.out.println("2ª Nota: ");
                 nota[cont][neoCont] = input.nextInt();
                 System.out.println("3ª Nota: ");
                 nota[cont][neoCont] = input.nextInt();
                 System.out.println("4ª Nota: ");
                 nota[cont][neoCont] = input.nextInt();
                 
               
}
}
    }
    
}
