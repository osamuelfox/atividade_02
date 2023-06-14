package com.example.app_lista.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_lista.R;
import com.example.app_lista.model.Lista;

public class MainActivity extends AppCompatActivity {

    Lista lista;
    Lista outraLista;

    EditText editNome;
    EditText editDescricao;
    EditText editData;

    Button btnbuton_Limpar;
    Button btnbuton_Salvar;
    Button btnbuton_Finalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = new Lista();
        lista.setNome("Estudar");
        lista.setDescricao("Estudar Java");
        lista.setData("28/05/2023");

        outraLista = new Lista();
        outraLista.setNome("Fazer Compras");
        outraLista.setDescricao("Comprar arroz");
        outraLista.setData("26/06/2023");

        editNome = findViewById(R.id.text_Nome);
        editDescricao = findViewById(R.id.text_Descricao);
        editData = findViewById(R.id.text_Data);


        btnbuton_Limpar = findViewById(R.id.button_Limpar);
        btnbuton_Salvar = findViewById(R.id.button_Salvar);
        btnbuton_Finalizar = findViewById(R.id.button_Finalizar);

        editNome.setText(lista.getNome());
        editDescricao.setText(lista.getDescricao());
        editData.setText(lista.getData());


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

                Toast.makeText(MainActivity.this, " Salvo ", Toast.LENGTH_SHORT).show();

            }
        });

        Log.i("ProgramacaoPOO", lista.toString());
        Log.i("ProgramacaoPOO", outraLista.toString());

    }
}