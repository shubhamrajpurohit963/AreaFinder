package com.example.practicalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaSquare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_square);

        EditText input = findViewById(R.id.input_square);
        Button btn = findViewById(R.id.square_find_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input1 = input.getText().toString();
                int len = Integer.parseInt(input1);

                int result = 0;
                result = len * len ;

                TextView result_rect = findViewById(R.id.square_result);
                result_rect.setText(String.valueOf(result));
            }
        });

    }
}