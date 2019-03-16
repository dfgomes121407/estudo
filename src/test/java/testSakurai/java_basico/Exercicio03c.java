package testSakurai.java_basico;

import java.util.Scanner;

public class Exercicio03c {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.println("Informe o nome:");
        String nome = sc.next();

        System.out.println("Informe a altura:");
        float altura = sc.nextFloat();

        System.out.println("Informe o sexo:");
        String sexo = sc.next();

        double pesoIdeal;

        if (sexo == "m") {
            pesoIdeal = (72.2 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }

        System.out.println("O peso ideal é: " + pesoIdeal);
    }
}
