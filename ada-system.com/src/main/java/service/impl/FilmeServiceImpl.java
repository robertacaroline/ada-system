package service.impl;

import dao.impl.FilmeDaoImpl;
import model.Filme;
import service.AbstractServiceCrud;

public class FilmeServiceImpl extends AbstractServiceCrud<Filme, String> {
    public FilmeServiceImpl() {
        dao = new FilmeDaoImpl();
    }
}
