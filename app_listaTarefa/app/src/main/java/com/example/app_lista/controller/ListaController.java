package com.example.app_lista.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import com.example.app_lista.model.Lista;
import com.example.app_lista.view.MainActivity;

public class ListaController {
    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;

    public static final String NOME_PREFERENCES = "pref_listavip";

    public ListaController(MainActivity mainActivity){

        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
        listaVip = preferences.edit();
    }

    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_controller", "Controller Iniciado");
        return super.toString();
    }

    public Lista salvar(Lista outraLista) {

        Log.d("MVP_MVC_controller", "Salvo: " + outraLista.toString());

        listaVip.putString("Nome", outraLista.getNome());
        listaVip.putString("Descricao", outraLista.getDescricao());
        listaVip.putString("Data", outraLista.getData());
        listaVip.apply();
        return outraLista;
    }

    public Lista buscar(Lista outraLista){
        outraLista.setNome(preferences.getString("Nome", ""));
        outraLista.setDescricao(preferences.getString("Descricao", ""));
        outraLista.setData(preferences.getString("Data", ""));
        return outraLista;
    }

    public void limpar ( Lista Lista ){
        listaVip.clear();
        listaVip.apply();

    }

}
