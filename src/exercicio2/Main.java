package exercicio2;

public class Main {
public static void main(String[] args) {
    Pessoa pessoa = new Pessoa();

    pessoa.setIdade(17);

    if (pessoa.getIdade() >= 18) {
        System.out.println("Maior de idade!");
    } else {
        System.out.println("Menor de idade");
    }
}
}
