package buildguide.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class fifteenActivity extends AppCompatActivity {
    Button butitaly,butholand,butspain;
    public static int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifteen);

        butitaly = (Button)findViewById(R.id.butitaly);
        butholand = (Button)findViewById(R.id.butholand);
        butspain = (Button)findViewById(R.id.butspain);

        butitaly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(fifteenActivity.this,sixteenActivity.class);
                startActivity(intent);
                fourthActivity.score=fourthActivity.score+1;

            }
        });

        butholand.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(fifteenActivity.this,sixteenActivity.class);
                startActivity(intent);

            }
        });

        butspain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(fifteenActivity.this,sixteenActivity.class);
                startActivity(intent);
            }
        });

    }
}

