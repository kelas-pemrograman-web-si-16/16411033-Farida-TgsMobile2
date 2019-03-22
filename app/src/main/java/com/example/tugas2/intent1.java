package com.example.tugas2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class intent1 extends AppCompatActivity {

    EditText edtNpm, edtNama;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent1);

        edtNpm = (EditText) findViewById(R.id.edtNpm);
        edtNama = (EditText) findViewById(R.id.edtNama);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nama = edtNama.getText().toString();
                String npm = edtNpm.getText().toString();
                Intent a = null;

                if (nama.equals("FARIDA")  && npm.equals("16411033")){
                    a = new Intent(intent1.this, intent2.class);
                    a.putExtra("nama", edtNama.getText().toString());
                    a.putExtra("npm", edtNpm.getText().toString());
                    startActivity(a);
                }else{
                    Toast.makeText(getApplicationContext(), "Maaf Inputan Salah", Toast.LENGTH_LONG).show();
                }


            }
        });
    }
}
