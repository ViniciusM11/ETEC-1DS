
package meu_imc;

import java.util.Scanner;


public class calculoImc {
    String nome;
    double altura;
    double peso;
    double imc;
    
    Scanner input = new Scanner(System.in);
    
    public void calcular(){
    System.out.println("Olá, vamos calcular seu IMC ?");
    System.out.println("Primeiramente digite seu nome: ");
    nome = input.nextLine();
    System.out.println("Digite seu peso(Kg): ");
    peso = input.nextDouble();
    System.out.println("Agora digite sua altura(M): ");
    altura = input.nextDouble();
    
    imc = peso / (altura * altura);
    System.out.println(nome + " seu IMC é " + imc);
    
    if(imc < 16){
        System.out.println("Baixo Peso - Grau III");  
    }else if(imc >= 16 && imc <= 16.99){
        System.out.println("Baixo Peso - Grau II");    
    }else if(imc >= 17 && imc <= 18.49){
        System.out.println("Baixo Peso - Grau I");    
    }else if(imc >= 18.50 && imc <=24.99){
        System.out.println("Peso Ideal");
    }else if(imc >= 25 && imc <= 29.99){
        System.out.println("Sobrepeso");    
    }else if(imc >= 30 && imc <= 34.99){
        System.out.println("Obesidade - Grau I");
    }else if(imc >= 35 && imc <= 39.99){
        System.out.println("Obesidade - Grau II");
    }else{
        System.out.println("Obesidade - Grau III");
    }
    }
    }

