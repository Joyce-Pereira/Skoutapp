package br.com.etecia.skoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declarar variaveis globais que irão representar os objetos xml
    EditText edtsenha, edtusuario;
    Button b1, b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //apresentar ao java os componentes do xml
        edtsenha = findViewById(R.id.edtsenha);
        edtusuario = findViewById(R.id.edtusuario);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        //
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //criando as variaveis
                String usuario, senha;
                //atribuindo valores sa variaveis
                usuario = edtusuario.getText().toString();
                senha = edtsenha.getText().toString();

                //validando usuario e senha
                if ( usuario.equals("etecia") && senha.equals("etecia")){
                    //abrir janela de menu
                    startActivity(new Intent(getApplicationContext(),
                            MenuPrincipalActivity.class));
                    finish();

                } else {
                    Toast.makeText(getApplicationContext(),
                            "Usuário ou senha invalidos!!!",
                            Toast.LENGTH_SHORT).show();
                    edtusuario.setText("");
                    edtsenha.setText("");
                    edtusuario.requestFocus();
                }

            }
        });


    }
}