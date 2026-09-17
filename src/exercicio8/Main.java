package exercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do{
        System.out.println("\n---Cadastro Universidade---");
        System.out.println("1. Cadastrar Aluno");
        System.out.println("2. Cadastrar Professor");
        System.out.println("3. Sair...");
        System.out.println("Digite a opção que deseja: ");
        opcao = scanner.nextInt();
        scanner.nextLine();


            switch (opcao) {
                case 1:
                    Aluno cadastroAluno = new Aluno();

                    System.out.println("Digite o nome do aluno: ");
                    cadastroAluno.setNome(scanner.nextLine());

                    System.out.println("Digite a idade do aluno: ");
                    cadastroAluno.setIdade(scanner.nextInt());

                    if (cadastroAluno.getIdade() >= 16 && cadastroAluno.getIdade() <= 99) {
                        System.out.println("Idade válida para ingressar");
                    } else {
                        System.out.println("Idade não permitida!");
                        break;
                    }

                    System.out.println("Informe sua renda familiar: ");
                    cadastroAluno.setRendaFamiliar(scanner.nextDouble());

                    System.out.println("Informe se participa ativamente de projetos de extensão com 'true' se participa ou 'false' se não participa: ");
                    cadastroAluno.setProjetoExtensao(scanner.nextBoolean());

                    if (cadastroAluno.getRendaFamiliar() <= 1500.00 || cadastroAluno.getProjetoExtensao() == true) {
                        System.out.println("Você tem direito a auxílio estudantil");
                        cadastroAluno.setAuxilioEstudantil(true);
                    } else {
                        cadastroAluno.setAuxilioEstudantil(false);
                    }
                    System.out.println("\n---Cadastro Finalizado---");
                    System.out.println("Nome: " + cadastroAluno.getNome());
                    System.out.println("Idade: " + cadastroAluno.getIdade());
                    System.out.println("Renda Familiar: " + cadastroAluno.getRendaFamiliar());
                    System.out.println("Projeto de Extensão Ativo: " + cadastroAluno.getProjetoExtensao());
                    System.out.println("Auxílio Estudantil: " + cadastroAluno.getAuxilioEstudantil());
                    break;

                case 2:
                    Professor cadastroProfessor = new Professor();

                    System.out.println("Digite o nome do Professor: ");
                    cadastroProfessor.setNome(scanner.nextLine());

                    System.out.println("Digite a idade do Professor: ");
                    cadastroProfessor.setIdade(scanner.nextInt());

                    System.out.println("Digite a quantidade de anos de experiência que o professor possui: ");
                    cadastroProfessor.setAnosExperiencia(scanner.nextInt());

                    System.out.println("Tem pós graduação, digite 'true' se possuir, se não digite 'false: '");
                    cadastroProfessor.setTemPosGraduacao(scanner.nextBoolean());

                    System.out.println("É bacharelado, digite 'true' se possuir, se não digite 'false: '");
                    cadastroProfessor.setEhBacharel(scanner.nextBoolean());

                    if (cadastroProfessor.getAnosExperiencia() > 2 && (cadastroProfessor.getTemPosGraduacao() == true || cadastroProfessor.getEhBacharel() == true)) {
                        System.out.println("É efetivado!");
                        cadastroProfessor.setEfetivo(true);
                    } else {
                        System.out.println("Não é efetivado!");
                        cadastroProfessor.setEfetivo(false);
                        break;
                    }
                    System.out.println("\n---Cadastro Finalizado---");
                    System.out.println("Nome: " + cadastroProfessor.getNome());
                    System.out.println("Idade: " + cadastroProfessor.getIdade());
                    System.out.println("Anos de experiência: " + cadastroProfessor.getAnosExperiencia());
                    System.out.println("Pós graduação: " + cadastroProfessor.getTemPosGraduacao());
                    System.out.println("Bacharelado: " + cadastroProfessor.getEhBacharel());
                    break;


                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção Inválida! Digite novamente: ");
                    break;
            }
        }while (opcao != 3);
    }
}



//Exercício 8: Menus (Switch Case) e Operadores Lógicos
//Tarefa: Desenvolva um pequeno sistema de cadastro acadêmico via console.
//Primeiro, apresente ao usuário um menu utilizando a estrutura switch case com
//as seguintes opções: 1 - Cadastrar Aluno, 2 - Cadastrar Professor e 3 - Sair.
//Dentro de cada opção (case), você deve solicitar a entrada de dados e aplicar
//regras de validação utilizando estruturas condicionais (if/else), operadores
//relacionais (>, <, >=, <=, ==, !=) e operadores lógicos (&&, ||, !).
//● Regras para o Cadastro de Aluno:
//○ Validação de Idade: O sistema só deve permitir o cadastro se o
//aluno tiver uma idade válida para ingressar no ensino superior.
//Utilize o operador AND (&&) para verificar se a idade é maior ou
//igual a 16 e menor ou igual a 99.
//○ Validação de Benefício: Verifique se o aluno tem direito a auxílio
//estudantil. Ele recebe o benefício se a renda familiar for menor
//que R$ 1.500,00 ou (operador OR ||) se ele estiver ativamente
//participando de um projeto de extensão (recebido como uma variável
//boolean).
//● Regras para o Cadastro de Professor
//Validação de Contratação: Um professor só deve ter o status de
//"Efetivo" se possuir mais de 2 anos de experiência (anosExperiencia
//> 2) e (operador AND &&), em sua formação, possuir pós-graduação
//(temPosGraduacao == true) ou (operador OR ||) ser bacharel
//(ehBacharel == true). Dica: você precisará usar parênteses para
//isolar a verificação da formação da verificação de experiência.
//Caso não atenda a esses requisitos combinados, será classificado
//como "Temporário".