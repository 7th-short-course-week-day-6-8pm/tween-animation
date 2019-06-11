package com.rathana.tween_animation;

import android.support.annotation.AnimRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener
{

    ImageView imageView;
    Button btnFadeIn,btnFadeOut,btnRotate,btnZoomIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.imageView);
        btnFadeIn=findViewById(R.id.btnFadeIn);
        btnFadeOut=findViewById(R.id.btnFadeOut);
        btnRotate=findViewById(R.id.btnRotate);
        btnZoomIn=findViewById(R.id.btnZoomIn);

        btnFadeIn.setOnClickListener(this);
        btnFadeOut.setOnClickListener(this);
        btnRotate.setOnClickListener(this);

        btnZoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim=AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.zoom_in_anim
                );
                imageView.startAnimation(anim);
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnFadeIn:
                doAnimation(imageView,R.anim.fade_in);
                break;

            case R.id.btnFadeOut:
                doAnimation(imageView,R.anim.fade_out);
                break;
            case R.id.btnRotate:
                doAnimation(imageView,R.anim.rotate_anim);
        }
    }

    private void doAnimation(View view, @AnimRes int animId){
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),
                //R.anim.fade_in
                animId);
        view.startAnimation(anim);
    }
}
