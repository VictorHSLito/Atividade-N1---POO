package AtividadeN1;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.DateTimeException;

public class Avaliacao {
    private double[] notas = new double[3];
    private double notaFinal = 0;
    private String[] datas = new String[3];

    Scanner sc = new Scanner(System.in);
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Avaliacao() {
        setNotas();
        setDatas(datas);
    }

    private void setNotas() {
        for (int i = 0; i < 3; i++) {
            boolean notaValida = false;

            while (!notaValida) {
                System.out.printf("Digite a nota %dª nota: ", i + 1);
                notas[i] = sc.nextDouble();
                sc.nextLine();
                if (notas[i] < 0 || notas[i] > 10) {
                    System.out.println("Nota inválida! Digite uma nota entre 0 e 10!");
                } else {
                    notaValida = true;
                    notaFinal += notas[i];
                }
            }
        }
        notaFinal = notaFinal / 3;
    }

    public void getNotafinal() {
        if (notaFinal <= 3) {
            System.out.printf("Nota Final: %.2f\nDesempenho final: Ruim!", notaFinal);
        } else if (notaFinal <= 4) {
            System.out.printf("Nota Final: %.2f\nDesempenho final: Regular!", notaFinal);
        } else if (notaFinal <= 7) {
            System.out.printf("Nota Final: %.2f\nDesempenho final: Bom!", notaFinal);
        } else {
            System.out.printf("Nota Final: %.2f\nDesempenho final: Excelente!", notaFinal);
        }
    }

    public String[] getDatas() {
        return datas;
    }

    public void setDatas(String[] datas) {
        datas[0] = lerData(1);
        datas[1] = lerData(2);
        datas[2] = lerData(3);
    }

    private String lerData(int index) {
        System.out.printf("Digite a data da avaliação do %dº trimestre", index);

        while (true) {
            String dataEntrada = sc.nextLine();

            try {
                LocalDate dataInserida = LocalDate.parse(dataEntrada, formatador);

                if (dataInserida.isAfter(LocalDate.now())) {
                    System.out.println("Data inválida! A data não pode ser no futuro.");
                } else {
                    return dataInserida.format(formatador);
                }

            } catch (DateTimeException e) {
                System.out.println("Data inválida! Exemplo de Data: 17/09/2024");
            }
        }
    }
}
