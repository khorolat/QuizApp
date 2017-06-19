package buildguide.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class sixthActivity extends AppCompatActivity {
    Button butmicro,butscuba,butsymantec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        butmicro = (Button)findViewById(R.id.butmicro);
        butscuba = (Button)findViewById(R.id.butscuba);
        butsymantec = (Button)findViewById(R.id.butsymantec);

        butmicro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(sixthActivity.this,seventhActivity.class);
                startActivity(intent);

            }
        });

        butscuba.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(sixthActivity.this,seventhActivity.class);
                startActivity(intent);
                fourthActivity.score=fourthActivity.score+1;

            }
        });

        butsymantec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(sixthActivity.this,seventhActivity.class);
                startActivity(intent);
            }
        });

    }
}
