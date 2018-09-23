package lk.my.sliit.method_gaming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button Play;
    private Button settings;
    private Button help;
    private Button score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        settings = (Button) findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openSettings();
            }
        });

        help = (Button) findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openhelp();
            }
        });

        score = (Button) findViewById(R.id.score);
        score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openscore();
            }
        });

        Play = (Button) findViewById(R.id.play);
        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openplay();
            }
        });

    }

    public void openSettings() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    public void openhelp() {
        Intent intent = new Intent(this, help.class);
        startActivity(intent);
    }

    public void openscore() {
        Intent intent = new Intent(this, Score_Activity.class);
        startActivity(intent);
    }
    public void openplay() {
        Intent intent = new Intent(this, Lvls.class);
        startActivity(intent);
    }
}


