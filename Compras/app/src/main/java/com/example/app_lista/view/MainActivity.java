package com.example.app_lista.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_lista.R;
import com.example.app_lista.model.Compras;

public class MainActivity extends AppCompatActivity {

    Compras compras;
    Compras outraCompras;

    String dadosCompras;
    String dadosOutraCompra;

    EditText editNomeProduto;
    EditText editQuantidade;
    EditText editLocal;

    Button btnbuton_Limpar;
    Button btnbuton_Salvar;
    Button btnbuton_Finalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compras = new Compras();
        compras.setNome("Pão");
        compras.setQuantidae("10");
        compras.setLocal("Padaria");


        outraCompras = new Compras();
        outraCompras.setNome("Maça");
        outraCompras.setQuantidae("4");
        outraCompras.setLocal("Super Mercado");


        editNomeProduto = findViewById(R.id.text_NomeProduto);
        editQuantidade = findViewById(R.id.text_Quantidade);
        editLocal = findViewById(R.id.text_Local);


        btnbuton_Limpar = findViewById(R.id.button_Limpar);
        btnbuton_Salvar = findViewById(R.id.button_Salvar);
        btnbuton_Finalizar = findViewById(R.id.button_Finalizar);

        editNomeProduto.setText(compras.getNome());
        editQuantidade.setText(compras.getQuantidae());
        editLocal.setText(compras.getLocal());


        btnbuton_Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
/*
        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getNome();
        dadosPessoa += "Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += "Nome do curso: ";
        dadosPessoa += pessoa.getNomeCurso();
        dadosPessoa += "Telefone: ";
        dadosPessoa += pessoa.getTelefone();*/

        /*dadosOutaPessoa = "Primeiro nome: ";
        dadosOutaPessoa += outraPessoa.getNome();
        dadosOutaPessoa += "Sobrenome: ";
        dadosOutaPessoa += outraPessoa.getNome();
        dadosOutaPessoa += "Nome do curso: ";
        dadosOutaPessoa += outraPessoa.getNomeCurso();
        dadosOutaPessoa += "Telefone: ";
        dadosOutaPessoa += outraPessoa.getTelefone();*/

        Log.i("ProgramacaoPOO", compras.toString());
        Log.i("ProgramacaoPOO", outraCompras.toString());



    }
}