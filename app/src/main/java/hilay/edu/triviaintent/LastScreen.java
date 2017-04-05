package hilay.edu.triviaintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LastScreen extends AppCompatActivity implements View.OnClickListener {

    int score;
    TextView tvPoints, tvGood;
    Button btnAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_screen);

        score = Integer.valueOf(getIntent().getStringExtra(ThirdQuestion.EXTRA_SCORE_3));

        btnAgain = (Button) findViewById(R.id.btnAgain);
        btnAgain.setOnClickListener(this);
        tvPoints = (TextView) findViewById(R.id.tvPoints);
        if (score == 1)
            tvPoints.setText("You finished with " + score + " point!");
        else
            tvPoints.setText("You finished with " + score + " points!");

        tvGood = (TextView) findViewById(R.id.tvGood);
        if (score == 3)
            tvGood.setText("Excellent!");
        else
            tvGood.setText("You can get better");
    }

    @Override
    public void onClick(View v) {
        Intent again = new Intent(this, MainActivity.class);
        startActivity(again);
    }
}
