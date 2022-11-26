package model;

public class Brinquedo extends Produto {
    private String tipo;

    public Brinquedo(String nome, Double preco, Integer quantidade, String tipo) {
        super(nome, preco, quantidade);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "NOME: " + this.getNome() + "\n" +
                "PREÇO: " + this.getPreco() + "\n" +
                "TIPO: " + this.getTipo() + "\n";
    }
}
