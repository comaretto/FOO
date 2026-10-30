package exercicio5;

public class Funcionario extends Pessoa {
    private double salario;
    private String cargo;
    private String departamento;
    private boolean aprendiz;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public boolean isAprendiz() {
        return aprendiz;
    }

    public void setAprendiz(boolean aprendiz) {
        this.aprendiz = aprendiz;
    }
}

//Exercício 5: Herança Simples e Operadores Relacionais
//Tarefa: Crie uma superclasse chamada Pessoa contendo os atributos nome, idade
//e email. Em seguida, crie uma classe filha chamada Funcionario que herde de
//Pessoa (utilizando extends). Esta subclasse deverá possuir os seguintes
//atributos específicos: salario, cargo, departamento e aprendiz (do tipo
//boolean). No seu programa principal, ao instanciar um novo funcionário,
//utilize operadores relacionais para verificar a sua idade: se a idade for
//menor ou igual a 16 anos, o atributo aprendiz deve ser definido como
//verdadeiro (true). Caso a idade seja maior que 16, o atributo deve ser
//definido como falso (false).