import java.util.Scanner;

public class Fibonacci{
    public static void main(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de termos: ");
        int num = scanner.nextInt();

        int primeiro = 0;
        int segundo = 1;

        for(int i = 0; i < num; i++){
            System.out.println(primeiro + " ");

            int proximo = primeiro + segundo;

            primeiro = segundo;
            segundo = proximo;
        }

        scanner.close();
    }
}