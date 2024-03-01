package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText val1, val2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val1 = findViewById(R.id.val1);
        val2 = findViewById(R.id.val2);
        result = findViewById(R.id.tvHasil);
        Button buttonAddition = findViewById(R.id.buttonAddition);
        Button buttonMultiplication = findViewById(R.id.buttonMultiplication);
        Button buttonDivision = findViewById(R.id.buttonDivision);
        Button buttonSubtraction = findViewById(R.id.buttonSubtraction);

        buttonAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value1 = Integer.parseInt(val1.getText().toString());
                int value2 = Integer.parseInt(val2.getText().toString());
                int hasil = value1 + value2;
                result.setText(String.valueOf(hasil));
            }
        });

        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value1 = Integer.parseInt(val1.getText().toString());
                int value2 = Integer.parseInt(val2.getText().toString());
                int hasil = value1 * value2;
                result.setText(String.valueOf(hasil));
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value1 = Integer.parseInt(val1.getText().toString());
                int value2 = Integer.parseInt(val2.getText().toString());
                if (value2 != 0) {
                    int hasil = value1 / value2;
                    result.setText(String.valueOf(hasil));
                } else {
                    result.setText("Error: Division by zero");
                }
            }
        });

        buttonSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value1 = Integer.parseInt(val1.getText().toString());
                int value2 = Integer.parseInt(val2.getText().toString());
                int hasil = value1 - value2;
                result.setText(String.valueOf(hasil));
            }
        });
    }
}
