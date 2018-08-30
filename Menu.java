package akshaysathiya.riddlemethis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    Button button1, button2, button3, button4;

    @Override
    public void onBackPressed(){
        Intent myIntent = new Intent(Menu.this, MainActivity.class);
        startActivity(myIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu);
        button1 = (Button) findViewById(R.id.button_fs);
        button1.setText("PLAY");
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId() == R.id.button_fs) {
                    Intent myIntent = new Intent(Menu.this, Level1.class);
                    startActivity(myIntent);
                }
            }
        });

        button2 = (Button) findViewById(R.id.button);
        button2.setText("CREDITS");
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId() == R.id.button) {
                    Intent myIntent = new Intent(Menu.this, Credits.class);
                    startActivity(myIntent);
                }
            }
        });

        button4 = (Button) findViewById(R.id.buttonhtp);
        button4.setText("HOW TO PLAY");
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId() == R.id.buttonhtp) {
                    Intent myIntent = new Intent(Menu.this, HowToPlay.class);
                    startActivity(myIntent);
                }
            }
        });
    }
}
