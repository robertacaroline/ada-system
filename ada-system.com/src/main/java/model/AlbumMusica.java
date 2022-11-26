package model;


import java.util.List;

public class AlbumMusica extends ProdutoGenero {
    private List<String> musicas;
    private List<String> selos;

    public AlbumMusica(String nome, Double preco, Integer quantidade, List<String> generos, List<String> musicas, List<String> selos) {
        super(nome, preco, quantidade, generos);
        this.musicas = musicas;
        this.selos = selos;
    }

    public List<String> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<String> musicas) {
        this.musicas = musicas;
    }

    public List<String> getSelos() {
        return selos;
    }

    public void setSelos(List<String> selos) {
        this.selos = selos;
    }

    @Override
    public String toString() {
        return "NOME: " + this.getNome() + "\n" +
                "PREÇO: " + this.getPreco() + "\n" +
                "MUSICAS: " + this.getMusicas() + "\n" +
                "GENEROS: " + this.getGeneros() + "\n" +
                "SELOS: " + this.getSelos() + "\n";
    }
}
