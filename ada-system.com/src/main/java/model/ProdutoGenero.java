package model;

import java.util.List;

public abstract class ProdutoGenero extends Produto{
    private List<String> generos;

    public ProdutoGenero(String nome, Double preco, Integer quantidade, List<String> generos) {
        super(nome, preco, quantidade);
        this.generos = generos;
    }

    public List<String> getGeneros() {
        return generos;
    }
    public void addGenero(String genero) {
        this.generos.add(genero);
    }

    public void removeGenero(String genero){
        this.generos.remove(genero);
    }
}
