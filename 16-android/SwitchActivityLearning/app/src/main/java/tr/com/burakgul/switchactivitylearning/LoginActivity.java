package tr.com.burakgul.switchactivitylearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import tr.com.burakgul.switchactivitylearning.service.AuthService;

public class LoginActivity extends AppCompatActivity {

    private AuthService authService;

    private EditText usernameEditText;

    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_login);
        this.authService = new AuthService();
        this.usernameEditText = super.findViewById(R.id.username);
        this.passwordEditText = super.findViewById(R.id.password);
    }

    public void login(View view){
        String username = this.usernameEditText.getText().toString();
        String password = this.passwordEditText.getText().toString();
        if(this.authService.isLoginSuccess(username,password)){
            Intent intent = new Intent(super.getApplicationContext(),WelcomeActivity.class);
            intent.putExtra("user", authService.getUser());
            super.startActivity(intent);
        }
    }
}