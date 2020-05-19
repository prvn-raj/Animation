package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Boolean status=true;

    public void onClick(View view){
        ImageView tom = findViewById(R.id.tomView);
        ImageView jerry = findViewById(R.id.jerryView);

        if (status){
            status=false;
            tom.animate().rotation(1800).scaleX(0).scaleY(0).alpha(0).setDuration(2000);
            jerry.animate().scaleX(1).scaleY(1).rotation(1800).alpha(1).setDuration (3000);

        }
        else {
            status = true;
            jerry.animate().scaleX(0).scaleY(0).rotation(-1800).alpha(0).setDuration (2000);
            tom.animate().scaleX(1).scaleY(1).rotation(-1800).alpha(1).setDuration(3000);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView tom = findViewById(R.id.tomView);
        tom.setX(1000);
        tom.animate().rotation(3600).translationXBy(-1000).setDuration(2000);

    }
}
