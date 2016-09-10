package com.bradnicolle.erready;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bradnicolle.erready.workflow.Workflow;

public class SignUpActivity extends AppCompatActivity {
    private Workflow workflow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        workflow = Workflow.get();
    }
}
