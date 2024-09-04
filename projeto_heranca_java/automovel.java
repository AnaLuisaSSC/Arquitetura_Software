package projrto_heranca_java;

import projrto_heranca_java.veiculo.carro;
import projrto_heranca_java.veiculo.moto;

public class veiculo { // implementa main, public static...

    private String marca;
    private String modelo;
    private int ano;

    public veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar() {
        System.out.println("O veículo está acelerando.");
    }

    public void exibirInformacao() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }
}
   