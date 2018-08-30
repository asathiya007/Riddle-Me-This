package akshaysathiya.riddlemethis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Level9 extends AppCompatActivity {

    Button myButton;

    @Override
    public void onBackPressed(){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.level9);
        Toast myToast = Toast.makeText(getApplicationContext(), "Answer is correct. Well done!", Toast.LENGTH_LONG);
        myToast.show();

        myButton = (Button) findViewById(R.id.button2);
        myButton.setText("GUESS!");
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId() == R.id.button2) {
                    EditText e = (EditText) findViewById(R.id.TF1);
                    String str = e.getText().toString();

                    if(str.contains("silence") || str.contains("Silence") || str.contains("SILENCE")) {
                        if(str.contains("no") == false && str.contains("not") == false && str.contains("isn't") == false && str.contains("cannot") == false) {
                            Intent myIntent = new Intent(Level9.this, Level10.class);
                            startActivity(myIntent);
                        }
                        else {
                            Toast myToast = Toast.makeText(getApplicationContext(), "Answer is incorrect. Try again!", Toast.LENGTH_LONG);
                            myToast.show();
                        }
                    }
                    else {
                        Toast myToast = Toast.makeText(getApplicationContext(), "Answer is incorrect. Try again!", Toast.LENGTH_LONG);
                        myToast.show();
                    }
                }
            }
        });
    }
}
