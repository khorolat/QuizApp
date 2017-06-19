package buildguide.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class twentyoneActivity extends AppCompatActivity {
    Button butplayagain;
    Button butnewgame;

    TextView textscore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twentyone);

        textscore = (TextView)findViewById(R.id.textscore);
        double highest =5;
        double score =(fourthActivity.score);
        double percentage =score/highest*100;
        textscore.setText(percentage+"%");
        butplayagain=(Button)findViewById(R.id.butplayagain);
        butnewgame=(Button)findViewById(R.id.butnewgame);


        fourthActivity.score=0;

        butplayagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(twentyoneActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        butnewgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(twentyoneActivity.this,eightActivity.class);
                startActivity(intent);

            }
        });




    }
}

