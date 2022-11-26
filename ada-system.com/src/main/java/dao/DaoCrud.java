package dao;

import java.util.List;

public interface DaoCrud<T, K> {
    void salvar(T entity, K id);

    T buscarPorId(K identity);

    void editar(T entity, K id);

    void remover(T entity);

    List<T> buscarTodos();

	void vender(T entity, K id);
}
