package exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funcionario novato = new Funcionario();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        novato.setNome(scanner.nextLine());

        System.out.print("Digite a idade: ");
        novato.setIdade(scanner.nextInt());

        if (novato.getIdade() <= 16){
            System.out.print("Olá " + novato.getNome() + "\nDefinido como aprendiz");
            novato.setAprendiz(true);
        }
        else{
            System.out.print("Olá " + novato.getNome() + "\nDefinido como funcionário normal");
            novato.setAprendiz(false);
        }
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