
package main_triretan;

import java.util.Scanner;


public class trianguloRetangulo {
    double area, lado1, lado2;
    
    public double calcularArea(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da base: ");
        lado1 = input.nextDouble();
        System.out.println("Digite o valor da altura: ");
        lado2 = input.nextDouble();
        area = (lado1*lado2)/2;
        return area;
    }
    public void exibirDados(){
        System.out.println("A área é " + area);
    }
}
