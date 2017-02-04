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
public class EmitterBackgroundActivity extends AppCompatActivity {

    private Button mClick;
    private Activity ct = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emitter_advanced);

        ct = this;
        mClick = (Button) findViewById(R.id.click_here);

        mClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new ParticleSystem(ct, 25, R.drawable.snowflake, 1000)
                        .setSpeedRange(0.1f, 0.25f)
                        .emit(v, 100);
            }
        });
    }
}
