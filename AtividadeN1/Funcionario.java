package AtividadeN1;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private String cargo;
    private float salario;

    Scanner sc = new Scanner(System.in);

    public Funcionario () {
        setNome();
        setCargo();
        setSalario();
    }

    public void details() {
        System.out.println("\t-----------DADOS DO FUNCIONÁRIO-----------");
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Salário: " + getSalario());
    }
    public String getNome() {
        return nome;
    }

    private void setNome() {
        while (true) {
            System.out.println("Qual o nome do funcionário? ");
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
            System.out.println("Qual o cargo do funcionario " + getNome() + "?");
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
