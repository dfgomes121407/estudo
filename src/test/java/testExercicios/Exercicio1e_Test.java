package testExercicios;

import jdk.internal.cmm.SystemResourcePressureImpl;

import java.util.Scanner;

public class Exercicio1e_Test {
    public static void main(String[] args){
//        Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz
//        12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
//        Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
//        Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a
//        fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média.

        double tempo_viagem;
        int velocidade_media;
        double distancia_percorrida;
        double litros_usados;


        Scanner sc = new Scanner(System.in);

        System.out.println("Favor informar o tempo que foi gasto na viagem");
        tempo_viagem = sc.nextDouble();

        System.out.println("Favor informar a velocidade média da viagem");
        velocidade_media = sc.nextInt();

        distancia_percorrida = tempo_viagem * velocidade_media;

        litros_usados = distancia_percorrida / 12;

        System.out.print("Foi percorrido " + distancia_percorrida);
        System.out.printf(" gastando %.2f litros",litros_usados);
    }
}
