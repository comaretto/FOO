package dev.comaretto.dao;
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
        return listarProdutos;
    }

    @Override
    public void atualizar(int indice, Produto objeto) {
        listarProdutos.set(indice, objeto);
    }

    @Override
    public Produto buscar(int indice) {

        return this.listarProdutos.get(indice);
    }

    @Override
    public void excluir(int indice) {
        listarProdutos.remove(indice);
    }

}
