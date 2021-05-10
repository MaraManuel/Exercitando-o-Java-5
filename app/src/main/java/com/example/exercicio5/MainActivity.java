package com.example.exercicio5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                EditText edt_salario = findViewById(R.id.salario);
                DecimalFormat arredondar = new DecimalFormat("#.##");
                double salario = Double.parseDouble(edt_salario.getText().toString());

                Toast.makeText(MainActivity.this, toString().valueOf(Double.parseDouble(arredondar.format(salario + (salario * 0.05) - (salario * 0.07)))), LENGTH_SHORT).show();


            }
        });
    }
}
