package br.com.benezinho.model;

public class Produto {

    private String nome;
    private double preco;
    private Categoria categoria;

    public Produto() {
    }

    public Produto(String nome, double preco, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produto{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", preco=").append(preco);
        sb.append(", categoria=").append(categoria);
        sb.append('}');
        return sb.toString();
    }
}
