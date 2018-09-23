package lk.my.sliit.method_gaming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Score_Activity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_);

        button = (Button)findViewById(R.id.back3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });


    }

    public void openHome() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}