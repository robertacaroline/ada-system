package model;

import java.util.UUID;

public class Estoque {
    private String id;
    private String idProduto;
    private Integer quantidade;

    public Estoque(String idProduto, Integer quantidade) {
        this.id = UUID.randomUUID().toString();
        this.idProduto = idProduto;
        this.quantidade = quantidade;
    }

    public String getId() {
        return id;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
