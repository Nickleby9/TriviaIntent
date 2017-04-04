package hilay.edu.triviaintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNext = (Button) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent toNextIntent = new Intent(this,FirstQuestion.class);
        startActivity(toNextIntent);
    }
}
