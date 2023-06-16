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
import com.example.app_lista.controller.ComprasController;
import com.example.app_lista.controller.ListaController;
import com.example.app_lista.model.Compras;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Compras compras;
    Compras outraCompras;
    List<String> listaCompras;

    ComprasController controller;
    ListaController listaController;

    EditText editNomeProduto;
    EditText editQuantidade;
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

        listaCompras = listaController.dadosSpinner();

        listaController.getListaCompras();

        controller = new ComprasController(MainActivity.this);
        controller.toString();

        outraCompras = new Compras();
        controller.buscar(outraCompras);

        editNomeProduto = findViewById(R.id.text_NomeProduto);
        editQuantidade = findViewById(R.id.text_Quantidade);
        editLocal = findViewById(R.id.text_Local);

        spinner = findViewById(R.id.ListaSpinner);

        btnbuton_Limpar = findViewById(R.id.button_Limpar);
        btnbuton_Salvar = findViewById(R.id.button_Salvar);
        btnbuton_Finalizar = findViewById(R.id.button_Finalizar);

        editNomeProduto.setText(compras.getNome());
        editQuantidade.setText(compras.getQuantidae());
        editLocal.setText(compras.getLocal());

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaController.dadosSpinner());

        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);

        btnbuton_Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, " Limpo ", Toast.LENGTH_SHORT).show();
                editNomeProduto.setText("");
                editQuantidade.setText("");
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

                outraCompras.setNome(editNomeProduto.getText().toString());
                outraCompras.setQuantidae(editQuantidade.getText().toString());
                outraCompras.setLocal(editLocal.getText().toString());

                Toast.makeText(MainActivity.this, " Salvo ", Toast.LENGTH_SHORT).show();

            }
        });

        Log.i("ProgramacaoPOO", outraCompras.toString());
    }
}