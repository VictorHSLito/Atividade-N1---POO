package AtividadeN1;

public class Principal {
    public static void main(String[] args) {
        System.out.println("\t\tSEJA BEM-VINDO(A) AO SISTEMA DE AVALIAÇÃO DE FUNCIONÁRIOS V1.0");
        Funcionario f1 = new Funcionario();
        f1.details();
        f1.mudarInformacoes();
        f1.details();
        f1.getAvaliacao();
    }
}
