
package para_faca;


import java.util.Scanner;
public class Para_faca {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
   
        
        for (int n = 1; n < 10; n++){
            System.out.println("Digite o nome do aluno");
            String aluno = entrada.next();
            System.out.println("O nome do aluno é: " + aluno);
         
        }
            System.out.println("Fim");
            entrada.close();
        
        
        
        }
        
    }

    
    
    

