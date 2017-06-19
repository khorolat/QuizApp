package buildguide.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class seventhActivity extends AppCompatActivity {
    Button butsun,butwater,butmoon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        butsun = (Button)findViewById(R.id.butsun);
        butwater = (Button)findViewById(R.id.butwater);
        butmoon = (Button)findViewById(R.id.butmoon);

        butsun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(seventhActivity.this,thirdActivity.class);
                startActivity(intent);

                fourthActivity.score=fourthActivity.score+1;
            }
        });

        butwater.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(seventhActivity.this,thirdActivity.class);
                startActivity(intent);

            }
        });

        butmoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(seventhActivity.this,thirdActivity.class);
                startActivity(intent);
            }
        });

    }
}
