package testSakurai.orientacao_objeto;

public class Gerente extends Funcionario {
    public Gerente(String nome, String rg, String cpf, String cargo, String dataNascimento) {
        super(nome, rg, cpf, cargo, dataNascimento);
    }

    @Override
    // recebe aumento de 20%
    public void recebeAumento() {
        this.salario *= 1.2 ;
    }
}
