public class Avaliacao {
    private double nota1Funcionario, nota2Funcionario, notafinalFuncionario;
    private String data1Funcionario, data2Funcionario;

    public Avaliacao(double nota1Funcionario, double nota2Funcionario, String data1Funcionario, String data2Funcionario) {
        this.nota1Funcionario = nota1Funcionario;
        this.nota2Funcionario = nota2Funcionario;
        this.data1Funcionario = data1Funcionario;
        this.data2Funcionario = data2Funcionario;
    }

    public double getNota1Funcionario() {
        return nota1Funcionario;
    }

    public void setNota1Funcionario(double nota1Funcionario) {
        this.nota1Funcionario = nota1Funcionario;
    }

    public double getNota2Funcionario() {
        return nota2Funcionario;
    }

    public void setNota2Funcionario(double nota2Funcionario) {
        this.nota2Funcionario = nota2Funcionario;
    }

    public double getNotafinalFuncionario() {
        notafinalFuncionario = (nota1Funcionario + nota2Funcionario) / 2;

        if (notafinalFuncionario <= 3) {
            System.out.print("Nota Final: Ruim - ");
            return notafinalFuncionario;
        } else if (notafinalFuncionario <= 4) {
            System.out.print("Nota Final: Regular - ");
            return notafinalFuncionario;
        } else if (notafinalFuncionario <= 7) {
            System.out.print("Nota Final: Bom - ");
            return notafinalFuncionario;
        } else {
            System.out.print("Nota Final: Excelente - ");
            return notafinalFuncionario;
        }
    }

    public void setNotafinalFuncionario(double notafinalFuncionario) {
        this.notafinalFuncionario = notafinalFuncionario;
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
