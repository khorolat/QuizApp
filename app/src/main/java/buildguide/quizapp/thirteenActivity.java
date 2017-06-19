package buildguide.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class thirteenActivity extends AppCompatActivity {
    Button buted,butadele,butbruno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteen);

        buted = (Button)findViewById(R.id.buted);
        butadele = (Button)findViewById(R.id.butadele);
        butbruno = (Button)findViewById(R.id.butbruno);

        buted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(thirteenActivity.this,twentyoneActivity.class);
                startActivity(intent);

                fourthActivity.score=fourthActivity.score+1;

            }
        });

        butadele.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(thirteenActivity.this,twentyoneActivity.class);
                startActivity(intent);

            }
        });

        butbruno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(thirteenActivity.this,twentyoneActivity.class);
                startActivity(intent);
            }
        });

    }
}
