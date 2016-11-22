package hayuna.pl.androidsimpleclicker;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    TextView points;
    Button reset;
    ImageButton click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        points = (TextView) findViewById(R.id.textView2);
        click = (ImageButton) findViewById(R.id.imageButton);
        reset = (Button) findViewById(R.id.button4);

        points.setText(0 + "");
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pkt = Integer.parseInt(points.getText().toString());
                pkt++;
                points.setText(pkt + "");
                Toast.makeText(getApplicationContext(), points.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int zero = 0;
                points.setText(zero + "");
            }
        });
    }
}
