package com.example.practicalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaRectangle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_rectangle);

        EditText length = findViewById(R.id.input1_rectangle);
        EditText breadth = findViewById(R.id.input2_rectangle);
        Button btn = findViewById(R.id.rectangle_find_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String l = length.getText().toString();
                int len = Integer.parseInt(l);
                String b = breadth.getText().toString();
                int bre = Integer.parseInt(l);

                int result = 0;
                result = len * bre;

                TextView result_rect = findViewById(R.id.result_rect);
                result_rect.setText(String.valueOf(result));
            }
        });
    }
}