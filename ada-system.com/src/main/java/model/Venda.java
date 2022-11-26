package model;

import java.util.List;
import java.util.UUID;

public class Venda {
    private String id;
    private List<ProdutoVenda> produtos;

    public Venda(List<ProdutoVenda> produtos) {
        this.id = UUID.randomUUID().toString();
        this.produtos = produtos;
    }

    public String getId() {
        return id;
    }

    public List<ProdutoVenda> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoVenda> produtos) {
        this.produtos = produtos;
    }
}
