package parepo3;

import java.util.Scanner;

public class EtecEx {
    int rm;
    double nota1, nota2, nota3,media,ma;
    String mencao;
    
    
    Scanner input = new Scanner(System.in);
    
    public void Notas(){
        System.out.println("Digite seu RM: " + "\n5 Dígitos: \n");
        rm = input.nextInt();
        System.out.println("Digite a 1ª nota: ");
        nota1 = input.nextDouble();
        System.out.println("Digite a 2ª nota: ");
        nota2 = input.nextDouble();
        System.out.println("Digite a 3ª nota: ");
        nota3 = input.nextDouble();
        
        media = (nota1 + nota2 + nota3)/3;
        ma = (nota1 + nota2 * 2 + nota3 * 3 + media)/7 ;
        
        if(ma>=90){
            mencao = "A";
        }else if(ma>=75 && ma<90 ){
            mencao = "B";
        }else if(ma>=60 && ma<75){
            mencao = "C";
        }else if(ma>=40 && ma<60){
            mencao = "D";
        }else{
            mencao = "E";
        }
    }
    
    public void Relatorio(){
        System.out.println("________________________Relatório___________________");
        System.out.println("RM: " + rm);
        System.out.println("1ª Nota: " + nota1);
        System.out.println("2ª Nota: " + nota2);
        System.out.println("3ª Nota: " + nota3);
        System.out.println("Média: " + media);
        System.out.println("Média de Aproveitamento: " + ma);
        System.out.println("Menção: " + mencao);
        
        if(mencao == "A"){
            System.out.println("Aprovado !!");
        }else if(mencao == "B"){
            System.out.println("Aprovado !!");
        }else if(mencao == "C"){
            System.out.println("Aprovado !!");
        }else if(mencao == "D"){
            System.out.println("Reprovado !!");
        }else{
            System.out.println("Reprovado !!");
        }
    }
    
}
