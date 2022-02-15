package com.nk.circularprogressbartemp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private TextView progressBarTextView;
    private Button decrBtn, incrBtn;

    private int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setReferences();

        updateProgressBar();

        incrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (progress < 100){
                    progress += 10;
                    updateProgressBar();
                }
            }
        });

        decrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (progress > 0){
                    progress -= 10;
                    updateProgressBar();
                }
            }
        });
    }

    private void setReferences(){
        progressBar = findViewById(R.id.progress_bar);
        progressBarTextView = findViewById(R.id.progress_bar_text_view);
        decrBtn = findViewById(R.id.decr_btn);
        incrBtn = findViewById(R.id.incr_btn);
    }

    private void updateProgressBar(){
        progressBar.setProgress(progress);
        progressBarTextView.setText(progress + "%");
    }
}