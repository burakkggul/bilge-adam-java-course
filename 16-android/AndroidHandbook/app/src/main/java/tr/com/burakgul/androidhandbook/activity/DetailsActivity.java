package tr.com.burakgul.androidhandbook.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import tr.com.burakgul.androidhandbook.databinding.ActivityDetailsBinding;
import tr.com.burakgul.androidhandbook.service.DetailsService;

public class DetailsActivity extends AppCompatActivity {

    private DetailsService detailsService;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        ActivityDetailsBinding binding = ActivityDetailsBinding.inflate(super.getLayoutInflater());
        super.setContentView(binding.getRoot());
        this.detailsService = new DetailsService(binding);
    }
}
