package buildguide.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class fourthActivity extends AppCompatActivity {
    Button but2005,but2006,but2007;
    public static int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        but2005 = (Button)findViewById(R.id.but2005);
        but2006 = (Button)findViewById(R.id.but2006);
        but2007 = (Button)findViewById(R.id.but2007);

        but2007.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(fourthActivity.this,fifthActivity.class);
                startActivity(intent);

                fourthActivity.score=fourthActivity.score+1;

            }
        });

        but2006.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(fourthActivity.this,fifthActivity.class);
                startActivity(intent);

            }
        });

        but2005.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(fourthActivity.this,fifthActivity.class);
                startActivity(intent);
            }
        });

    }
}