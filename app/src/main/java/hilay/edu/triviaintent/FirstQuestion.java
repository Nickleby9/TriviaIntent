package hilay.edu.triviaintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstQuestion extends AppCompatActivity implements View.OnClickListener {

    Button btnFirstAnswer, btnSecondAnswer, btnThirdAnswer, btnForthAnswer, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);

        btnFirstAnswer = (Button) findViewById(R.id.btnFirstAnswer);
        btnSecondAnswer = (Button) findViewById(R.id.btnSecondAnswer);
        btnThirdAnswer = (Button) findViewById(R.id.btnThirdAnswer);
        btnForthAnswer = (Button) findViewById(R.id.btnForthAnswer);

        btnFirstAnswer.setOnClickListener(this);
        btnSecondAnswer.setOnClickListener(this);
        btnThirdAnswer.setOnClickListener(this);
        btnForthAnswer.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String btnId = String.valueOf(v.getId());
        switch (btnId){
            case "btnFirstAnswer":

                break;
            case "btnSecondAnswer":

                break;
            case "btnThirdAnswer":

                break;
            case "btnForthAnswer":

                break;
            case "btnNext":

                break;
        }
    }
}
