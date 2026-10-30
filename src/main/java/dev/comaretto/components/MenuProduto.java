package dev.comaretto.components;
import dev.comaretto.domain.*;
import dev.comaretto.dao.ProdutoDao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public final class MenuProduto {

    private MenuProduto() {
    }

    public static void exibir(Scanner scanner) {
        int opcao;
        int tipoProduto;
        ProdutoDao dao = new ProdutoDao();

        do {
            System.out.println("\n===== MENU PRODUTO =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Buscar produto");
            System.out.println("4 - Atualizar produto");
            System.out.println("5 - Deletar produto");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = MenuGeral.lerOpcao(scanner);


            switch (opcao) {
                case 1:
                    Produto produto;

                    System.out.println("Qual o tipo do produto (1 - Eletrodoméstico ou 2 - Móvel): ");
                    tipoProduto = scanner.nextInt();

                    if (tipoProduto == 1) {
                        produto = new Eletrodomestico();
                    }
                    else if (tipoProduto == 2) {
                       produto = new Movel();
                    }
                    else {
                        System.out.println("Comando errado, tente novamente");
                        break;
                    }
                    scanner.nextLine();

                    System.out.println("Digite o código do produto: ");
                    produto.setCodigo(scanner.nextLine());

                    System.out.println("Digite o nome do produto: ");
                    produto.setNome(scanner.nextLine());

                    System.out.println("Digite o valor do produto: ");
                    produto.setPreco(BigDecimal.valueOf(scanner.nextDouble()));
                    scanner.nextLine();

                    System.out.println("Digite a data de criação em Ano-Mês-dia: ");
                    String dataCriacao = scanner.nextLine();
                    produto.setDataCriacao(LocalDate.parse(dataCriacao));

                    System.out.println("Digite o nome do responsável: ");
                    produto.setCriadoPor(scanner.nextLine());

                    dao.salvar(produto);
                    break;

                case 2:
                    List<Produto> produtos = dao.listar();
                    if(produtos.isEmpty()){
                        System.out.println("Lista está vazia!");
                    }
                    for (int i = 0; i < produtos.size(); i++) {
                        mostrarProduto(i, produtos.get(i));
                    }
                    break;

                case 3:
                    System.out.println("Digite o índice do produto que deseja buscar: ");
                    int indice1 = scanner.nextInt();
                    scanner.nextLine();

                    List<Produto> listaBusca = dao.listar();

                    if (indice1 < 0 || indice1 >= listaBusca.size()) {
                        System.out.println("Produto não encontrado!");
                    } else {
                        mostrarProduto(indice1, listaBusca.get(indice1));
                    }
                    break;

                case 4:
                    System.out.println("Digite o índice do produto que deseja atualizar: ");
                    int indice2 = scanner.nextInt();
                    scanner.nextLine();

                    List<Produto> lista = dao.listar();

                    if (indice2 < 0 || indice2 >= lista.size()) {
                        System.out.println("Índice inválido!");
                        break;
                    }

                    atualizarProduto(scanner, lista.get(indice2));
                    System.out.println("Produto atualizado!");
                    break;

                case 5:
                    System.out.println("Digite o índice do produto que deseja deletar: ");
                    int indice3 = scanner.nextInt();
                    scanner.nextLine();

                    if (indice3 < 0 || indice3 >= dao.listar().size()) {
                        System.out.println("Índice inválido!");
                        break;
                    }
                    dao.excluir(indice3);
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
    private static void mostrarProduto(int indice, Produto produto){

        System.out.println("\n=========================== Lista Produtos =========================== ");
        System.out.println(indice + " - " + "Tipo: " + produto.getTipo()
                + " | Nome: " + produto.getNome()
                + " | Código: " + produto.getCodigo()
                + " | Valor: " + produto.getPreco()
                + " | Data de Criação: " + produto.getDataCriacao()
                + " | Responsável: " + produto.getCriadoPor()
        + "|");
    }
    private static void atualizarProduto(Scanner scanner, Produto produto){
        System.out.println("Digite o novo código do produto: ");
        produto.setCodigo(scanner.nextLine());

        System.out.println("Digite o novo nome do produto: ");
        produto.setNome(scanner.nextLine());

        System.out.println("Digite o novo valor do produto: ");
        produto.setPreco(BigDecimal.valueOf(scanner.nextDouble()));
        scanner.nextLine();

        System.out.println("Digite a data de criação em Ano-Mês-dia: ");
        String dataCriacao = scanner.nextLine();
        produto.setDataCriacao(LocalDate.parse(dataCriacao));

        System.out.println("Digite o nome do responsável: ");
        produto.setCriadoPor(scanner.nextLine());

    }
}