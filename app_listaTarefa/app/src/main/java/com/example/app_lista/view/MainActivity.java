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
import com.example.app_lista.controller.ListaController;
import com.example.app_lista.controller.TarefaController;
import com.example.app_lista.model.Lista;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Lista lista;
    Lista outraLista;

    List<String> nomeDaTarefa;

    ListaController controller;
    TarefaController tarefaController;

    EditText editNome;
    EditText editDescricao;
    EditText editData;

    Button btnbuton_Limpar;
    Button btnbuton_Salvar;
    Button btnbuton_Finalizar;

    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tarefaController = new TarefaController();

        nomeDaTarefa = tarefaController.dadosSpinner();

        tarefaController.getListTarefa();

        controller = new ListaController(MainActivity.this);
        controller.toString();

        outraLista = new Lista();
        controller.buscar(outraLista);

        editNome = findViewById(R.id.text_Nome);
        editDescricao = findViewById(R.id.text_Descricao);
        editData = findViewById(R.id.text_Data);

        spinner = findViewById(R.id.ListaSpinner);

        btnbuton_Limpar = findViewById(R.id.button_Limpar);
        btnbuton_Salvar = findViewById(R.id.button_Salvar);
        btnbuton_Finalizar = findViewById(R.id.button_Finalizar);

        editNome.setText(lista.getNome());
        editDescricao.setText(lista.getDescricao());
        editData.setText(lista.getData());

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tarefaController.dadosSpinner());

        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);

        spinner.setAdapter(adapter);


        btnbuton_Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, " Limpo ", Toast.LENGTH_SHORT).show();
                editNome.setText("");
                editDescricao.setText("");
                editData.setText("");

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

                outraLista.setNome(editNome.getText().toString());
                outraLista.setDescricao(editDescricao.getText().toString());
                outraLista.setData(editData.getText().toString());

                controller.salvar(outraLista);

                Toast.makeText(MainActivity.this, " Salvo ", Toast.LENGTH_SHORT).show();
            }
        });

        Log.i("ProgramacaoPOO", outraLista.toString());

    }
}