package testSakurai.orientacao_objeto;

public class TestaFuncionario {
    public static void main(String[] args){
        Gerente gerente = new Gerente("Diego", "22879","322240","Gerente","01/01/2019");

        System.out.println(gerente.getNome());

        gerente.setSalario(100.00);

        System.out.println("antes do aumento: "+gerente.getSalario());

        gerente.recebeAumento();
        System.out.println("apos o aumento: "+gerente.getSalario());
    }
}
