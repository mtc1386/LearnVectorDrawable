package com.cuizicheng.exercise.learnvectordrawable;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private DemoVectorDrawableImageView mVectorImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        mButton = (Button) findViewById(R.id.btn);
        mVectorImageView = (DemoVectorDrawableImageView) findViewById(R.id.vector_img);


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mVectorImageView.toggle();
            }
        });
    }
}
