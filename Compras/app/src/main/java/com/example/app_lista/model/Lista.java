package com.example.app_lista.model;

public class Lista {

    public String listaDeDesejo;

    public Lista() {
    }

    public Lista(String listaDeDesejo) {
        this.listaDeDesejo = listaDeDesejo;
    }

    public String getListaDeDesejo() {
        return listaDeDesejo;
    }

    public void setListaDeDesejo(String listaDeDesejo) {
        this.listaDeDesejo = listaDeDesejo;
    }

    @Override
    public String toString() {
        return "Lista{" +
                "listaDeDesejo='" + listaDeDesejo + '\'' +
                '}';
    }
}
