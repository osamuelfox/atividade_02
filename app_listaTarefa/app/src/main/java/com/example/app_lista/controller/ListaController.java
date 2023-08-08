package com.example.app_lista.controller;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import com.example.app_lista.database.Lista_DB;
import com.example.app_lista.model.Lista;
import com.example.app_lista.view.MainActivity;

public class ListaController extends Lista_DB {
    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;

    public static final String NOME_PREFERENCES = "pref_listavip";

    public ListaController(MainActivity mainActivity){
        super(mainActivity);

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

        ContentValues dados = new ContentValues();

        Log.d("MVP_MVC_controller", "Salvo: " + outraLista.toString());

        listaVip.putString("Nome", outraLista.getNome());
        listaVip.putString("Descricao", outraLista.getDescricao());
        listaVip.putString("Data", outraLista.getData());
        listaVip.apply();

        dados.put("Nome",outraLista.getNome());
        dados.put("Descricao", outraLista.getDescricao());
        dados.put("Data", outraLista.getData());

        salvarObjeto("Lista", dados);
        return outraLista;
    }

    public Lista buscar(Lista outraLista){
        outraLista.setNome(preferences.getString("Nome", ""));
        outraLista.setDescricao(preferences.getString("Descricao", ""));
        outraLista.setData(preferences.getString("Data", ""));
        return outraLista;
    }

    public void limpar (){
        listaVip.clear();
        listaVip.apply();

    }

}
