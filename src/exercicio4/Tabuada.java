package exercicio4;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();

        System.out.println("\nTabuada com for: ");
        for (int i = 1; i <= 10; i++) {
            int resultado = num * i;
            System.out.println(num + "x" + i + " = " + resultado);
        }

        int i = 1;
        System.out.println("\nTabuada com while: ");
        while(i <= 10){
            int resultado = num * i;
            System.out.println(num + "x" + i + " = " + resultado);
            i++;
        }

    }
}
