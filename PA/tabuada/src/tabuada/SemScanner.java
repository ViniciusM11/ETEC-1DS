
package tabuada;


public class SemScanner {
    int numero, contador, resultado;
    
    public void semScanner(int numero){
        
        for(contador=1; contador<=10; contador++){
            
            resultado = contador * numero;
            System.out.println(numero + " X " + contador + " = " + resultado);
        }
    }
}
