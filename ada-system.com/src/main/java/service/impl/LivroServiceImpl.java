package service.impl;

import dao.impl.LivroDaoImpl;
import model.Livro;
import service.AbstractServiceCrud;

public class LivroServiceImpl extends AbstractServiceCrud<Livro, String> {
    public LivroServiceImpl() {
        dao = new LivroDaoImpl();
    }
}
