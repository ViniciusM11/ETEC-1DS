
package main_notas;

import java.util.Scanner;


public class Notas {
    String nome;
    double n1, n2, n3, media;
    
    public double calcularMedia(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        nome = input.next();
        System.out.println("Digite a primerira nota: ");
        n1 = input.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = input.nextDouble();
        System.out.println("Digite a terceira nota: ");
        n3 = input.nextDouble();
        
        media = (n1+n2+n3)/3;

        return media;
    }
    
    public void exibirDados(){
        System.out.println("Aluno " + nome);
        System.out.println("Nota 1 " + n1);
        System.out.println("Nota 2 " + n2);
        System.out.println("Nota 3 " + n3);
        System.out.println("A média do auno é " + media);
        
    }
}
