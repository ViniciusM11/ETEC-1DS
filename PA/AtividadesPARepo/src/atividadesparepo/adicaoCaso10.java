
package atividadesparepo;

import java.util.Scanner;

public class adicaoCaso10 {
    int n1, n2, resultado;
    
    Scanner input = new Scanner(System.in);
    
    public void exibirCasoMaior10(){
        System.out.println("Informe o 1° número: ");
        n1 = input.nextInt();
        System.out.println("Informe o 2° número: ");
        n2 = input.nextInt();
        
        resultado = n1 + n2;
        
        if(resultado > 10){
            System.out.println(n1 + " + " + n2 + " = " + resultado);
         
        }else{
            System.out.println("FIM");
        }
    }
    
}
