public class GestaoAcademica {
    // Método para calcular a média de um aluno
    public double calcularMedia(Aluno aluno) {
        return aluno.calcularMedia();  // Chama o método da classe Aluno
    }

    // Método para verificar se o aluno foi aprovado
    public boolean verificarAprovacao(Aluno aluno, double mediaMinima, double frequenciaMinima) {
        return aluno.verificarAprovacao(mediaMinima, frequenciaMinima);  // Chama o método da classe Aluno
    }
}
