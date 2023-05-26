package com.example.app_lista.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_lista.R;
import com.example.app_lista.model.Agenda;

public class MainActivity extends AppCompatActivity {

    Agenda agenda;
    Agenda outraAgenda;

    String dadosCompras;
    String dadosOutraCompra;

    EditText editTituloDoCompromisso;
    EditText editdata;
    EditText editHora;
    EditText editLocal;

    Button btnbuton_Limpar;
    Button btnbuton_Salvar;
    Button btnbuton_Finalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        agenda = new Agenda();
        agenda.setTitulo("Estudar");
        agenda.setData("26/07/2012");
        agenda.setHora("12:33");
        agenda.setLocal("Escola");


        outraAgenda = new Agenda();
        outraAgenda.setTitulo("Ir trabalhar");
        outraAgenda.setData("12/08/2023");
        outraAgenda.setHora("07:00");
        outraAgenda.setLocal("Trabalho");


        editTituloDoCompromisso = findViewById(R.id.text_TituloDoCompromisso);
        editdata = findViewById(R.id.text_Data);
        editHora = findViewById(R.id.text_Hora);
        editLocal = findViewById(R.id.text_Local);


        btnbuton_Limpar = findViewById(R.id.button_Limpar);
        btnbuton_Salvar = findViewById(R.id.button_Salvar);
        btnbuton_Finalizar = findViewById(R.id.button_Finalizar);

        editTituloDoCompromisso.setText(agenda.getTitulo());
        editdata.setText(agenda.getData());
        editHora.setText(agenda.getHora());
        editLocal.setText(agenda.getLocal());


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

        Log.i("ProgramacaoPOO", agenda.toString());
        Log.i("ProgramacaoPOO", outraAgenda.toString());















    }
}