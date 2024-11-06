public class Aluno {
    private String nome;
    private int id;
    private double[] notas;
    private double frequencia;

    // Construtor
    public Aluno(String nome, int id, double[] notas, double frequencia) {
        this.nome = nome;
        this.id = id;
        this.notas = notas;
        this.frequencia = frequencia;
    }

    // Métodos getters
    public String getNome() { return nome; }
    public int getId() { return id; }
    public double[] getNotas() { return notas; }
    public double getFrequencia() { return frequencia; }
    
    // Método para calcular a média das notas
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;  // Média simples
    }

    // Método para verificar se o aluno foi aprovado
    public boolean verificarAprovacao(double mediaMinima, double frequenciaMinima) {
        double media = calcularMedia();  // Calcula a média
        return media >= mediaMinima && frequencia >= frequenciaMinima;  // Verifica se cumpre os requisitos de aprovação
    }
}
