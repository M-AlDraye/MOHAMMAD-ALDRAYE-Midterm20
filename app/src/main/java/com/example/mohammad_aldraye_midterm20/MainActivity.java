package com.example.mohammad_aldraye_midterm20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    MediaPlayer player;
    ImageButton music;
    Button actjump;
 ;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("You are in Activity 1");
        playing = 0;
        music = (ImageButton) findViewById(R.id.music);
        actjump = (Button) findViewById(R.id.actjump);
        music.setOnClickListener(wolfmusic);
        actjump.setOnClickListener(actjumpp);
        player = new MediaPlayer();
        player = MediaPlayer.create(this, R.raw.track1);
    }

    ImageButton.OnClickListener wolfmusic = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (playing) {

                case 0:
                    player.start();
                    playing = 1;
                    break;
                case 1:
                    player.pause();
                    playing = 0;
                    break;
            }
        }
    };

    Button.OnClickListener actjumpp = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(MainActivity.this, MainActivity2.class));
        }
    };
}




