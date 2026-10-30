package exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraFinanceira calculadora = new CalculadoraFinanceira();

        System.out.print("Digite o valor total do produto: ");
        double valorTotal = scanner.nextDouble();

        System.out.print("Quantos porcento de desconto o cliente vai receber: ");
        double porcentoDesconto = scanner.nextDouble();

        calculadora.calcularDesconto(valorTotal, porcentoDesconto);

        System.out.print("Em quantas parcelas a compra vai ser realizada: ");
        int quantidadeParcelas = scanner.nextInt();

        calculadora.calcularDesconto(valorTotal, porcentoDesconto, quantidadeParcelas);

        scanner.close();
    }
}