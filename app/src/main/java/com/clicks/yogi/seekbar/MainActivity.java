package com.clicks.yogi.seekbar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SeekBar MySeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MySeekBar = findViewById(R.id.MySeekBarId);

        MySeekBar.setOnSeekBarChangeListener(new SeekBar
                .OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar,int progress,
                                          boolean fromUser){

                Toast.makeText(getApplicationContext(),"Progress: "+progress,
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

        });
    }
}