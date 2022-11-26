package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class DaoAbstract<T,K> implements DaoCrud<T,K> {
    private Map<K, T> db = new HashMap<>();

    public DaoAbstract() {
    }
    @Override
    public void salvar(T entity, K id) {
       db.put(id,entity);
    }

    @Override
    public T buscarPorId(K identity) {
        return db.get(identity);
    }

    @Override
    public void editar(T entity, K id) {
        db.put(id,entity);
    }

    @Override
    public void remover(T entity) {
        db.remove(entity);
    }
    @Override
    public List<T> buscarTodos() {
        return db.values().stream().toList();
    }
    @Override
    public void vender(T entity, K id) {
    	db.put(id,entity);
    }
}
