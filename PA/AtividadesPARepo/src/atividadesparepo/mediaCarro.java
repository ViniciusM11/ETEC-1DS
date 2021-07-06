
package atividadesparepo;

import java.util.Scanner;

public class mediaCarro {
    double distancia, combustivel, consumoMedio;
    
    Scanner input = new Scanner(System.in);
    public void mediaCarro(){
        System.out.println("Digite o a distância percorrida pelo automóvel: ");
        distancia = input.nextDouble();
        System.out.println("Digite o total de conbustível gasto no percurso: ");
        combustivel = input.nextDouble();
        
        consumoMedio = distancia / combustivel;
        
        System.out.println("O consumo médio do veículo foi de " + consumoMedio + " litros" );
        
    }
    
}
