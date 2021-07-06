package atividadesparepo;

import java.util.Scanner;

public class Estatuarios {
    double salario, prestacao, porcento;
    
    Scanner input = new Scanner(System.in);
    
    public void emprestimo(){
        System.out.println("Digite o salário bruto: ");
        salario = input.nextInt();
        System.out.println("Digite o número de prestações: ");
        prestacao = input.nextInt();
        
        porcento = salario * 0.3;
    
        if(prestacao <= porcento){
            System.out.println("Empréstimo aprovado !");
            
        }else{
            System.out.println("Empréstimo não aprovado !");
        }
    }
    
}
