package testSakurai.orientacao_objeto;

public class TestaFuncionario {
    public static void main(String[] args){
        Funcionario diego = new Gerente("Diego", "22879","322240","Gerente","01/01/2019");

        System.out.println(diego.getNome());

        diego.setSalario(100.00);

        System.out.println("antes do aumento: "+diego.getSalario());

        diego.recebeAumento();
        System.out.println("apos o aumento: "+diego.getSalario());

        System.out.println("***********************************************");
        System.out.println("***********************************************");
        System.out.println("***********************************************");


        Funcionario nathalia = new Gerente("nath","12312","12738","Gerente","01/02/2019");
        Funcionario thiago = new Diretor("thiago","12736","312837","Diretor","01/04/2018");

        ControleDeBonificacoes controleDeBonificacoes = new ControleDeBonificacoes();
        controleDeBonificacoes.registra(nathalia);
        controleDeBonificacoes.registra(thiago);
        controleDeBonificacoes.registra(diego);


        for (Funcionario funcionario : controleDeBonificacoes.getFuncionarios()){
            System.out.println(funcionario);
        }
    }
}
