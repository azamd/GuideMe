package com.esprit.guideme.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.esprit.guideme.R;
import com.esprit.guideme.services.signupService;

public class MainActivity extends AppCompatActivity {

    Animation zoom;
    ImageView img;
    signupService signupService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        img = findViewById(R.id.logo);
        img.startAnimation(zoom);
        signupService = new signupService(this);
        Handler h = new Handler();
        h.postDelayed(() -> {
            if(this.signupService.isLoggedIn().equals("true")){
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i);
                finish();
                return;
            }
            Intent i = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(i);
            finish();
        },4000);
    }
}