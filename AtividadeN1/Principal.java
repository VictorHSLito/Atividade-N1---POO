package AtividadeN1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("\t\tSEJA BEM-VINDO(A) AO SISTEMA DE AVALIAÇÃO DE FUNCIONÁRIOS V1.0");
        Funcionario f1 = new Funcionario();
        f1.details();
    }
}
