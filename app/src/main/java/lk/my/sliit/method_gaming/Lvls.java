package lk.my.sliit.method_gaming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lvls extends AppCompatActivity {

    private Button lvlone;
    private Button lvltwoo;
    private Button lvlthre;
    private Button lvlfour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvls);

        lvlone = (Button) findViewById(R.id.lvlone);
        lvlone.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        openlvlone();
                    }
                });

            lvltwoo= (Button) findViewById(R.id.lvltwoo);
            lvltwoo.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            openlvltwoo();
                        }
                    });
                lvlthre = (Button) findViewById(R.id.lvlthre);
                lvlthre.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View view) {
                                openlvlthre();
                            }
                        });
                    lvlfour = (Button) findViewById(R.id.lvlfour);
                    lvlfour.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            openlvlfour();
                        }
                    });

    }


                        public void openlvlone() {
                            Intent intent = new Intent(this, lvl_one.class);
                            startActivity(intent);
                        }

                        public void openlvltwoo() {
                            Intent intent = new Intent(this, lvl_two.class);
                            startActivity(intent);
                        }

                        public void openlvlthre() {
                            Intent intent = new Intent(this, lvl_three.class);
                            startActivity(intent);
                        }

                        public void openlvlfour() {
                            Intent intent = new Intent(this, lvl_four.class);
                            startActivity(intent);
                        }
                    }