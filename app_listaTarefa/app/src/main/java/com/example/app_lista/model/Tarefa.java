package com.example.app_lista.model;

public class Tarefa {

    private String tarefaDesejada;

    public Tarefa(String tarefaDesejada){this.tarefaDesejada = tarefaDesejada;}

    public String getTarefaDesejada() {return tarefaDesejada;}

    public void setTarefaDesejada(String tarefaDesejada){this.tarefaDesejada = tarefaDesejada;}

    @Override
    public String toString() {
        return "Tarefa{" +
                "tarefaDesejada='" + tarefaDesejada + '\'' +
                '}';
    }
}
