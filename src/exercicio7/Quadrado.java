package exercicio7;

class Quadrado extends FormaGeometrica{

    private double lado;

    public Quadrado() {
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro(){
        return lado * 4;
    }

    @Override
    public double calcularArea(){
        return lado * lado;
    }

}
