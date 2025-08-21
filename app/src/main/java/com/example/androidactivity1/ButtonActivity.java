package com.example.androidactivity1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.androidactivity1.R;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttton);

        Button btnBack = findViewById(R.id.btnBack);
        Button basicButton = findViewById(R.id.basicButton);
        Button styledButton = findViewById(R.id.styledButton);
        ToggleButton toggleButton = findViewById(R.id.toggleButton);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ButtonActivity.this, com.example.androidactivity1.MainActivity.class);
                startActivity(intent);
            }
        });

        basicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "Botón básico pulsado", Toast.LENGTH_SHORT).show();
            }
        });

        styledButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "Botón con estilo pulsado", Toast.LENGTH_SHORT).show();
            }
        });

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton) v).isChecked()) {
                    Toast.makeText(ButtonActivity.this, "Toggle activado", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ButtonActivity.this, "Toggle desactivado", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}