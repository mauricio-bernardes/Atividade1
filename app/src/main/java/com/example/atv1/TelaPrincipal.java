package com.example.atv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        Button voltaLogin = (Button) findViewById(R.id.btVoltaLogin);
        voltaLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VoltaLogin(v);
            }
        });

        Button voltaSS = (Button) findViewById(R.id.btVoltaSS);
        voltaSS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VoltaSS(v);
            }
        });
    }
    public void VoltaLogin (View view){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
    public void VoltaSS (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}