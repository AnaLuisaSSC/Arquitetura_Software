import java.util.List;

public class View {
    // Método para exibir o resultado da avaliação do aluno
    public void exibirResultado(Aluno aluno, double media, boolean aprovado) {
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Média: " + media);
        System.out.println("Frequência: " + aluno.getFrequencia() + "%");
        System.out.println("Resultado: " + (aprovado ? "Aprovado" : "Reprovado"));
        System.out.println("---------------------------------------");
    }

    // Método para exibir um menu simples para o usuário
    public void exibirMenu() {
        System.out.println("Sistema de Gestão de Médias e Frequência");
        System.out.println("Por favor, insira as notas e a frequência dos alunos.");
    }
}
