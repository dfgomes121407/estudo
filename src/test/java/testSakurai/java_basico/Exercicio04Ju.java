package testSakurai.java_basico;

public class Exercicio04Ju {
    public static void main(String[] args) {
       double x = 15;
       double media = 0;
       double soma = 0;
       int a = -1;


       while (x <= 100){
           soma += x;
           x++;
           a++;
       }
        media = soma/a;
        System.out.println(media);
        System.out.println(a);
    }
}
