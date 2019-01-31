package com.londonappbrewery.magiceightball;

import android.net.sip.SipAudioCall;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button ask_button = findViewById(R.id.ask_button);
        final ImageView ball = findViewById(R.id.image_eightBall);

        final int[] ball_array = {R.drawable.ball1
                , R.drawable.ball2
                , R.drawable.ball3
                , R.drawable.ball4
                , R.drawable.ball5
        } ;

        ask_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Ball_game", "botão apertado!");

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(5);

                Log.d("Ball_game", "número randomico=" + number);

                ball.setImageResource(ball_array[number]);

            }
        });

    }
}
