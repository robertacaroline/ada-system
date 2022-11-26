package model;

import java.util.List;

public class Livro extends ProdutoGenero {
    private String escritor;
    private String editora;

    public Livro(String nome, Double preco, Integer quantidade, List<String> generos, String escritor, String editora) {
        super(nome, preco, quantidade, generos);
        this.escritor = escritor;
        this.editora = editora;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
