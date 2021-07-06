
package parafaca;


public class ParaFaca {

    
    public static void main(String[] args) {
        //declaração de variáveis
        int somaNumeros = 0;
        
        //laço de repetição for
        for (int cont = 1; cont < 100; cont++){
            //processamento
            somaNumeros = somaNumeros + cont;
        }
        
        //saída de dados
        System.out.println("A soma dos números de 1 a 100 é " + somaNumeros);
       
    }
    
}
