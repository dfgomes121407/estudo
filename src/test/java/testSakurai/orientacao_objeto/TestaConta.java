package testSakurai.orientacao_objeto;

public class TestaConta {
    public static void main(String[] agrs){

//      Declara conta1 e conta2
        Conta contaDoThiago = new Conta("Thiago", 111,22222 );
        Conta contaDoDiego = new Conta("Diego", 333,444444);

//      Add valores para conta1
        contaDoThiago.setSaldo(0);

//      Imprime valores da conta1
        System.out.println("nome conta1: "+contaDoThiago.getNome());
        System.out.println("agencia conta1: "+contaDoThiago.getAgencia());
        System.out.println("conta conta1: "+contaDoThiago.getConta());
        System.out.println("saldo conta1: "+contaDoThiago.getSaldo());

//     Deposita valor na conta1
       contaDoThiago.deposita(100);

//     Exibe saldo atualizado da conta1
       System.out.println("saldo atualizado da conta1: "+contaDoThiago.getSaldo());


       System.out.println("********************outra conta*****************************");

//      Add valores para conta2
        contaDoDiego.setSaldo(500.00);

//      Imprime valores da conta2
        System.out.println("nome conta2: "+contaDoDiego.getNome());
        System.out.println("agencia conta2: "+contaDoDiego.getAgencia());
        System.out.println("conta conta2: "+contaDoDiego.getConta());
        System.out.println("saldo conta2: "+contaDoDiego.getSaldo());

//      Realiza saque na conta2
        contaDoDiego.saca(500);

//      Imprime saldo da conta2
        System.out.println("saldo atualizado conta2: "+contaDoDiego.getSaldo());

        System.out.println("*************************************************");
//      Tenta realizar saque na conta2
        contaDoDiego.saca(100);
        System.out.println("*************************************************");


//      Transfere valor da conta1 pra conta2
        contaDoThiago.transferencia(50.00, contaDoDiego);

        System.out.println("*************************************************");

//      Imprime saldo da conta2
        System.out.println("saldo atualizado conta2 apos transferencia: "+contaDoDiego.getSaldo());


        System.out.println("*************************************************");
        System.out.println("*************************************************");
    }
}
