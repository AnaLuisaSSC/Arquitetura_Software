package restaurante.prato;

public class Prato {
    private String nome;
    private double preco;

    public Prato(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Prato: " + nome + ", Preço: R$" + preco;
    }
}