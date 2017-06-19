package buildguide.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ninthActivity extends AppCompatActivity {
    Button buteurope,butasia,butafrica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);

        buteurope = (Button)findViewById(R.id.buteurope);
        butasia = (Button)findViewById(R.id.butasia);
        butafrica = (Button)findViewById(R.id.butafrica);

        buteurope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ninthActivity.this,fifteenActivity.class);
                startActivity(intent);

            }
        });

        butasia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ninthActivity.this,fifteenActivity.class);
                startActivity(intent);

            }
        });

        butafrica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ninthActivity.this,fifteenActivity.class);
                startActivity(intent);

                fourthActivity.score=fourthActivity.score+1;
            }
        });

    }
}

