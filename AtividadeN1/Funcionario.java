package AtividadeN1;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private String cargo;
    private float salario;
    private Avaliacao avaliacao;

    Scanner sc = new Scanner(System.in);

    public Funcionario () {
        System.out.println("\n\tDigite os dados do funcionário(a) abaixo\n");
        setNome();
        setCargo();
        setSalario();
        this.avaliacao = new Avaliacao();
    }

    public void details() {
        System.out.println("\t-----------DADOS DO FUNCIONÁRIO(A)-----------");
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Salário: " + getSalario());
        System.out.println("\t-----------AVALIAÇÃO FINAL DO FUNCIONÁRIO(A)-----------");
        avaliacao.getNotafinal();
    }
    public String getNome() {
        return nome;
    }

    private void setNome() {
        while (true) {
            System.out.println("Qual o nome do funcionário(a)? ");
            this.nome = sc.nextLine();
            if (this.nome.length() > 2) {
                break;
            } else {
                System.out.println("AVISO \nO nome precisa ter mais de 2 caracteres.");
            }
        }
    }

    public String getCargo() {
        return cargo;
    }

    private void setCargo() {
        while (true) {
            System.out.println("Qual o cargo de " + getNome() + "?");
            this.cargo = sc.nextLine();
            if (this.cargo.length() > 2) {
                break;
            } else {
                System.out.println("AVISO \nO cargo precisa ter mais de 2 caracteres.");
            }
        }
    }

    public float getSalario() {
        return salario;
    }

    private void setSalario() {
        while (true) {
            System.out.println("Qual o salário de " + getNome() + "?");
            this.salario = sc.nextFloat();
            if (this.salario > 1411.99) {
                break;
            } else {
                System.out.println("AVISO \nO salário não pode ser menor que um salário mínimo (R$ 1.412,00).");
            }
        }
    }
}
