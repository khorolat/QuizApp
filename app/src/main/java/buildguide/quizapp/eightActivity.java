package buildguide.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class eightActivity extends AppCompatActivity {
    Button butmichael,butstevie,butchris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);

        butstevie = (Button)findViewById(R.id.butstevie);
        butmichael = (Button)findViewById(R.id.butmichael);
        butchris = (Button)findViewById(R.id.butchris);

        butstevie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(eightActivity.this,tenthActivity.class);
                startActivity(intent);

            }
        });

        butmichael.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(eightActivity.this,tenthActivity.class);
                startActivity(intent);

                fourthActivity.score=fourthActivity.score+1;

            }
        });

        butchris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(eightActivity.this,tenthActivity.class);
                startActivity(intent);
            }
        });

    }
}
