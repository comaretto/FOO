package dev.comaretto.dao;
import dev.comaretto.domain.Pessoa;
import dev.comaretto.domain.Produto;
import dev.comaretto.interfaces.Crud;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDao implements Crud<Produto> {
    private List<Produto> listarProdutos = new ArrayList<Produto>();

    @Override
    public void salvar(Produto produto){
        listarProdutos.add(produto);
    }

    @Override
    public List<Produto> listar() {
        return List.of();
    }

    @Override
    public void atualizar(int indice, Produto objeto) {

    }

    @Override
    public Pessoa buscar(int indice) {
        return null;
    }

    @Override
    public void excluir(int indice) {

    }

}
