package buildguide.quizapp;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;

public class tenthActivity extends AppCompatActivity {
    Button butwu,butgu,buttaylor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);

        butwu = (Button)findViewById(R.id.butwu);
        butgu = (Button)findViewById(R.id.butgu);
        buttaylor = (Button)findViewById(R.id.buttaylor);

        butwu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(tenthActivity.this,elevenActivity.class);
                startActivity(intent);

            }
        });

        butgu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(tenthActivity.this,elevenActivity.class);
                startActivity(intent);

                fourthActivity.score=fourthActivity.score+1;;

            }
        });

        buttaylor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(tenthActivity.this,elevenActivity.class);
                startActivity(intent);
            }
        });

    }
}
