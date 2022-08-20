package tr.com.burakgul.alert_message;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AlertDialog.Builder alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Aktivite başlatıldı.",Toast.LENGTH_LONG).show();
    }

    public void alert(View view){
        this.alert = new AlertDialog.Builder(this);
        alert.setTitle("Uyarı!");
        alert.setMessage("Emin misiniz?");
        alert.setPositiveButton("Evet", (dialog, which) -> {
            Toast.makeText(this,"Evet dediniz.",Toast.LENGTH_LONG).show();
        });
        alert.setNegativeButton("Hayır.",(dialog,which) -> {
            Toast.makeText(this,"Hayır dediniz.",Toast.LENGTH_LONG).show();
        });
    }

    public void alertShow(View view){
        try {
            this.alert.show();
        }catch (NullPointerException exception){
            Toast.makeText(this,"Önce uyarıyı hazırla.",Toast.LENGTH_LONG).show();
        }
    }
}