package prato.restaurante.main;

import prato.Prato;
import restaurante.Restaurante;
public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        // Criar pratos
        Prato prato1 = restaurante.criarPrato("Spaghetti Carbonara", 45.00);
        Prato prato2 = restaurante.criarPrato("Frango à Parmegiana", 38.00);

        // Servir pratos
        restaurante.servirPrato(prato1);
        restaurante.servirPrato(prato2);
    }
}