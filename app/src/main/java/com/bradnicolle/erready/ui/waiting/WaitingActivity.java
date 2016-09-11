package com.bradnicolle.erready.ui.waiting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bradnicolle.erready.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class WaitingActivity extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, WaitingActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.cancel_button)
    public void onCancel() {
        finish();
    }
}
