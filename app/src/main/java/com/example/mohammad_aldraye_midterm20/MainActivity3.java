package com.example.mohammad_aldraye_midterm20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.media.MediaPlayer;
import android.widget.Button;
import android.widget.GridLayout.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Integer[] Animals = {R.drawable.jir1, R.drawable.lioness5, R.drawable.lynx7, R.drawable.monkey10, R.drawable.wolf3};

    ImageView pic;
    MediaPlayer mpAudio1, mpAudio2, mpAudio3, mpAudio4, mpAudio5, mpAudio6;
    int playing;
    Button actjump;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("You are in Activity 3");
        GridView grid = (GridView) findViewById(R.id.gridView);
        final ImageView pic = (ImageView) findViewById(R.id.imgLarge);
        actjump = (Button) findViewById(R.id.actjump);
        actjump.setOnClickListener(actjumpp);
        mpAudio1 = new MediaPlayer();
        mpAudio1 = MediaPlayer.create(this, R.raw.track1);
        mpAudio2 = new MediaPlayer();
        mpAudio2 = MediaPlayer.create(this, R.raw.track2);
        mpAudio3 = new MediaPlayer();
        mpAudio3 = MediaPlayer.create(this, R.raw.track3);
        mpAudio4 = new MediaPlayer();
        mpAudio4 = MediaPlayer.create(this, R.raw.track4);
        mpAudio5 = new MediaPlayer();
        mpAudio5 = MediaPlayer.create(this, R.raw.track5);
        mpAudio6 = new MediaPlayer();
        mpAudio6 = MediaPlayer.create(this, R.raw.track6);
        playing = 0;
        grid.setAdapter(new ImageAdapter(this));
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Selected audio " + (position + 1), Toast.LENGTH_SHORT).show();
                pic.setImageResource(Animals[position]);
                switch (position) {
                    case 0:

                        mpAudio1.start();  // This will make  sound
                        break;
                    case 1:
                        mpAudio1.pause();
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://artic.edu")));
                        break;
                    case 2:
                        mpAudio1.pause();
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com/")));
                        break;
                    case 3:
                        mpAudio1.pause();
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/")));
                        break;
                    case 4:
                        mpAudio1.pause();
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/")));
                        break;


                }

            }
        });
    }

    public class ImageAdapter extends BaseAdapter {
        private Context context;

        public ImageAdapter(Context c) {
            context = c;
        }

        @Override
        public int getCount() {
            return Animals.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            pic = new ImageView(context);
            pic.setImageResource(Animals[position]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new GridView.LayoutParams(330, 300));
            return pic;
        }

        Button.OnClickListener actjumpp = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity3.this, MainActivity2.class));
            }
        };
    }
}