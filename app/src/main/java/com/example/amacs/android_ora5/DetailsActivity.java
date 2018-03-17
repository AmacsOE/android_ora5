package com.example.amacs.android_ora5;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView titleTextView = findViewById(R.id.title);
        TextView contentTextView = findViewById(R.id.content);


        Bundle extras = getIntent().getExtras(); // parméter átadás
        if (extras != null)
        {
            if (extras.containsKey("news"))
            {
                News mynews = extras.getParcelable("news");
                if (mynews!=null) {
                    titleTextView.setText(mynews.getTitle());
                    contentTextView.setText(mynews.getContent());
                }
            }

        }
        } // paraméter átadás vége
}
