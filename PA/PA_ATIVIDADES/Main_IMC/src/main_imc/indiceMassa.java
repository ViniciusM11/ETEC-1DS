
package main_imc;

import java.util.Scanner;


public class indiceMassa {
    String nome;
    double altura, imc, sexo;
    
    public double calcularIMC(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        nome = input.next();
        System.out.println("Digite o seu sexo: ");
        System.out.println("1 - Masculino");
        System.out.println("2 - Feminino");
        sexo = input.nextInt();
        System.out.println("Digite a sua altura: ");
        altura = input.nextDouble();
        
        if(sexo == 1 ){
            imc = (72.7 * altura)-58;
        return imc;
        
        }else if(sexo == 2){
            imc = (62.2*altura)-44.7;
            return imc;
        }else{
            
            return imc = 0;
        }
        
        
        
    }
    
    public void exibirDados(){
        
        System.out.println("Olá " + nome + ", o seu IMC é " + imc);
        
    }
    
}
