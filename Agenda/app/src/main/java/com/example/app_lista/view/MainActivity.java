package com.example.app_lista.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_lista.R;
import com.example.app_lista.controller.AgendaController;
import com.example.app_lista.controller.ListaController;
import com.example.app_lista.model.Agenda;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Agenda agenda;
    Agenda outraAgenda;
    List<String> categoriaAgenda;

    AgendaController controller;
    ListaController listaController;

    EditText editTituloDoCompromisso;
    EditText editdata;
    EditText editHora;
    EditText editLocal;

    Button btnbuton_Limpar;
    Button btnbuton_Salvar;
    Button btnbuton_Finalizar;

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaController = new ListaController();

        categoriaAgenda = listaController.dadosSpinner();

        listaController.getListaAgenda();

        controller = new AgendaController(MainActivity.this);
        controller.toString();

        outraAgenda = new Agenda();
        controller.buscar(outraAgenda);

        editTituloDoCompromisso = findViewById(R.id.text_TituloDoCompromisso);
        editdata = findViewById(R.id.text_Data);
        editHora = findViewById(R.id.text_Hora);
        editLocal = findViewById(R.id.text_Local);

        spinner = findViewById(R.id.ListaSpinner);

        btnbuton_Limpar = findViewById(R.id.button_Limpar);
        btnbuton_Salvar = findViewById(R.id.button_Salvar);
        btnbuton_Finalizar = findViewById(R.id.button_Finalizar);

        editTituloDoCompromisso.setText(agenda.getTitulo());
        editdata.setText(agenda.getData());
        editHora.setText(agenda.getHora());
        editLocal.setText(agenda.getLocal());

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaController.dadosSpinner());

        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);

        spinner.setAdapter(adapter);

        btnbuton_Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTituloDoCompromisso.setText("");
                editdata.setText("");
                editHora.setText("");
                editLocal.setText("");
            }
        });

        btnbuton_Finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, " Concluido ", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        btnbuton_Salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                outraAgenda.setTitulo(editTituloDoCompromisso.getText().toString());
                outraAgenda.setData(editdata.getText().toString());
                outraAgenda.setHora(editHora.getText().toString());
                outraAgenda.setLocal(editLocal.getText().toString());

                Toast.makeText(MainActivity.this, " Salvo ", Toast.LENGTH_SHORT).show();

            }
        });

        Log.i("ProgramacaoPOO", outraAgenda.toString());
    }
}