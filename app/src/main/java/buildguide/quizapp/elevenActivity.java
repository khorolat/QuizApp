package buildguide.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class elevenActivity extends AppCompatActivity {
    Button butlow,butsolo,butloud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleven);

        butlow = (Button)findViewById(R.id.butlow);
        butsolo = (Button)findViewById(R.id.butsolo);
        butloud = (Button)findViewById(R.id.butloud);

        butlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(elevenActivity.this,twelveActivity.class);
                startActivity(intent);

            }
        });

        butsolo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(elevenActivity.this,twelveActivity.class);
                startActivity(intent);

            }
        });

        butloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(elevenActivity.this,twelveActivity.class);
                startActivity(intent);

                fourthActivity.score=fourthActivity.score+1;
            }
        });

    }
}

