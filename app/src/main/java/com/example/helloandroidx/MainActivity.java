package com.example.helloandroidx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);
        //updateTime();
        button.setText("Bienvenido a tu primera App");
    }

    @Override
    public void onClick(View v) {
        //updateTime();

    }

    private void updateTime() {
        button.setText(new Date().toString());
    }
}
