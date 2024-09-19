
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Var declaradas aqui
        // Pois, não da pra declarar dentro do do-while/wile e usar como parâmetro
        String nomeFuncionario, cargoFuncionario,  data1Funcionario, data2Funcionario, dataEntrada;
        double salarioFuncionario, nota1Funcionario, nota2Funcionario;
        int qnt;

        // Define o padrão de formato da data
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Olá, Bem vindo!\nDigite quantos funcionarios a empresa tem: ");

        // While vai ser true com o break do if
        // Impedir o usuário de digitar um quantidade menor que 0
        while (true) {
            qnt = sc.nextInt();

            if (qnt > 0) {
                break;
            } else {
                System.out.print("Digite uma quantidade maior que 0: ");
            }
        }

        // Criando uma Array do objeto Funcionario
        Funcionario[] funcionarios = new Funcionario[qnt];
        Avaliacao[] avaliacaos = new Avaliacao[qnt];

        // Add dados na arrays criadasw
        for (int i = 0; i < qnt; i++) {

            // Garantir que não tenha dados no fluxo de entrada
            // Se não tiver isto, primeiro vai uma mensagem do "aviso (do else)" e dps o programa deixa vc digitar
            sc.nextLine();

            // Coletando as informações
            System.out.printf("\nAdicione os dados do Funcionarios %d° funcionario: \n", i + 1);

            // Impedir o usuário de enviar um nome com ou menos de 2 caracteres
            while (true) {
                System.out.print("Digite o Nome: ");
                nomeFuncionario = sc.nextLine();

                if (nomeFuncionario.length() > 2) {
                    break;
                } else {
                    System.out.println("AVISO \nO nome precisa ter mais de 2 caracteres.");
                }
            }

            System.out.println();

            while (true) {
                System.out.print("Digite o Cargo: ");
                cargoFuncionario = sc.nextLine();

                if (cargoFuncionario.length() > 2) {
                    break;
                } else {
                    System.out.println("AVISO \nO cargo precisa ter mais de 2 caracteres.");
                }
            }

            System.out.println();

            while (true) {
                System.out.print("Digite o Salario: ");
                salarioFuncionario = sc.nextDouble();

                if (salarioFuncionario > 1411.99) {
                    break;
                } else {
                    System.out.println("AVISO \nO salario não pode ser menor que um salario minimo (R$ 1.412,00).");
                }
            }

            System.out.println("\nAvaliação por Semestre.\nNota de 0 a 10\nNota será a soma dos dois semestre divido por 2");

            while (true) {
                System.out.print("Digite a nota do 1° Semestre: ");
                nota1Funcionario = sc.nextDouble();

                if (nota1Funcionario > 0 && nota1Funcionario < 11) {
                    break;
                } else {
                    System.out.println("Nota invalida!!\nA nota tem que ser entre 0 e 10!!");
                }
            }

            sc.nextLine();
            while (true) {
                System.out.print("Digite a Data de quando a nota do 1° Semestre foi adicionada: ");
                dataEntrada = sc.nextLine();

                try {
                    // Converte a String para LocalDate
                    // Se a String(dataEntrada) estiver no formato(formatador) correto dd/MM/yyyy é armazenada no dataInserida
                    LocalDate dataInserida = LocalDate.parse(dataEntrada, formatador);

                    // Como é um sistema de notas, temos que impedir do funcionario colocar um data no futuro
                    if (dataInserida.isAfter(LocalDate.now())) {
                        System.out.println("Data invalida!\nA data não pode ser no futuro.");
                        continue;
                    }

                    // Converte para o formato(formatador) dd/MM/yyyy
                    // se não fizer isso o print, printa = "yyyy-MM-dd"
                    data1Funcionario = dataInserida.format(formatador);
                    break;

                } catch (DateTimeException e) {
                    System.out.println("Data invalida!\nAVISO: Sem espaço no começo ou no final.\nExemplo de Data: 17/09/2024");
                }
            }

            System.out.println();

            while (true) {
                System.out.print("Digite a Nota do 2° Semestre: ");
                nota2Funcionario = sc.nextDouble();

                if (nota2Funcionario > 0 && nota2Funcionario < 11) {
                    break;
                } else {
                    System.out.println("Nota invalida!!\nA nota tem que ser entre 0 e 10!!");
                }
            }

            sc.nextLine();
            while (true) {
                System.out.print("Digite a Data de quando a nota do 2° Semestre foi adicionada: ");
                dataEntrada = sc.nextLine();

                try {
                    LocalDate dataInserida = LocalDate.parse(dataEntrada, formatador);

                    if (dataInserida.isAfter(LocalDate.now())) {
                        System.out.println("Data invalida!\nA data não pode ser no futuro.");
                        continue;
                    }
                    data2Funcionario = dataInserida.format(formatador);
                    break;

                } catch (DateTimeException e) {
                    System.out.println("Data invalida!\nAVISO: Sem espaço no começo ou no final.\nExemplo de Data: 17/09/2024");
                }
            }

            // Inicializa o Funcionario com o Construtor
            funcionarios[i] = new Funcionario(nomeFuncionario, cargoFuncionario, salarioFuncionario);
            avaliacaos[i] = new Avaliacao(nota1Funcionario, nota2Funcionario, data1Funcionario, data2Funcionario);
        }

        // Pegar  a data de Hoje
        LocalDate dataAtual = LocalDate.now();
        String dataHoje = dataAtual.format(formatador);

        // Print dos dados
        System.out.println("\nFuncionarios");
        for (int i = 0; i < qnt; i++) {
            System.out.println("Nome: " + funcionarios[i].getNomeFuncionario());
            System.out.println("Cargo: " + funcionarios[i].getCargoFuncionario());
            System.out.printf("Salario: R$ %.2f\n", funcionarios[i].getSalarioFuncionario());
            System.out.printf("Nota 1° Semestre: %.2f\n", avaliacaos[i].getNota1Funcionario());
            System.out.println("Data da Nota do 1° Semestre: " + avaliacaos[i].getData1Funcionario());
            System.out.printf("Nota 2° Semestre: %.2f\n", avaliacaos[i].getNota2Funcionario());
            System.out.println("Data da Nota do 2° Semestre: " + avaliacaos[i].getData2Funcionario());
            System.out.printf("%.2f\n", avaliacaos[i].getNotafinalFuncionario());
            System.out.println("Data de Hoje: " + dataHoje);
        }
        sc.close();
    }
}
