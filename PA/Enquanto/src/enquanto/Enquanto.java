
package enquanto;


public class Enquanto {

    
    public static void main(String[] args) {
        int contador = 1;
        
        while (contador <=10){
            //processamento
            System.out.println("Agora o contadora vale " + contador);
            
            //incremento
            contador++; //contador = contador+1;
           
        }
        //valor final
        System.out.println("O valor final do contador é " + contador);
    }
    
}
