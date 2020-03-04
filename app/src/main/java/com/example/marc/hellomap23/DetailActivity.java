package com.example.marc.hellomap23;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    private ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        String easyPuzzle = intent.getExtras().getString("tipo");

        im = findViewById(R.id.imageView);
        if(easyPuzzle.equals("eps")) {
            im.setImageResource(R.drawable.eps);
        } else if(easyPuzzle.equals("biblio")) {
            im.setImageResource(R.drawable.biblio);
        }else if(easyPuzzle.equals("fde")) {
            im.setImageResource(R.drawable.fde);
        }else {
            im.setImageResource(R.drawable.fepts);
        }
    }
}
