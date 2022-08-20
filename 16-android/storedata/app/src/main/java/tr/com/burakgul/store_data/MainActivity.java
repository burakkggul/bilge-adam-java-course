package tr.com.burakgul.store_data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText ageInput;
    private TextView ageTextView;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.ageInput = super.findViewById(R.id.ageInput);

        this.sharedPreferences = this.getSharedPreferences("tr.com.burakgul.store_data", Context.MODE_PRIVATE);

        int storedAge = this.sharedPreferences.getInt("storedAge",0);

        this.ageTextView = super.findViewById(R.id.ageTextView);

        this.ageTextView.setText("Girilen Yaş: "+storedAge);


       /* // Ekleme
        sharedPreferences.edit().putInt("storedAge",5).apply();

        //Güncelleme
        //sharedPreferences.edit().putInt("storedAge",6).apply();

        //Silme
        //sharedPreferences.edit().remove("storedAge").apply();

        //Getir
        int a = sharedPreferences.getInt("storedAge",0);

        System.out.println(a);*/
    }

    public void save(View view){
        int age = Integer.parseInt(this.ageInput.getText().toString());
        this.ageTextView.setText("Girilen Yaş: " + age);
        this.sharedPreferences.edit().putInt("storedAge",age).apply();
    }

    public void remove(View view){
        this.ageTextView.setText("Girilen Yaş: "+ 0);
        this.sharedPreferences.edit().remove("storedAge").apply();
    }
}