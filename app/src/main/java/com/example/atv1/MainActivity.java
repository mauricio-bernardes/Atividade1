package com.example.atv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botao = (Button) findViewById(R.id.btSplash);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abreLogin(v);
            }
        });
    }
        public void abreLogin (View view){
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);
    }
}