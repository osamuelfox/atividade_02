package com.example.app_lista.controller;

import com.example.app_lista.model.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class TarefaController {

    private List listTarefa;
    public List getListTarefa(){
        listTarefa = new ArrayList<Tarefa>();

        listTarefa.add(new Tarefa("Casa"));
        listTarefa.add(new Tarefa("Trabalho"));
        listTarefa.add(new Tarefa("Escola"));

        return listTarefa;
    }

    public ArrayList<String> dadosSpinner(){
        ArrayList<String> dados = new ArrayList<>();
        for (int i = 0; i < getListTarefa().size(); i++){
            Tarefa objeto = (Tarefa) getListTarefa().get(i);
            dados.add(objeto.getTarefaDesejada());
        }
        return dados;
    }


}
