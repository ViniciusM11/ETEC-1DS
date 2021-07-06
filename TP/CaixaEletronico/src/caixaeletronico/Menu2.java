
package caixaeletronico;

import java.util.Scanner;
        
public class Menu2 {
    public void executarMenu(){
        System.out.println("####MENU COM SWITCH...CASE####: ");
        
        System.out.println("ESCOLHA UMA OPÇÃO: ");
        System.out.println("1 - SALDO");
        System.out.println("2 - DEPÓSITO");
        System.out.println("3 - SAQUE");
        
        Scanner objScanner = new Scanner(System.in);
        Conta objConta = new Conta();
        
        int operacao = objScanner.nextInt();
        float valor = 0;
        
        switch(operacao){
        
            case 1:
                objConta.verificarSaldo();
                break;
                        
            case 2:
                System.out.println("DIGITE UM VALOR DE DEPOSITO: ");
                valor = objScanner.nextFloat();
                objConta.realizarDeposito(valor);
                objConta.verificarSaldo();
                break;
                        
            case 3:
                System.out.println("DIGITE O VALOR DE SAQUE: ");
                valor = objScanner.nextFloat();
                objConta.realizarSaque(valor);
                objConta.verificarSaldo();
                break;
                
            default:
                System.out.println("!!!OCORREU UM ERRO!!!");
                
        }
        
    }
}
