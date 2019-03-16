package testSakurai.java_basico;

import java.util.Scanner;

public class Exercicio04d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int y = 0;

        for (int x = 1; x <= 10; x++) {
            a = sc.nextInt();
            if (a < 40) {
                y += a;
            }
        }
        System.out.println(y);
    }
}
