package restaurante.prato.restaurante;

import prato.Prato;

public class Restaurante {


    public Prato criarPrato(String nome, double preco) {
        return new Prato(nome, preco);
    }

    public void servirPrato(Prato prato) {
        System.out.println("Servindo: " + prato);
    }
}

