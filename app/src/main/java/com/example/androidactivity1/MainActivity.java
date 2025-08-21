package com.example.androidactivity1;

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

        // Configurar botones de navegación
        Button btnTextViews = findViewById(R.id.btnTextViews);
        Button btnButtons = findViewById(R.id.btnButtons);
        Button btnWidgets = findViewById(R.id.btnWidgets);
        Button btnImages = findViewById(R.id.btnImages);

        btnTextViews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.androidactivity1.TextActivity.class);
                startActivity(intent);
            }
        });

        btnButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ButtonActivity.class);
                startActivity(intent);
            }
        });

        btnWidgets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.androidactivity1.WidgetsActivity.class);
                startActivity(intent);
            }
        });

        btnImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImageActivity.class);
                startActivity(intent);
            }
        });
    }
}