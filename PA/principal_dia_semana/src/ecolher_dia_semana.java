
public class ecolher_dia_semana {

String dia; // atributos

public void exibir_dia_Semana(String dia){ //método

switch (dia) {

case "D":
System.out.println("Você escolheu Domingo");

break;

case "SF":

System.out.println("Você escolheu Segunda-feira");

break;

case "T":

System.out.println("Você escolheu Terça-Feira");

break;

case "QF":

System.out.println("Você escolheu Quarta-feira");

break;

case "QUIF":

System.out.println("Você escolheu Quinta-feira");

break;


case "SEF":

System.out.println("Você escolheu Sexta-feira");

break;

default:

System.out.println("Dia da semana inválido");

}

}
}

