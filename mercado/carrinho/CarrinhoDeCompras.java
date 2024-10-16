package carrinho;

import produto.Produto;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;
    private List<Integer> quantidades;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
        this.quantidades = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        produtos.add(produto);
        quantidades.add(quantidade);
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (int i = 0; i < produtos.size(); i++) {
            total += produtos.get(i).getPreco() * quantidades.get(i);
        }
        return total;
    }

    public void exibirCarrinho() {
        System.out.println("Produtos no carrinho:");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i).getNome() + " - Quantidade: " + quantidades.get(i));
        }
        System.out.printf("Valor total: R$ %.2f%n", calcularValorTotal());
    }
}
