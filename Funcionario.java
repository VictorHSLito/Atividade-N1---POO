import com.sun.management.UnixOperatingSystemMXBean;

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

    public String getNome() {
        return nome;
    }

    private void setNome() {
        System.out.println("Qual o nome do funcionário? ");
        this.nome = sc.next();
    }

    public String getCargo() {
        return cargo;
    }

    private void setCargo() {
        System.out.println("Qual o cargo do funcionário, " + getNome() + "?");
        this.cargo = sc.next();
    }

    public float getSalario() {
        return salario;
    }

    private void setSalario() {
        System.out.println("Qual o salário de " + getNome() + "?");
        this.salario = sc.nextFloat();
    }
}
