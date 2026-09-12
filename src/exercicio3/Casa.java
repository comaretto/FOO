package exercicio3;

public class Casa {
    private String endereco;
    private double preco;
    private String tipo;
    private double area;

    public Casa() {
    }

    public Casa(String endereco, double preco, String tipo, double area) {
        this.endereco = endereco;
        this.preco = preco;
        this.tipo = tipo;
        this.area = area;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}

//Exercício 3: Múltiplos Construtores
//Tarefa: Modifique a classe Casa para incluir diferentes métodos construtores,
//permitindo instanciar o objeto em cenários distintos. Crie um construtor
//vazio (padrão) e outro construtor preenchido com todos os atributos
//(endereço, preço, tipo e área). Na classe principal, instancie duas casas,
//cada uma utilizando um dos construtores.
