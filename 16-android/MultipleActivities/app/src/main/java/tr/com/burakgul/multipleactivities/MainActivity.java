package tr.com.burakgul.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        Intent intent = super.getIntent();
        System.out.println(intent.getCategories());
    }

    public void changeActivity(View view){
        Intent intent = new Intent(super.getApplicationContext(),SecondActivity.class);
        super.startActivity(intent);
    }
}