package io.github.rajendrarajaram.dateformatexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Calendar;

import io.github.rajendrarajaram.zero.DateTextView;
import io.github.rajendrarajaram.zero.TimeTextView;

public class MainActivity extends AppCompatActivity {
    TimeTextView timeTextView;
    DateTextView dateTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        timeTextView = findViewById(R.id.show_time);
        dateTextView  = findViewById(R.id.show_date);
      timeTextView.setDate("2010-05-30 22:15:52");
       dateTextView.setDate("2010-05-30 22:15:52");

    }
}
