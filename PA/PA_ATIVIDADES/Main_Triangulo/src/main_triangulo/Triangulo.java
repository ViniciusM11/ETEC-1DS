
package main_triangulo;

import java.util.Scanner;


public class Triangulo {
    double lado1, lado2, lado3;
    String tipo;
    
    public String calcularTriangulo(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o 1º valor: ");
        lado1 = input.nextDouble();
        System.out.println("Digite o 2º valor: ");
        lado2 = input.nextDouble();
        System.out.println("Digite o 3º valor: ");
        lado3 = input.nextDouble();
        
        
         if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
             return tipo = "Equilátero";
         }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
             return tipo = "Isósceles";
         }else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
             return tipo = "Escaleno";
         }else{
             return tipo = "Inválido";
         }
         
        
    }
    public void exibirDados(){
        System.out.println("Lado 1 = " + lado1);
        System.out.println("Lado 2 = " + lado2);
        System.out.println("Lado 3 = " + lado3);
        System.out.println("O Triângulo é " + tipo);
    }
}
