package groupapp.cs.psu.slidingpuzzle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MathModeSelectActivity extends AppCompatActivity {

    public Button button1, button2, button3;

    /**
     * This method allow the user to select single player or multiplayer for math mode
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_mode_select);

        button1 = (Button) findViewById(R.id.singleplayerbutton);
        button2 = (Button) findViewById(R.id.multiplayerbutton);
        button3 = (Button) findViewById(R.id.highscorebutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open1();
            }
            private void open1() {
                Intent intent = new Intent(MathModeSelectActivity.this, Math1playerActivity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open2();
            }
            private void open2() {
                Intent intent = new Intent(MathModeSelectActivity.this, Math2playersActivity.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open3();
            }
            private void open3() {
                Intent intent = new Intent(MathModeSelectActivity.this, HighScoreActivity.class);
                startActivity(intent);
            }
        });
    }
}