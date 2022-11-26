package service.impl;
import dao.impl.BrinquedoDaoImpl;
import model.Brinquedo;
import service.AbstractServiceCrud;

public class BrinquedoServiceImpl extends AbstractServiceCrud<Brinquedo, String> {
    public BrinquedoServiceImpl() {
        dao = new BrinquedoDaoImpl();
    }
}
