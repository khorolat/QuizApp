package buildguide.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class eighteenActivity extends AppCompatActivity {
    Button butbangladesh,butrussia,butcameroon;
    public static int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighteen);

        butbangladesh = (Button)findViewById(R.id.butbangladesh);
        butrussia = (Button)findViewById(R.id.butrussia);
        butcameroon = (Button)findViewById(R.id.butCameroon);

        butbangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(eighteenActivity.this,twentyActivity.class);
                startActivity(intent);

            }
        });

        butrussia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(eighteenActivity.this,twentyActivity.class);
                startActivity(intent);
                fourthActivity.score=fourthActivity.score+1;


            }
        });

        butcameroon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(eighteenActivity.this,twentyActivity.class);
                startActivity(intent);
            }
        });

    }
}