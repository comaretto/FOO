package exercicio1;

public class Main{
    public static void main(String[] args){
        Casa casa = new Casa();
        casa.area = 150.0;
        casa.preco = 20.5;

        double valor = casa.preco / casa.area;

        System.out.println("Preço da casa: " + casa.preco);
        System.out.println("Área da casa: " + casa.area);
        System.out.println("Valor do metro quadrado: " + valor);

    }
}