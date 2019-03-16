package testSakurai.orientacao_objeto;

public class Diretor extends Funcionario implements Autenticavel{
    public Diretor(String nome, String rg, String cpf, String cargo, String dataNascimento) {
        super(nome, rg, cpf, cargo, dataNascimento);
    }

    public boolean autentica(String user, String senha) {
        return false;
    }

    public void recebeAumento() {
        this.salario *= 1.5;
    }
}
