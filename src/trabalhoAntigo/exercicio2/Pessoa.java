package exercicio2;

public class Pessoa {
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

//Exercício 2: Encapsulamento e Controle de Fluxo
//Tarefa: Crie uma classe Pessoa aplicando o princípio do encapsulamento para
//proteger os dados: declare a idade como private e crie métodos public get e
//set para acessá-la e modificá-la. Na classe principal, informe a idade e crie
//um fluxo condicional if/else que verifique se a pessoa está apta a tirar a
//carteira de motorista (idade >= 18).