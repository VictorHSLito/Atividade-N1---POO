package AtividadeN1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd;
        System.out.println("\t\tSEJA BEM-VINDO(A) AO SISTEMA DE AVALIAÇÃO DE FUNCIONÁRIOS V1.0");
        System.out.println("\n\tSistema de Avaliação: Durante o ano, você será avaliado em três trimestres,\n" +
                "\trecebendo uma nota de 0 a 10 em cada um. Ao final, será somado as três notas \n\te dividas por 3" +
                " para calcular a nota final.\n");
        do {
            System.out.println("Gostaria de cadastrar quantos funcionários? ");
            qtd = sc.nextInt();
            if (qtd <= 0) {
                System.out.println("Não se pode cadastrar funcionários menor que 0! Tente novamente!");
            }
        } while (qtd <= 0);

        Funcionario[] funcionarios = new Funcionario[qtd]; //Cria um array de Objetos Funcionários

        for (int i = 0; i < qtd; i++) {
            System.out.println("\nCadastrando o funcionário #" + (i + 1));
            funcionarios[i] = new Funcionario(); // Cadastra um ou mais funcionários
        }

        // funcionarios[0].details(); // Mostra as informações do funcionário, bem como sua avaliação
        // funcionarios[0].mudarInformacoes(); // Método para mudar informações do funcionário
        // funcionarios[0].getAvaliacao(); //Método para mostrar informações de notas e datas
    }
}
