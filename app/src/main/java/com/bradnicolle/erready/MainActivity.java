package com.bradnicolle.erready;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bradnicolle.erready.ui.emergency.EmergencyActivity;
import com.bradnicolle.erready.ui.signup.SignUpActivity;

/**
 * Simple Activity with no content which decides which initial Activity to present based on Sign-in status
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(EmergencyActivity.newIntent(this));
        finish();
    }
}
