package exercicio6;

public class CalculadoraFinanceira {

    public void calcularDesconto(double valorTotal, double porcentoDesconto) {
        double valorFinal = valorTotal - (valorTotal * (porcentoDesconto / 100));
        System.out.println("O valor com desconto fica: R$ " + valorFinal);
    }

    public void calcularDesconto(double valorTotal, double porcentoDesconto, int quantidadeParcelas) {
        double valorFinal = valorTotal - (valorTotal * (porcentoDesconto / 100));
        double valorParcela = valorFinal / quantidadeParcelas;

        System.out.println("Valor final com desconto: R$ " + valorFinal);
        System.out.println("Quantidade de parcelas: " + quantidadeParcelas);
        System.out.println("Valor de cada parcela: R$ " + valorParcela);
    }
}