package main;

import produto.Produto;
import carrinho.CarrinhoDeCompras;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Criar produtos
        Produto produto1 = new Produto("Arroz", 25.50);
        Produto produto2 = new Produto("Feijão", 10.00);
        Produto produto3 = new Produto("Macarrão", 5.75);

        // Adicionar produtos ao carrinho
        carrinho.adicionarProduto(produto1, 2); // 2 kg de arroz
        carrinho.adicionarProduto(produto2, 3); // 3 kg de feijão
        carrinho.adicionarProduto(produto3, 5); // 5 pacotes de macarrão

        // Exibir carrinho e valor total
        carrinho.exibirCarrinho();
    }
}
