package com.example.app_lista.model;

public class Agenda {

    private String titulo;
    private String data;
    private String hora;
    private String local;
    private String curso;

    public Agenda(){
    }

    public Agenda(String titulo, String data, String hora, String local, String curso) {
        this.titulo = titulo;
        this.data = data;
        this.hora = hora;
        this.local = local;
        this.curso = curso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "titulo='" + titulo + '\'' +
                ", data='" + data + '\'' +
                ", hora='" + hora + '\'' +
                ", local='" + local + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}
