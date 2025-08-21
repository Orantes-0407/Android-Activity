package com.example.androidactivity1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import com.example.androidactivity1.MainActivity;

public class WidgetsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets2);

        Button btnBack = findViewById(R.id.btnBack);
        CheckBox checkBox = findViewById(R.id.checkBox);
        Switch switchWidget = findViewById(R.id.switchWidget);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WidgetsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String message = isChecked ? "CheckBox seleccionado" : "CheckBox deseleccionado";
                Toast.makeText(WidgetsActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });

        switchWidget.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String message = isChecked ? "Switch activado" : "Switch desactivado";
                Toast.makeText(WidgetsActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);
                if (radioButton != null) {
                    Toast.makeText(WidgetsActivity.this, "Opción: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}