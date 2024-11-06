import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibindo o menu
        View view = new View();
        view.exibirMenu();

        // Solicitando os dados do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a quantidade de notas: ");
        int quantidadeNotas = scanner.nextInt();

        double[] notas = new double[quantidadeNotas];

        // Coletando as notas do aluno
        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Coletando a frequência do aluno
        System.out.print("Digite a frequência do aluno (em %): ");
        double frequencia = scanner.nextDouble();

        // Instanciando o aluno com os dados fornecidos
        Aluno aluno = new Aluno(nome, 1, notas, frequencia);

        // Definindo os parâmetros para aprovação
        double mediaMinima = 6.0;  // Média mínima para aprovação
        double frequenciaMinima = 75.0;  // Frequência mínima para aprovação

        // Instanciando as camadas
        GestaoAcademica gestaoAcademica = new GestaoAcademica();
        Controller controller = new Controller(gestaoAcademica, view);

        // Processando os dados do aluno
        controller.processarAluno(aluno, mediaMinima, frequenciaMinima);

        // Fechando o scanner
        scanner.close();
    }
}
