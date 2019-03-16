package testSakurai.java_basico;

public class TestaCondicionais {
    public static void main(String[] args){

        int idade = 61;

        if (idade >= 18 && idade < 60){
            System.out.println("Pode beber");
        } else if (idade >= 60) {
            System.out.println("Pode beber, mas na sua idade é morte certa!!!");
        } else {
            System.out.println("Não pode beber");
        }
    }
}
