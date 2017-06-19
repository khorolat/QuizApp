package buildguide.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class twelveActivity extends AppCompatActivity {
    Button but1950,but1939,but1945;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelve);

        but1950 = (Button)findViewById(R.id.but1950);
        but1939 = (Button)findViewById(R.id.but1939);
        but1945 = (Button)findViewById(R.id.but1945);

        but1950.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(twelveActivity.this,thirteenActivity.class);
                startActivity(intent);

            }
        });

        but1945.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(twelveActivity.this,thirteenActivity.class);
                startActivity(intent);

            }
        });

        but1939.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(twelveActivity.this,thirteenActivity.class);
                startActivity(intent);

                fourthActivity.score=fourthActivity.score+1;
            }
        });

    }
}

