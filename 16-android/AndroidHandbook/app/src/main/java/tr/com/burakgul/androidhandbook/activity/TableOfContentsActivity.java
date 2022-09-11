package tr.com.burakgul.androidhandbook.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import tr.com.burakgul.androidhandbook.databinding.ActivityTableOfContentsBinding;
import tr.com.burakgul.androidhandbook.service.TableOfContentsService;

public class TableOfContentsActivity extends AppCompatActivity {

    private TableOfContentsService tableOfContentsService;


    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        ActivityTableOfContentsBinding activityTableOfContentsBinding = ActivityTableOfContentsBinding.inflate(super.getLayoutInflater());
        super.setContentView(activityTableOfContentsBinding.getRoot());

        this.tableOfContentsService = new TableOfContentsService(activityTableOfContentsBinding);

        this.tableOfContentsService.prepareConcepts();

        this.tableOfContentsService.prepareListViewAdapter();

        this.tableOfContentsService.addListViewItemOnClickListener();
    }



    /*private TextView textView;*//*

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        *//*ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate(super.getLayoutInflater());
        View view = activityMainBinding.getRoot();
        super.setContentView(view);*//*

        // Bu kısma artık gerek yok.
        *//*this.textView = super.findViewById(R.id.textView1);
        this.textView.setText("şllsajkdjkl");*//*

        *//*activityMainBinding.textView1.setText("Deneme");
        activityMainBinding.textView2.setText("Deneme");*//*

        ActivityTableOfContentsBinding binding = ActivityTableOfContentsBinding.inflate(super.getLayoutInflater());
    }*/
}