
package calculadora;


import java.util.Scanner;


public class Calculos {
     
      
    Scanner input = new Scanner(System.in);
     public float valor1;
     public float valor2;
     public float resultado;
    
    
       
    
    public void realizarSoma(float valor1, float valor2){
        
        this.resultado = valor1 + valor2;
        System.out.println("O resultado da soma é: " + this.resultado);
       
    }
    
    public void realizarSubtracao(float valor1, float valor2){
        this.resultado = valor1 - valor2;
        System.out.println("O resultado da subtração é: " + resultado);
        
    }
    
    public void realizarDivisao(float valor1, float valor2){
        this.resultado = valor1 / valor2;
        System.out.println("O resultado da divisão é: " + resultado);
        
    }
   
    public void realizarMultiplicao(float valor1, float valor2){
        this.resultado = valor1 * valor2;
        System.out.println("O resultado da multiplicação é: " + resultado);
        
        
      
        }

    
        
    }

    
    

    
    
       
       
    

    
    
    

