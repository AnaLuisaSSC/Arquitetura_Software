package exercicios_java_revisao;

public class questao3 {
    
/**
 * 


 * import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o salário fixo do vendedor: R$ ");
        double salarioFixo = scanner.nextDouble();
        
        System.out.print("Digite o total de vendas efetuadas pelo vendedor no mês: R$ ");
        double totalVendas = scanner.nextDouble();
        
        // Cálculo da comissão
        double comissao = totalVendas * 0.15;
        
        // Cálculo do salário final
        double salarioFinal = salarioFixo + comissao;
        
        // Saída dos resultados
        System.out.println("Nome do vendedor: " + nome);
        System.out.println("Salário fixo: R$ " + salarioFixo);
        System.out.println("Salário final no mês: R$ " + salarioFinal);
        
        scanner.close();
    }
}


import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a nota da terceira prova: ");
        double nota3 = scanner.nextDouble();
        
        // Cálculo da média aritmética
        double media = (nota1 + nota2 + nota3) / 3;
        
        // Saída dos resultados
        System.out.println("Nome do aluno: " + nome);
        System.out.printf("Média das notas: %.2f\n", media);
        
        scanner.close();
    }
}


import java.util.Scanner;

public class TrocaValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        // Exibe os valores originais
        System.out.println("Valores originais:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        // Troca dos valores usando uma variável auxiliar
        int auxiliar = A; // Armazena o valor de A
        A = B; // A recebe o valor de B
        B = auxiliar; // B recebe o valor armazenado de A

        // Exibe os valores trocados
        System.out.println("Valores trocados:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        // Fecha o Scanner
        scanner.close();
    }
}



import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Conversão para Fahrenheit
        double fahrenheit = (9 * celsius + 160) / 5;
        
        // Exibição do resultado
        System.out.printf("A temperatura em graus Fahrenheit é: %.2f\n", fahrenheit);
        
        // Fechamento do Scanner
        scanner.close();
    }
}


import java.util.Scanner;

public class ConversaoDolarParaReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a cotação do dólar: R$ ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite a quantidade de dólares disponíveis: US$ ");
        double quantidadeDolares = scanner.nextDouble();

        // Conversão de dólares para reais
        double valorEmReais = quantidadeDolares * cotacaoDolar;

        // Exibição do resultado
        System.out.printf("O valor em reais é: R$ %.2f\n", valorEmReais);

        // Fechamento do Scanner
        scanner.close();
    }
}

import java.util.Scanner;

public class LojaMamaoComAcucar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        // Cálculo do valor das prestações
        double valorPrestacao = valorCompra / 5;

        // Exibição do resultado
        System.out.printf("O valor de cada prestação é: R$ %.2f\n", valorPrestacao);

        // Fechamento do Scanner
        scanner.close();
    }
}


 */

}
