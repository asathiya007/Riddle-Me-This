package akshaysathiya.riddlemethis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Congrats extends AppCompatActivity {

    Button myButton;

    @Override
    public void onBackPressed(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_congrats);
        Toast myToast = Toast.makeText(getApplicationContext(), "Success!", Toast.LENGTH_LONG);
        myToast.show();
        myButton = (Button) findViewById(R.id.button3);
        myButton.setText("PLAY AGAIN!");
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Congrats.this, Menu.class);
                startActivity(myIntent);
            }
        });
    }
}
