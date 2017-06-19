package buildguide.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class sixteenActivity extends AppCompatActivity {
    Button butnigeria,butspain2,butusa;
    public static int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixteen);

        butnigeria = (Button)findViewById(R.id.butnigeria);
        butspain2 = (Button)findViewById(R.id.butspain2);
        butusa = (Button)findViewById(R.id.butusa);

        butnigeria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(sixteenActivity.this,seventeenActivity.class);
                startActivity(intent);

            }
        });

        butspain2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(sixteenActivity.this,seventeenActivity.class);
                startActivity(intent);
                fourthActivity.score=fourthActivity.score+1;

            }
        });

        butusa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(sixteenActivity.this,seventeenActivity.class);
                startActivity(intent);
            }
        });

    }
}