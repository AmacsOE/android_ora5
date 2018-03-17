package com.example.amacs.android_ora5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final News mynews = new News(
                "ez egy teszt cím",
                "Ez pedig egy teszt tartalom"
        );


        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, DetailsActivity.class);
                myIntent.putExtra("news", mynews);
                startActivity(myIntent);

            }
        });
    }
}
