package com.animations.maroof.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;

import com.animations.maroof.R;
import com.plattysoft.leonids.ParticleSystem;

/**
 * Created by Maroof Ahmed Siddique on 2/4/2017.
 */
public class FireworksActivity extends AppCompatActivity {

    private Button mClick;
    private Activity ct = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fireworks);

        ct = this;
        mClick = (Button) findViewById(R.id.click_here);

        mClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ParticleSystem one = new ParticleSystem(ct, 100, R.drawable.heart_one, 800);
                one.setScaleRange(0.7f, 1.3f);
                one.setSpeedRange(0.1f, 0.25f);
                one.setRotationSpeedRange(90, 180);
                one.setFadeOut(200, new AccelerateInterpolator());
                one.oneShot(v, 70);

                ParticleSystem two = new ParticleSystem(ct, 100, R.drawable.heart_three, 800);
                two.setScaleRange(0.7f, 1.3f);
                two.setSpeedRange(0.1f, 0.25f);
                one.setRotationSpeedRange(90, 180);
                two.setFadeOut(200, new AccelerateInterpolator());
                two.oneShot(v, 70);
            }
        });

    }
}
