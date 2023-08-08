package com.example.app_lista.controller;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import com.example.app_lista.database.Compra_DB;
import com.example.app_lista.model.Compras;
import com.example.app_lista.view.MainActivity;

public class ComprasController extends Compra_DB {
    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;

    public static final String NOME_PREFERENCES = "pref_listavip";

    public ComprasController(MainActivity mainActivity){
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

    public Compras salvar(Compras outraCompras) {

        ContentValues dados = new ContentValues();

        Log.d("MVP_MVC_controller", "Salvo: " + outraCompras.toString());

        listaVip.putString("Nome", outraCompras.getNome());
        listaVip.putString("Quantidade", outraCompras.getQuantidae());
        listaVip.putString("Local", outraCompras.getLocal());
        listaVip.apply();


        dados.put("Nome", outraCompras.getNome());
        dados.put("Quantidade", outraCompras.getQuantidae());
        dados.put("Local", outraCompras.getLocal());

        salvarObjeto("Lista", dados);
        return outraCompras;
    }


    public Compras buscar(Compras outraCompras){
        outraCompras.setNome(preferences.getString("Nome", ""));
        outraCompras.setQuantidae(preferences.getString("Quantidade", ""));
        outraCompras.setLocal(preferences.getString("Local", ""));
        return outraCompras;
    }

    public void limpar (){
        listaVip.clear();
        listaVip.apply();

    }

}
