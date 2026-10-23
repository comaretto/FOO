package exercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Quadrado formulaQuadrado = new Quadrado();

        Scanner scanner = new Scanner(System.in);

        System.out.print("---Quadrado---\n");
        System.out.print("Digite o valor do lado do quadrado: ");
        formulaQuadrado.setLado(scanner.nextDouble());

        System.out.print("\nPerimetro: " + formulaQuadrado.calcularPerimetro());
        System.out.print("\nÁrea: " + formulaQuadrado.calcularArea());

        System.out.print("\n-----------------------------\n");

        Triangulo formulaTriangulo = new Triangulo();

        System.out.print("---Triângulo---\n");
        System.out.print("Digite o valor da base do triângulo: ");
        formulaTriangulo.setBase(scanner.nextDouble());

        System.out.print("Digite o valor da altura do triângulo: ");
        formulaTriangulo.setAltura(scanner.nextDouble());

        System.out.print("Digite o valor do lado1 do triângulo: ");
        formulaTriangulo.setLado1(scanner.nextDouble());

        System.out.print("Digite o valor do lado2 do triângulo: ");
        formulaTriangulo.setLado2(scanner.nextDouble());

        System.out.print("Digite o valor do lado3 do triângulo: ");
        formulaTriangulo.setLado3(scanner.nextDouble());

        System.out.print("\nPerimetro: " + formulaTriangulo.calcularPerimetro());
        System.out.print("\nÁrea: " + formulaTriangulo.calcularArea());

        System.out.print("\n--------------------------------------\n");
        Circulo formulaCirculo = new Circulo();

        System.out.print("\n---Círculo---\n");

        System.out.print("Digite o raio do circulo: ");
        formulaCirculo.setRaio(scanner.nextDouble());

        System.out.print("O valor de pi é: " + formulaCirculo.getPi());

        System.out.print("\nPerimetro: " + formulaCirculo.calcularPerimetro());
        System.out.print("\nÁrea: " + formulaCirculo.calcularArea());

    }
}
