package com.example.pc01.proyecto1;

import android.content.Context;
import android.content.Intent;
import android.sax.StartElementListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btnSuma)
    Button btnSuma;
    @Bind(R.id.btnResta)
    Button btnResta;
    @Bind(R.id.btnMultiplicaicon)
    Button btnMultiplicaicon;
    @Bind(R.id.btnDivision)
    Button btnDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suma=new Intent(MainActivity.this,clsSuma.class);
                startActivity(suma);
            }
        });


        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suma=new Intent(MainActivity.this,clsResta.class);
                startActivity(suma);
            }
        });


        btnMultiplicaicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suma=new Intent(MainActivity.this,clsMultiplicacion.class);
                startActivity(suma);
            }
        });


        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suma=new Intent(MainActivity.this,clsDivision.class);
                startActivity(suma);
            }
        });

    }






}
