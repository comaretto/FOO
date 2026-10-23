package dev.comaretto.dao;

import dev.comaretto.domain.Pessoa;
import dev.comaretto.interfaces.Crud;

import java.util.ArrayList;
import java.util.List;

public class PessoaDao implements Crud<Pessoa> {
    private List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

    @Override
    public void salvar(Pessoa pessoa) {
        listaPessoas.add(pessoa);
    }

    @Override
    public List<Pessoa> listar() {
        return List.of();
    }

    @Override
    public void atualizar(int indice, Pessoa objeto) {

    }

    @Override
    public Pessoa buscar(int indice) {
    return null;
    }

    @Override
    public void excluir(int indice) {
    }
}
