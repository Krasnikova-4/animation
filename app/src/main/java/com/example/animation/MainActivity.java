package com.example.animation;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ImageView ImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView imageView4 = findViewById(R.id.imageView4);
        Animation animation4 = AnimationUtils.loadAnimation(this, R.anim.rotate);
        imageView4.startAnimation(animation4);


        ImageView imageView3 = findViewById(R.id.imageView3);
        Animation animation3 = AnimationUtils.loadAnimation(this, R.anim.translate);
        imageView3.startAnimation(animation3);

        ImageView imageView2 = findViewById(R.id.imageView2);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.scale);
        imageView2.startAnimation(animation2);


        ImageView imageView = findViewById(R.id.imageView);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
        imageView.startAnimation(animation);




    }






}