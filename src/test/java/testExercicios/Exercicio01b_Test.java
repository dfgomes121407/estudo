package testExercicios;

import java.util.Scanner;

public class Exercicio01b_Test {
    public static void main(String[] args){
        double cotacao;
        double quantidade_dolar;
        double valor_real;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor da cotação do dolar: ");
        cotacao = sc.nextDouble();

        System.out.println("Informe quantos dolares voce tem: ");
        quantidade_dolar = sc.nextDouble();

        valor_real = quantidade_dolar * cotacao;

        System.out.println("Voce possui R$"+valor_real);
    }
}
