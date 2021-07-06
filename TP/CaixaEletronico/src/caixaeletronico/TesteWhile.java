
package caixaeletronico;


public class TesteWhile {
    /*
LOOP WHILE COM VARIAVEL DE CONTADOR:
*/
     public void testeLoop1(){
       int cont = 1;
       
       while(cont <= 10){     
           
       System.out.println("VALOR DA VARIÁVEL CONT: " + cont);
       
       //cont = cont + 1;
       cont += 2;
       //cont++;
       }
       System.out.println("VALOR FINAL DO CONT: " + cont);
     }
}
