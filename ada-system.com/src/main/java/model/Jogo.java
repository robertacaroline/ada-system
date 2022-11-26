package model;

import java.util.List;

public class Jogo extends ProdutoGenero {
    private String distribuidora;
    private String estudio;

    public Jogo(String nome, Double preco, Integer quantidade, List<String> generos, String distribuidora, String estudio) {
        super(nome, preco, quantidade, generos);
        this.distribuidora = distribuidora;
        this.estudio = estudio;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    @Override
    public String toString() {
        return "NOME: " + this.getNome() + "\n" +
                "PREÇO: " + this.getPreco() + "\n" +
                "DISTRIBUIDORAS: " + this.getDistribuidora() + "\n" +
                "GENEROS: " + this.getGeneros() + "\n" +
                "ESTUDIO: " + this.getEstudio() + "\n";
    }
}
