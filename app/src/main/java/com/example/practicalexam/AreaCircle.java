package com.example.practicalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaCircle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_circle);

        EditText input = findViewById(R.id.input_circle);
        Button btn = findViewById(R.id.circle_find_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String l = input.getText().toString();
                int radius = Integer.parseInt(l);

                int result = 0;
                result = (int) ((3.14159265358)*(radius*radius));

                TextView result_rect = findViewById(R.id.result_circle);
                result_rect.setText(String.valueOf(result));
            }
        });


    }
}