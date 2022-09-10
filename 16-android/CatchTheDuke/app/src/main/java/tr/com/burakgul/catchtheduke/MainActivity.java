package tr.com.burakgul.catchtheduke;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView remainingTimeText;
    private TextView scoreText;

    private ImageView duke00;
    private ImageView duke01;
    private ImageView duke02;
    private ImageView duke10;
    private ImageView duke11;
    private ImageView duke12;
    private ImageView duke20;
    private ImageView duke21;
    private ImageView duke22;

    private ImageView[] imageViews;

    private int score = 0;

    private Handler handler;

    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.remainingTimeText = super.findViewById(R.id.remainingTime);
        this.scoreText = super.findViewById(R.id.scoreText);

        this.duke00 = super.findViewById(R.id.duke00);
        this.duke01 = super.findViewById(R.id.duke01);
        this.duke02 = super.findViewById(R.id.duke02);
        this.duke10 = super.findViewById(R.id.duke10);
        this.duke11 = super.findViewById(R.id.duke11);
        this.duke12 = super.findViewById(R.id.duke12);
        this.duke20 = super.findViewById(R.id.duke20);
        this.duke21 = super.findViewById(R.id.duke21);
        this.duke22 = super.findViewById(R.id.duke22);

        this.imageViews = new ImageView[]{this.duke00,this.duke01, this.duke02, this.duke10,this.duke11,this.duke12,this.duke20,this.duke21,this.duke22};

        this.hideImages();

        new CountDownTimer(10000,1000){

            @Override
            public void onTick(long millisUntilFinished) {
                MainActivity.this.remainingTimeText.setText("Remaining Time: " + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
                MainActivity.this.handler.removeCallbacks(MainActivity.this.runnable);
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("Game Over");
                alert.setMessage("Gamer Over.\nScore: "+ MainActivity.this.score);
                MainActivity.this.score = 0;
                MainActivity.this.scoreText.setText("Score: "+ score);
                alert.setPositiveButton("Ok", (dialog, which) -> {
                   handler.post(MainActivity.this.runnable);
                   this.start();
                });
                AlertDialog dialog = alert.show();
                // Dialogun içerisindeki mesajı ortalayabilmek için yaptık.
                TextView messageView = dialog.findViewById(android.R.id.message);
                messageView.setGravity(Gravity.CENTER);
            }
        }.start();
    }

    private void hideImages(){
        this.handler = new Handler();

        this.runnable = () -> {
            for(ImageView imageView : this.imageViews){
                imageView.setVisibility(View.INVISIBLE);
            }
            int index = new Random().nextInt(9);
            this.imageViews[index].setVisibility(View.VISIBLE);
            this.handler.postDelayed(this.runnable,1000);
        };

        handler.post(this.runnable);
    }

    public void increaseScore(View view){
        this.scoreText.setText("Score: "+ ++this.score);
    }
}