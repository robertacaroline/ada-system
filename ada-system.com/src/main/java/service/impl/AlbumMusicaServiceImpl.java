package service.impl;

import dao.impl.AlbumMusicaDaoImpl;
import model.AlbumMusica;
import service.AbstractServiceCrud;

public class AlbumMusicaServiceImpl extends AbstractServiceCrud<AlbumMusica, String> {
    public AlbumMusicaServiceImpl() {
        dao = new AlbumMusicaDaoImpl();
    }
}
