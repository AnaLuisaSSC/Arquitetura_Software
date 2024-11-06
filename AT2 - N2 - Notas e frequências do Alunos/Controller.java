public class Controller {
    private GestaoAcademica gestaoAcademica;
    private View view;

    // Construtor do controlador
    public Controller(GestaoAcademica gestaoAcademica, View view) {
        this.gestaoAcademica = gestaoAcademica;
        this.view = view;
    }

    // Método que processa os dados do aluno
    public void processarAluno(Aluno aluno, double mediaMinima, double frequenciaMinima) {
        double media = gestaoAcademica.calcularMedia(aluno);  // Chama o cálculo da média
        boolean aprovado = gestaoAcademica.verificarAprovacao(aluno, mediaMinima, frequenciaMinima);  // Verifica a aprovação
        view.exibirResultado(aluno, media, aprovado);  // Exibe o resultado
    }
}
