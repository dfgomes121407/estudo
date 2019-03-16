package testSakurai.orientacao_objeto;

public class Conta {

    private String nome = null;
    private int agencia = 0;
    private int conta = 0;
    private double saldo = 0;

    public Conta(String nome, int agencia, int conta){

        this.nome = nome;
        this.agencia = agencia;
        this.conta = conta;
    }

    static String[] listarBancos(){
        String[] bancos = {"Bradesco", "BB", "Itau"};
        return bancos;
    }

    public void saca(double valor){
        if (saldo > 0){
            this.saldo -= valor;
            System.out.println("Saque realizado no valor: R$"+valor);
        } else {
            System.out.println("Erro ao realizar o saque\n Motivo: saldo insuficiente");
        }
    }

    public void deposita(double valor){
        this.saldo += valor;
        System.out.println("deposito realizado com valor de: R$"+valor);
    }

    public void transferencia(double valor, Conta outraConta){
        if (saldo > 0){
            this.saldo -= valor;
            outraConta.deposita(valor);
        } else {
            System.out.println("Erro ao realizar o transferencia\n Motivo: saldo insuficiente");
        }
    }

    public void exibeSaldo(){
        getSaldo();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
