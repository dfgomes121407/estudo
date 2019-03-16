package testExercicios;

import org.junit.Before;

import java.util.Scanner;

public class Exercicio01c_Test {
    public static void main(String[] args) {
        int identificador_vendedor;
        int codigo_peca;
        int quantidade_pecas;
        double preco_unitario;
        double valor_comissao;
        double valor_total_venda;

        Scanner sc = new Scanner(System.in);


        System.out.println("-----Calculo de comissão-----");

        //pergunta qual a identificação do vendedor
        System.out.println("Qual o código do vendedor?");
        identificador_vendedor = sc.nextInt();

        //pergunta o código da peça
        System.out.println("Informe o código da peça vendida \n opções disponiveis 1 | 2 | 3");
        codigo_peca = sc.nextInt();

        switch (codigo_peca){
            case 1:
                preco_unitario = 100.00;
                break;
            case 2:
                preco_unitario = 200.00;
                break;
            case 3:
                preco_unitario = 300.00;
                break;
            default:
                throw new IllegalArgumentException("O código da peça informado não é válido");
        }

        //pergunta qual a quantidade de peças
        System.out.println("Qual a quantidade peças vendidas?");
        quantidade_pecas = sc.nextInt();

        valor_total_venda = quantidade_pecas * preco_unitario;

        valor_comissao = valor_total_venda * 0.05;

        System.out.println("O valor de comissão por essa venda é R$"+valor_comissao);


    }
}
