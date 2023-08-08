package com.example.app_lista.model;

public class Compras {

    private String nome;
    private String Quantidae;
    private String Local;

    public Compras(){

    }

    public Compras(String nome, String Quantidae, String Local) {
        this.nome = nome;
        this.Quantidae = Quantidae;
        this.Local = Local;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuantidae() {
        return Quantidae;
    }

    public void setQuantidae(String quantidae) {
        this.Quantidae = quantidae;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String local) {
        this.Local = local;
    }

    @Override
    public String toString() {
        return "Compras{" +
                "nome='" + nome + '\'' +
                ", Quantidae='" + Quantidae + '\'' +
                ", Local='" + Local + '\'' +
                '}';
    }
}
