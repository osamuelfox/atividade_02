package com.example.app_lista.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import com.example.app_lista.model.Agenda;
import com.example.app_lista.view.MainActivity;

public class AgendaController {

    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;

    public static final String NOME_PREFERENCES = "pref_listavip";

    public AgendaController(MainActivity mainActivity){

        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
        listaVip = preferences.edit();
    }

    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_controller", "Controller Iniciado");
        return super.toString();
    }

    public Agenda salvar(Agenda outraAgenda) {

        Log.d("MVP_MVC_controller", "Salvo: " + outraAgenda.toString());

        listaVip.putString("Titulo", outraAgenda.getTitulo());
        listaVip.putString("Data", outraAgenda.getData());
        listaVip.putString("Hora", outraAgenda.getHora());
        listaVip.putString("Local", outraAgenda.getLocal());
        listaVip.apply();
        return outraAgenda;
    }

    public Agenda buscar(Agenda outraAgenda){
        outraAgenda.setTitulo(preferences.getString("Titulo", ""));
        outraAgenda.setData(preferences.getString("Data", ""));
        outraAgenda.setHora(preferences.getString("Hora", ""));
        outraAgenda.setLocal(preferences.getString("Local", ""));
        return outraAgenda;
    }

    public void limpar ( Agenda agenda ){
        listaVip.clear();
        listaVip.apply();
    }
}