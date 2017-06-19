package buildguide.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class seventeenActivity extends AppCompatActivity {
    Button butasia2,buteurope2,butafrica2;
    public static int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventeen);

        butasia2 = (Button)findViewById(R.id.butasia2);
        buteurope2 = (Button)findViewById(R.id.buteurope2);
        butafrica2 = (Button)findViewById(R.id.butafrica2);

        butasia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(seventeenActivity.this,eighteenActivity.class);
                startActivity(intent);

            }
        });

        buteurope2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(seventeenActivity.this,eighteenActivity.class);
                startActivity(intent);

            }
        });

        butafrica2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(seventeenActivity.this,eighteenActivity.class);
                startActivity(intent);
                fourthActivity.score=fourthActivity.score+1;
            }
        });

    }
}
