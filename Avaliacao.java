import java.util.Scanner;

public class Avaliacao {
    private double[] notas = new double[3];
    private double notaFinal = 0;
    private String data1Funcionario, data2Funcionario;

    Scanner sc = new Scanner(System.in);

    public Avaliacao() {
        setNotas();
    }

    private void setNotas() {
      for (int i = 0; i < 3; i++) {
            boolean notaValida = false;
            while (!notaValida) {
                System.out.printf("Digite a nota %dª nota: ", i+1);
                notas[i] = sc.nextDouble();
                if (notas[i] < 0 || notas[i] > 10) {
                    System.out.println("Nota inválida! Digite uma nota entre 0 e 10!");

                }
                else {
                    notaValida = true;
                    notaFinal += notas[i];
                }
            }
        }
        notaFinal = notaFinal/3;
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

    public String getData1Funcionario() {
        return data1Funcionario;
    }

    public void setData1Funcionario(String data1Funcionario) {
        this.data1Funcionario = data1Funcionario;
    }

    public String getData2Funcionario() {
        return data2Funcionario;
    }

    public void setData2Funcionario(String data2Funcionario) {
        this.data2Funcionario = data2Funcionario;
    }

}
