package testExercicios;

import java.util.Scanner;

public class Exercicio1d_Test {
    public static void main(String[] args){

        int[] a = new int[4];
        int aux = 0;
        int calc;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 4 numeros para realizamos os calculos:");

        while (aux < 4){
            a[aux] = sc.nextInt();
            aux++;
        }

        System.out.println("Multiplicação ou Soma?");
        String acao = sc.next();
        if (acao == "Multiplicação"){
            calc = 2;
        }else {
            calc = 1;
        }

        switch (calc){
            case 1:
                int soma1 = (a[0]) + (a[1]);
                int soma2 = (a[0]) + (a[2]);
                int soma3 = (a[0]) + (a[3]);
                int soma4 = (a[1]) + (a[2]);
                int soma5 = (a[1]) + (a[3]);
                int soma6 = (a[2]) + (a[3]);

                System.out.println("1º + 2º = "+ soma1);
                System.out.println("1º + 3º = "+ soma2 );
                System.out.println("1º + 4º = "+ soma3 );
                System.out.println("2º + 3º = "+ soma4 );
                System.out.println("2º + 4º = "+ soma5 );
                System.out.println("3º + 4º = "+ soma6 );

                break;

            case 2:
                int mult1 = (a[0]) * (a[1]);
                int mult2 = (a[0]) * (a[2]);
                int mult3 = (a[0]) * (a[3]);
                int mult4 = (a[1]) * (a[2]);
                int mult5 = (a[1]) * (a[3]);
                int mult6 = (a[2]) * (a[3]);

                System.out.println("1º * 2º = "+ mult1);
                System.out.println("1º * 3º = "+ mult2 );
                System.out.println("1º * 4º = "+ mult3 );
                System.out.println("2º * 3º = "+ mult4 );
                System.out.println("2º * 4º = "+ mult5 );
                System.out.println("3º * 4º = "+ mult6 );
                break;

            default:
                throw new IllegalArgumentException("ação inválida");
        }
    }
}
