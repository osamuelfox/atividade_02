package com.example.app_lista.controller;

import com.example.app_lista.model.Lista;

import java.util.ArrayList;
import java.util.List;

public class ListaController {

    private List listaAgenda;

    public List getListaAgenda() {

        listaAgenda = new ArrayList<Lista>();

        listaAgenda.add(new Lista("Desenvolvimento"));
        listaAgenda.add(new Lista("Enfermagem"));
        listaAgenda.add(new Lista("Administracao"));
        listaAgenda.add(new Lista("Moda"));
        listaAgenda.add(new Lista("Culinaria"));
        listaAgenda.add(new Lista("Catira"));
        listaAgenda.add(new Lista("Jogo do Bicho"));
        return listaAgenda;
    }

    public ArrayList<String> dadosSpinner(){
        ArrayList<String> dados = new ArrayList<>();

        for (int i = 0; i < getListaAgenda().size(); i++){
            Lista objeto = (Lista) getListaAgenda().get(i);
            dados.add(objeto.getListaDeDesejo());
        }

        return dados;
    }
}
