package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button move;
    private CricketExpert expert = new CricketExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        move = findViewById(R.id.Move);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Spinner MealSpinner = findViewById(R.id.MealSpinner);
                String selectedMeal = String.valueOf(MealSpinner.getSelectedItem());

                List<String> menuList = expert.getMenu(selectedMeal);

                StringBuilder menuFormatted = new StringBuilder();
                for (String menu : menuList) {
                    menuFormatted.append(menu).append('\n');
                }

                Intent intent = new Intent(MainActivity.this, Second.class);
                intent.putExtra("menu", menuFormatted.toString());
                startActivity(intent);
            }
        });
    }
}
