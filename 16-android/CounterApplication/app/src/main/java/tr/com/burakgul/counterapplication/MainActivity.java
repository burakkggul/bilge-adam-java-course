package tr.com.burakgul.counterapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textView = super.findViewById(R.id.counter);

        CountDownTimer countDownTimer = new CountDownTimer(10000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                MainActivity.this.textView.setText("Kalan Süre: " + millisUntilFinished /  1000);
            }

            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this,"Sayaç sonlandı.", Toast.LENGTH_LONG).show();
            }
        };

        countDownTimer.start();
    }
}