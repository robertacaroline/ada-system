package service.impl;

import dao.impl.JogoDaoImpl;
import model.Jogo;
import service.AbstractServiceCrud;

public class JogoServiceImpl extends AbstractServiceCrud<Jogo, String> {
    public JogoServiceImpl() {
        dao = new JogoDaoImpl();
    }
}
