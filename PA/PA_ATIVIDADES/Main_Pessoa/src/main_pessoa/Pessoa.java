
package main_pessoa;


public class Pessoa {
    String nome, sobrenome,CPF,endereco;
    int idade;
    
    public void exibirDados(String nome, String sobrenome, int idade, String CPF, String endereco){
        System.out.println("Olá " + nome + " " +sobrenome);
        System.out.println("Sua idade é " + idade);
        System.out.println("Seu CPF é " + CPF);
        System.out.println("Seu endereço é " + endereco);
    }
    
}
