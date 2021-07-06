
package atividadesparepo;

import java.util.Scanner;

public class vendedor {
    String nome; 
    float salarioFixo, vendas, comissao, salarioFinal;
    
    Scanner input = new Scanner(System.in);
    
    public void calcularSalario(){
        System.out.println("Digite o nome do vendedor: ");
        nome = input.next();
        System.out.println("Digite o salário fixo: ");
        salarioFixo = input.nextFloat();
        System.out.println("Digite as vendas do mês: ");
        vendas = input.nextFloat();
        
        comissao = vendas * 0.15f;
        
        salarioFinal = salarioFixo + comissao;
        
        
        System.out.println("______________Relatório___________________");
        System.out.println("Nome: " + nome);
        System.out.println("Salário Fixo: " + salarioFixo);
        System.out.println("Salário Final: " + salarioFinal);
        System.out.println("__________________________________________");
        
       
        
    }
    
}
