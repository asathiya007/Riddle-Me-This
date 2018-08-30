package akshaysathiya.riddlemethis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GameOver extends AppCompatActivity {

    Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        Toast myToast = Toast.makeText(getApplicationContext(), "Game Over!", Toast.LENGTH_LONG);
        myToast.show();
        myButton = (Button) findViewById(R.id.button3);
        myButton.setText("PLAY AGAIN!");
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(GameOver.this, Menu.class);
                startActivity(myIntent);
            }
        });
    }
}
