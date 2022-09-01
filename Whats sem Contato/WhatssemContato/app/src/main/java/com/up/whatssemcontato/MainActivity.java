package com.up.whatssemcontato;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout idNumero;
    private TextInputLayout idMensagem;


    private TextInputEditText numero;
    private TextInputEditText mensagem;


    private Button btnEnviar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        idNumero = findViewById(R.id.idNumero);
        idMensagem = findViewById(R.id.idMensagem);


        numero = findViewById(R.id.numero);
        mensagem = findViewById(R.id.mensagem);


              btnEnviar = findViewById(R.id.btnEnviar);

              btnEnviar.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                        openWebPage();
                  }

              });
    }
        public void openWebPage () {

            String num = numero.getText().toString();
            String men = mensagem.getText().toString();

            Uri webpage = Uri.parse("https://wa.me/"+num+"?text="+men);
            Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                            startActivity(intent);


                  }

    }