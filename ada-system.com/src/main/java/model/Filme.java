package model;

import java.util.List;

public class Filme extends ProdutoGenero {
    private List<String> diretores;
    private List<String> produtores;

    public Filme(String nome, Double preco, Integer quantidade, List<String> generos, List<String> diretores, List<String> produtores) {
        super(nome, preco, quantidade, generos);
        this.diretores = diretores;
        this.produtores = produtores;
    }

    public List<String> getDiretor() {
        return diretores;
    }

    public void addDiretor(String diretor) {
        this.diretores.add(diretor);
    }

    public List<String> getProdutores() {
        return produtores;
    }

    public void setProdutores(String produtores) {
        this.produtores.add(produtores);
    }

    @Override
    public String toString() {
        return "NOME: " + this.getNome() + "\n" +
                "PREÇO: " + this.getPreco() + "\n" +
                "DIRETORES: " + this.getDiretor() + "\n" +
                "GENEROS: " + this.getGeneros() + "\n" +
                "PRODUTES: " + this.getProdutores() + "\n";
    }
}
