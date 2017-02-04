package com.animations.maroof.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.animations.maroof.R;
import com.plattysoft.leonids.ParticleSystem;

/**
 * Created by Maroof Ahmed Siddique on 2/4/2017.
 */
public class ConfettiActivity extends AppCompatActivity {

    private Button mClick;
    private Activity ct = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confetti);

        ct = this;
        mClick = (Button) findViewById(R.id.click_here);

        mClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new ParticleSystem(ct, 80, R.drawable.confeti2, 10000)
                        .setSpeedModuleAndAngleRange(0f, 0.1f, 180, 180)
                        .setRotationSpeed(144)
                        .setAcceleration(0.000017f, 90)
                        .emit(findViewById(R.id.emiter_top_right), 8);

                new ParticleSystem(ct, 80, R.drawable.confeti3, 10000)
                        .setSpeedModuleAndAngleRange(0f, 0.1f, 0, 0)
                        .setRotationSpeed(144)
                        .setAcceleration(0.000017f, 90)
                        .emit(findViewById(R.id.emiter_top_left), 8);
            }
        });
    }
}
