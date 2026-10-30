package dev.comaretto.components;
import dev.comaretto.dao.PessoaDao;
import dev.comaretto.domain.Pessoa;
import dev.comaretto.domain.Endereco;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public final class MenuPessoa {

    private MenuPessoa() {
    }

    public static void exibir(Scanner scanner) {
        PessoaDao dao = new PessoaDao();

        int opcao;

        do {
            System.out.println("\n===== MENU CLIENTE =====");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Buscar cliente");
            System.out.println("4 - Atualizar cliente");
            System.out.println("5 - Deletar cliente");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = MenuGeral.lerOpcao(scanner);

            switch (opcao) {
                case 1:
                    Pessoa pessoa = new Pessoa();
                    System.out.println("Digite seu nome: ");
                    pessoa.setNome(scanner.nextLine());

                    System.out.println("Digite sua data de nascimento em Ano-Mês-dia: ");
                    String dataNascimento = scanner.nextLine();
                    pessoa.setDataNascimento(LocalDate.parse(dataNascimento));

                    System.out.println("Digite seu email: ");
                    pessoa.setEmail(scanner.nextLine());

                    System.out.println("Digite seu telefone: ");
                    pessoa.setTelefone(scanner.nextLine());

                    System.out.println("Digite seu gênero M/F: ");
                    pessoa.setGenero(scanner.nextLine());

                    if (pessoa.getGenero().equals("m")){
                        pessoa.setGenero("Masculino");
                    }
                    else if (pessoa.getGenero().equals("f")){
                        pessoa.setGenero("Feminino");
                    }

                    System.out.println("Digite seu cpf: ");
                    pessoa.setCpf(scanner.nextLine());

                    Endereco endereco = new Endereco();

                    System.out.println("Digite seu estado: ");
                    endereco.setEstado(scanner.nextLine());

                    System.out.println("Digite seu cidade: ");
                    endereco.setCidade(scanner.nextLine());

                    System.out.println("Digite seu rua: ");
                    endereco.setRua(scanner.nextLine());

                    System.out.println("Digite seu numero: ");
                    endereco.setNumero(Integer.parseInt(scanner.nextLine()));

                    pessoa.setEndereco(endereco);
                    dao.salvar(pessoa);
                    break;

                case 2:
                    System.out.println("\n=========================== Lista Pessoas ===========================");
                    List<Pessoa> pessoas = dao.listar();
                    if(pessoas.isEmpty()){
                        System.out.println("Lista está vazia!");
                    }
                    for (int i = 0; i < pessoas.size(); i++ ){
                        mostrarPessoa(i, pessoas.get(i));
                    }
                    break;

                case 3:
                    System.out.println("Digite o Indice do cliente que deseja buscar: ");
                    int indice = scanner.nextInt();

                    mostrarPessoa(indice, dao.buscar(indice));
                    break;

                case 4:
                    System.out.println("Digite o Indice do cliente que deseja atualizar: ");
                    int indice1 = scanner.nextInt();
                    scanner.nextLine();

                    List<Pessoa> listaPessoas = dao.listar();

                    if (indice1 < 0 || indice1 >= listaPessoas.size()) {
                        System.out.println("Índice inválido!");
                        break;
                    }

                    atualizarPessoa(listaPessoas.get(indice1));
                    break;

                case 5:
                    System.out.println("Digite o índice do produto que deseja deletar: ");
                    int indice2 = scanner.nextInt();
                    scanner.nextLine();

                    if (indice2 < 0 || indice2 >= dao.listar().size()) {
                        System.out.println("Índice inválido!");
                        break;
                    }
                    dao.excluir(indice2);
                    break;

                case 0:
                    System.out.println("Voltando ao menu geral...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }
    private static void mostrarPessoa(int indice, Pessoa pessoa){
        Endereco endereco = pessoa.getEndereco();

        System.out.println(indice + " - " + "Nome: " + pessoa.getNome()
        + " | Data de nascimento: " + pessoa.getDataNascimento()
        + " | Email: " + pessoa.getEmail()
        + " | Telefone: " + pessoa.getTelefone()
        + " | Genero: " + pessoa.getGenero()
        + " | Cpf: " + pessoa.getCpf()
        + " | Endereço: " + endereco.getEstado()
                + ", " + endereco.getCidade()
        + ", " + endereco.getRua()
        + ", " + endereco.getNumero()
                + " |");

    }

    private static void atualizarPessoa(Pessoa pessoa){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        pessoa.setNome(scanner.nextLine());

        System.out.println("Digite sua data de nascimento em Ano-Mês-dia: ");
        String dataNascimento = scanner.nextLine();
        pessoa.setDataNascimento(LocalDate.parse(dataNascimento));

        System.out.println("Digite seu email: ");
        pessoa.setEmail(scanner.nextLine());

        System.out.println("Digite seu telefone: ");
        pessoa.setTelefone(scanner.nextLine());

        System.out.println("Digite seu gênero M/F: ");

        if (pessoa.getGenero().equals("m") ||  pessoa.getGenero().equals("M")){
            pessoa.setGenero("Masculino");
        }
        else if (pessoa.getGenero().equals("f") ||  pessoa.getGenero().equals("F")){
            pessoa.setGenero("Feminino");
        }
        scanner.nextLine();

        System.out.println("Digite seu cpf: ");
        pessoa.setCpf(scanner.nextLine());

        Endereco endereco = new Endereco();

        System.out.println("Digite seu estado: ");
        endereco.setEstado(scanner.nextLine());

        System.out.println("Digite seu cidade: ");
        endereco.setCidade(scanner.nextLine());

        System.out.println("Digite seu rua: ");
        endereco.setRua(scanner.nextLine());

        System.out.println("Digite seu numero: ");
        endereco.setNumero(Integer.parseInt(scanner.nextLine()));

        pessoa.setEndereco(endereco);
    }
}
