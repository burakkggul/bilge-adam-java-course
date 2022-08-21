package tr.com.burakgul.switchactivitylearning;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import tr.com.burakgul.switchactivitylearning.model.User;

public class WelcomeActivity extends AppCompatActivity {

    private TextView welcomeTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_welcome);
        this.welcomeTextView = super.findViewById(R.id.welcomeText);
        Intent intent = super.getIntent();
        User user = (User) intent.getSerializableExtra("user");
        this.welcomeTextView.setText("Hoş Geldiniz "+ user.getFullName()+".");
    }
}
