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
public class EmitterIntermediateActivity extends AppCompatActivity {

    private Button mClick;
    private Activity ct = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emitter_intermediate);

        ct = this;
        mClick = (Button) findViewById(R.id.click_here);

        mClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ParticleSystem ps = new ParticleSystem(ct, 25, R.drawable.snowman, 1000);
                ps.setScaleRange(0.7f, 1.3f);
                ps.setSpeedModuleAndAngleRange(0.07f, 0.16f, 0, 180);
                ps.setRotationSpeedRange(90, 180);
                ps.setAcceleration(0.00013f, 90);
                ps.setFadeOut(200, new AccelerateInterpolator());
                ps.emit(v, 100);
            }
        });
    }
}
