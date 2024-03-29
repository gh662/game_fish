package ru.fishgame.fishgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {

    private Button PlayGame;
    private TextView DisplayScore;
    private String score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        score = getIntent().getExtras().get("score").toString();


        PlayGame = (Button) findViewById(R.id.play_btn);

        DisplayScore = (TextView) findViewById(R.id.displayScore);

        PlayGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mainintent = new     Intent(GameOverActivity.this, MainActivity.class);
                startActivity(mainintent);

            }
        });

        DisplayScore.setText("Вы набрали " + score + " очков.");
    }
}
