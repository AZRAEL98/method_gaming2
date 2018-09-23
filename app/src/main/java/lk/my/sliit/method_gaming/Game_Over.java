package lk.my.sliit.method_gaming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Game_Over extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game__over);

        button = (Button) findViewById(R.id.Rmenu);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMenu();
            }
        });

    }

    public void openMenu() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}