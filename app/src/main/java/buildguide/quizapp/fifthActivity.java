package buildguide.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class fifthActivity extends AppCompatActivity {
    Button butwhole,butworld,butwestern;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        butwhole = (Button)findViewById(R.id.butwhole);
        butworld = (Button)findViewById(R.id.butworld);
        butwestern = (Button)findViewById(R.id.butwestern);

        butwhole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(fifthActivity.this,sixthActivity.class);
                startActivity(intent);

            }
        });

        butworld.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(fifthActivity.this,sixthActivity.class);
                startActivity(intent);
                fourthActivity.score=fourthActivity.score+1;

            }
        });

        butwestern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(fifthActivity.this,sixthActivity.class);
                startActivity(intent);
            }
        });

    }
}