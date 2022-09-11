package tr.com.burakgul.androidhandbookrecyclerview.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import tr.com.burakgul.androidhandbookrecyclerview.databinding.ActivityDetailsBinding;
import tr.com.burakgul.androidhandbookrecyclerview.model.Concept;
import tr.com.burakgul.androidhandbookrecyclerview.service.DetailsService;

public class DetailsActivity extends AppCompatActivity {

    private DetailsService detailsService;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityDetailsBinding binding = ActivityDetailsBinding.inflate(super.getLayoutInflater());
        super.setContentView(binding.getRoot());
        this.detailsService = new DetailsService(binding, (Concept) super.getIntent().getSerializableExtra("concept"));
        this.detailsService.initializeContent();
    }
}
