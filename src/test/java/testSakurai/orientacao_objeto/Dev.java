package testSakurai.orientacao_objeto;

public class Dev extends Funcionario {
    public Dev(String nome, String rg, String cpf, String cargo, String dataNascimento) {
        super(nome, rg, cpf, cargo, dataNascimento);
    }

    @Override
    // recebe aumento de 10%
    public void recebeAumento() {
        this.salario *= 1.1 ;
    }
}
