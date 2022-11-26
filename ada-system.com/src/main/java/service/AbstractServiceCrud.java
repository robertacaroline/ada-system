package service;

import dao.DaoAbstract;

import java.util.List;

public abstract class AbstractServiceCrud<T,K> implements ServiceCrud<T, K> {
    protected DaoAbstract<T,K> dao;
    @Override
    public void salvar(T entity, K id) {
        dao.salvar(entity, id);
    }

    @Override
    public T buscarPorId(K identity) {
        return dao.buscarPorId(identity);
    }

    @Override
    public void editar(T entity, K id) {
        dao.editar(entity, id);
    }

    @Override
    public void remover(T entity) {
        dao.remover(entity);
    }

    @Override
    public List<T> buscarTodos() {
        return dao.buscarTodos();
    }
}
