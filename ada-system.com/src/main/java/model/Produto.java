package model;

import java.util.UUID;

public abstract class Produto<T, K> {
    private String id;
    private String nome;
    private Double preco;
    private Estoque estoque;

    public Produto(String nome, Double preco, Integer quantidade) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.preco = preco;
        this.estoque = new Estoque(
                this.id,
                quantidade
        );
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}
