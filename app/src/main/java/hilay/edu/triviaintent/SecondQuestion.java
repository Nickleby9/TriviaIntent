package hilay.edu.triviaintent;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondQuestion extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_SCORE_2 = "userScore2";
    Button btnFirstAnswer, btnSecondAnswer, btnThirdAnswer, btnForthAnswer, btnNext;
    int score = 0;
    boolean clicked = false;
    TextView tvScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_question);

        score = Integer.valueOf(getIntent().getStringExtra(FirstQuestion.EXTRA_SCORE_1));

        btnFirstAnswer = (Button) findViewById(R.id.btnFirstAnswer);
        btnSecondAnswer = (Button) findViewById(R.id.btnSecondAnswer);
        btnThirdAnswer = (Button) findViewById(R.id.btnThirdAnswer);
        btnForthAnswer = (Button) findViewById(R.id.btnForthAnswer);
        btnNext = (Button) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(this);
        tvScore = (TextView) findViewById(R.id.tvScore);
        tvScore.setText("Score: " + score);

        btnFirstAnswer.setOnClickListener(this);
        btnSecondAnswer.setOnClickListener(this);
        btnThirdAnswer.setOnClickListener(this);
        btnForthAnswer.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnFirstAnswer:
                btnFirstAnswer.setBackgroundColor(Color.GREEN);
                btnFirstAnswer.setEnabled(false);
                btnSecondAnswer.setEnabled(false);
                btnThirdAnswer.setEnabled(false);
                btnForthAnswer.setEnabled(false);
                score += 1;
                tvScore.setText("Score: " + score);
                clicked = true;
                break;
            case R.id.btnSecondAnswer:
                btnFirstAnswer.setEnabled(false);
                btnFirstAnswer.setBackgroundColor(Color.GREEN);
                btnSecondAnswer.setBackgroundColor(Color.RED);
                btnSecondAnswer.setEnabled(false);
                btnThirdAnswer.setEnabled(false);
                btnForthAnswer.setEnabled(false);
                clicked = true;
                break;
            case R.id.btnThirdAnswer:
                btnFirstAnswer.setEnabled(false);
                btnFirstAnswer.setBackgroundColor(Color.GREEN);
                btnSecondAnswer.setEnabled(false);
                btnThirdAnswer.setBackgroundColor(Color.RED);
                btnThirdAnswer.setEnabled(false);
                btnForthAnswer.setEnabled(false);
                clicked = true;
                break;
            case R.id.btnForthAnswer:
                btnFirstAnswer.setEnabled(false);
                btnFirstAnswer.setBackgroundColor(Color.GREEN);
                btnThirdAnswer.setEnabled(false);
                btnSecondAnswer.setEnabled(false);
                btnForthAnswer.setBackgroundColor(Color.RED);
                btnForthAnswer.setEnabled(false);
                clicked = true;
                break;
            case R.id.btnNext:
                if (clicked) {
                    Intent nextScreen = new Intent(this, ThirdQuestion.class);
                    String sc = String.valueOf(score);
                    nextScreen.putExtra(EXTRA_SCORE_2, sc);
                    startActivity(nextScreen);
                }
                break;
        }
    }
}
