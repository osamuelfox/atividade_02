package com.example.app_lista.controller;

import com.example.app_lista.model.Agenda;

import java.util.ArrayList;
import java.util.List;

public class ListaController {

    private List listaAgenda;

    public List getListaAgenda() {

        listaAgenda = new ArrayList<Agenda>();

        listaAgenda.add(new Agenda(""));
        listaAgenda.add(new Agenda("Desenvolvimento"));
        listaAgenda.add(new Agenda("Enfermagem"));
        listaAgenda.add(new Agenda("Administracao"));
        listaAgenda.add(new Agenda("Moda"));
        listaAgenda.add(new Agenda("Culinaria"));
        listaAgenda.add(new Agenda("Catira"));
        listaAgenda.add(new Agenda("Jogo do Bicho"));
        return listaAgenda;
    }
}
