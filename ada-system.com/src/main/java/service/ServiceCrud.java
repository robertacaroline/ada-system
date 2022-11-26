package service;

import java.util.List;

public interface ServiceCrud<T, K> {
    void salvar(T entity, K id);

    T buscarPorId(K identity);

    void editar(T entity, K id);

    void remover(T identity);

    List<T> buscarTodos();
}
