package com.example.app_lista.model;

public class Lista {

    private String nome;
    private String descricao;
    private String Data;


    public Lista(){

    }

    public Lista(String nome, String descricao, String Data) {
        this.nome = nome;
        this.descricao = descricao;
        this.Data = Data;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    @Override
    public String toString() {
        return "Lista{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", Data='" + Data + '\'' +
                '}';
    }
}
