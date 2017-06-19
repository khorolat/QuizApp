package buildguide.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class thirdActivity extends AppCompatActivity {
    Button butofficial,butoriginal,butoperating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        butofficial = (Button)findViewById(R.id.butofficial);
        butoriginal = (Button)findViewById(R.id.butoriginal);
        butoperating = (Button)findViewById(R.id.butoperating);

        butofficial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(thirdActivity.this,ninteenActivity.class);
                startActivity(intent);

            }
        });

        butoriginal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(thirdActivity.this,ninteenActivity.class);
                startActivity(intent);

            }
        });

        butoperating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(thirdActivity.this,ninteenActivity.class);
                startActivity(intent);

                fourthActivity.score=fourthActivity.score+1;
            }
        });

    }
}
