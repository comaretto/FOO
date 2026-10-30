package exercicio3;

public class Main {
    public static void main(String[] args) {

        Casa casa1 = new Casa("Rua Girassol", 250000.0, "Casa", 200);

        Casa casa2 = new Casa();
        casa2.setEndereco("Cascavel");
        casa2.setTipo("Apartamento");
        casa2.setArea(250);
        casa2.setPreco(100000.00);

        System.out.println("Endereço: " + casa2.getEndereco() + " Preço: " + casa2.getPreco() +
                " Área: " + casa2.getArea() + " Tipo: " + casa2.getTipo());

        System.out.println("Endereço: " + casa1.getEndereco() + " Preço: " + casa1.getPreco() +
                " Área: " + casa1.getArea() + " Tipo: " + casa1.getTipo());

    }
}
