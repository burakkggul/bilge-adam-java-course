package tr.com.burakgul.androidthread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Handler handler;
    private Runnable runnable;
    private int number = 0;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.textView = super.findViewById(R.id.textView);
        this.runnable = new Runnable() {
            @Override
            public void run() {
                MainActivity.this.textView.setText("Time: " + number);
                number++;
                handler.postDelayed(runnable,1000);
            }
        };
        this.handler = new Handler();
    }

    public void start(View view){
        handler.post(runnable);
    }

    public void stop(View view){
        this.handler.removeCallbacks(this.runnable);
        number = 0;
        textView.setText("Time: " + number);
        Toast.makeText(this,"Sayaç bitti.",Toast.LENGTH_LONG).show();
    }
}