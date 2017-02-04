package com.animations.maroof.activities;

import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.animation.AccelerateInterpolator;

import com.animations.maroof.R;
import com.plattysoft.leonids.ParticleSystem;

/**
 * Created by Maroof Ahmed Siddique on 2/4/2017.
 */
public class FollowCursorActivity extends AppCompatActivity {

    private ParticleSystem ps;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                // Create a particle system and start emiting
                ps = new ParticleSystem(this, 100, R.drawable.heart_two, 800);
                ps.setScaleRange(0.7f, 1.3f);
                ps.setSpeedRange(0.05f, 0.1f);
                ps.setRotationSpeedRange(90, 180);
                ps.setFadeOut(200, new AccelerateInterpolator());
                ps.emit((int) event.getX(), (int) event.getY(), 40);
                break;
            case MotionEvent.ACTION_MOVE:
                ps.updateEmitPoint((int) event.getX(), (int) event.getY());
                break;
            case MotionEvent.ACTION_UP:
                ps.stopEmitting();
                break;
        }
        return true;
    }
}
