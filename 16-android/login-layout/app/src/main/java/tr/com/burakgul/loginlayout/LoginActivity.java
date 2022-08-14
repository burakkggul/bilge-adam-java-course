package tr.com.burakgul.loginlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_calculator);
        System.out.println("Aktivite oluşturuluyor.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Aktivite başlıyor.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Aktivite devam ettiriliyor.");
    }

    @Override
    protected void onPause(){
        super.onPause();
        System.out.println("Aktivite durduruldu.");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        System.out.println("Aktivite yok edildi.");
    }
}