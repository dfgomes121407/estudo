package testSakurai.orientacao_objeto;

public class ControleDeBonificacoes {
    private Funcionario[] funcionarios = new Funcionario[10];

    private int cont = 0;

    public void registra(Funcionario funcionario){
        this.funcionarios[cont] = funcionario;
        cont++;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }
}
