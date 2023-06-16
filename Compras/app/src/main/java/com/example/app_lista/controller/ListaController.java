package com.example.app_lista.controller;

import com.example.app_lista.model.Compras;
import com.example.app_lista.model.Lista;

import java.util.ArrayList;
import java.util.List;

public class ListaController {

    private List listaCompras;

    public List getListaCompras() {

        listaCompras = new ArrayList<Compras>();

        listaCompras.add(new Compras("Arroz"));
        listaCompras.add(new Compras("Feijao"));
        listaCompras.add(new Compras("Mandioca"));
        listaCompras.add(new Compras());

        return listaCompras;
    }
    public ArrayList<String> dadosSpinner(){
        ArrayList<String> dados = new ArrayList<>();
        for (int i = 0; i < getListaCompras().size(); i++){
            Lista objeto = (Lista) getListaCompras().get(i);
            dados.add(objeto.getListaDeDesejo());


        }
        return dados;

    }
}
