package br.com.alura.aluraviagens.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;


import java.util.List;

import br.com.alura.aluraviagens.R;
import br.com.alura.aluraviagens.dao.PacoteDAO;
import br.com.alura.aluraviagens.model.Pacote;
import br.com.alura.aluraviagens.ui.adapter.ListaPacotesAdapater;

public class ListaPacotesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacotes);
        // pegando referencia da listview
        ListView listDePacotes = findViewById(R.id.lista_pacotes_listview);
        // instancia da PacoteDAO que retorna uma lista de pacotes
        List<Pacote> pacotes = new PacoteDAO().lista();
        //setando o apadater
        listDePacotes.setAdapter(new ListaPacotesAdapater(pacotes, this));
    }
}