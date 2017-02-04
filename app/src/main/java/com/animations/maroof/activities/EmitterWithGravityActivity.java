package com.animations.maroof.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;

import com.animations.maroof.R;
import com.plattysoft.leonids.ParticleSystem;

/**
 * Created by Maroof Ahmed Siddique on 2/4/2017.
 */
public class EmitterWithGravityActivity extends AppCompatActivity {

    private Button mClick;
    private Activity ct = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emitter_gravity);

        ct = this;
        mClick = (Button) findViewById(R.id.click_here);

        mClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new ParticleSystem(ct, 50, R.drawable.heart_one, 3000)
                        .setAcceleration(0.00013f, 90)
                        .setSpeedByComponentsRange(0f, 0f, 0.05f, 0.1f)
                        .setFadeOut(200, new AccelerateInterpolator())
                        .emitWithGravity(v, Gravity.BOTTOM, 30);
            }
        });

    }
}
