package model;

public class ProdutoVenda
{
    private String id;
    private Integer quantidade;

    public ProdutoVenda(String id, Integer quantidade) {
        this.id = id;
        this.quantidade = quantidade;
    }

    public String getId() {
        return id;
    }
    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
