package testExercicios;

import org.junit.Test;

import java.util.Scanner;

public class Exercicio01a_Test {
    public static void main(String[] args){

        float quantidade_minima = 0f;
        float quantidade_maxima = 0f;
        float valor_medio = 0f;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor minimo");
        quantidade_minima = sc.nextFloat();

        System.out.println("Informe o valor maximo");
        quantidade_maxima = sc.nextFloat();

        valor_medio = (quantidade_minima + quantidade_maxima) / 2;

        System.out.println("O valor médio é: " + valor_medio);
    }
}


