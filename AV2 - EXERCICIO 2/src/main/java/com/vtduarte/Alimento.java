package com.vtduarte;


public class Alimento {
    private String titulo;
    private String descricao;
    private float preco;

    public Alimento(String titulo, String descricao, float preco) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getPreco() {
        return preco;
    }
}
