package com.example.practicalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rect = findViewById(R.id.rect_btn);
        Button circle = findViewById(R.id.square_btn);
        Button sqr = findViewById(R.id.circle_btn);

        rect.setOnClickListener(this);
        circle.setOnClickListener(this);
        sqr.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rect_btn:
                intent = new Intent(MainActivity.this,AreaRectangle.class);
                startActivity(intent);
                break;
            case R.id.circle_btn:
                intent = new Intent(MainActivity.this,AreaCircle.class);
                startActivity(intent);
                break;
            case R.id.square_btn:
                intent = new Intent(MainActivity.this,AreaSquare.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}