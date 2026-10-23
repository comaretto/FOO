package exercicio7;

public class Circulo extends FormaGeometrica{
    private double pi = 3.14;
    private double raio;

    public Circulo(double raio, double pi) {
        this.raio = raio;
        this.pi = pi;
    }

    public Circulo() {
    }

    public double getPi() {
        return pi;
    }

    public double getRaio() {
        return raio;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularPerimetro(){
        return (2 * pi) * raio;
    }

    @Override
    public double calcularArea(){
        return pi * (raio * raio);
    }
}
