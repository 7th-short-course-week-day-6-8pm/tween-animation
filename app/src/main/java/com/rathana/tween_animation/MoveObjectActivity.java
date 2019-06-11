package com.rathana.tween_animation;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MoveObjectActivity extends AppCompatActivity {

    ImageView imageView;
    Button btnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_object);

        imageView=findViewById(R.id.panda);
        btnMove=findViewById(R.id.btnMove);

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation= AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        //R.anim.move_anim
                        R.anim.fade_in_soom_anim
                );
                imageView.startAnimation(animation);
            }
        });

    }
}
