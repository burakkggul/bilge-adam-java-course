package tr.com.burakgul.androidhandbookrecyclerview.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import tr.com.burakgul.androidhandbookrecyclerview.databinding.ActivityTableOfContentsBinding;
import tr.com.burakgul.androidhandbookrecyclerview.service.TableOfContentsService;

public class TableOfContentsActivity extends AppCompatActivity {

    private TableOfContentsService tableOfContentsService;


    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityTableOfContentsBinding activityTableOfContentsBinding = ActivityTableOfContentsBinding.inflate(super.getLayoutInflater());
        super.setContentView(activityTableOfContentsBinding.getRoot());

        this.tableOfContentsService = new TableOfContentsService(activityTableOfContentsBinding);

        this.tableOfContentsService.prepareConcepts();

        this.tableOfContentsService.prepareAdapter();
    }
}