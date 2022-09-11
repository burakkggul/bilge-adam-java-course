package tr.com.burakgul.androidhandbook.service;

import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import tr.com.burakgul.androidhandbook.R;
import tr.com.burakgul.androidhandbook.activity.DetailsActivity;
import tr.com.burakgul.androidhandbook.databinding.ActivityTableOfContentsBinding;
import tr.com.burakgul.androidhandbook.model.Concept;
import tr.com.burakgul.androidhandbook.util.ContextUtil;

@Getter
@RequiredArgsConstructor
public class TableOfContentsService {

    private final ActivityTableOfContentsBinding activityTableOfContentsBinding;

    private final List<Concept> concepts = new ArrayList<>();

    public void prepareConcepts() {
        Concept countDownTimer = new Concept("Count Down Timer",
                R.drawable.countdowntimer,
                "Bir countdown timer bu şekilde yazılabilir.");

        Concept mockConcept2 = new Concept("Count Down Timer2",
                R.drawable.countdowntimer,
                "Bir countdown timer bu şekilde yazılabilir. 2");
        Concept mockConcept3 = new Concept("Count Down Timer3",
                R.drawable.countdowntimer,
                "Bir countdown timer bu şekilde yazılabilir. 3");

        Concept mockConcept4 = new Concept("Count Down Timer4",
                R.drawable.countdowntimer,
                "Bir countdown timer bu şekilde yazılabilir. 4");

        Concept mockConcept5 = new Concept("Count Down Timer5",
                R.drawable.countdowntimer,
                "Bir countdown timer bu şekilde yazılabilir. 5");

        this.concepts.add(countDownTimer);
        this.concepts.add(mockConcept2);
        this.concepts.add(mockConcept3);
        this.concepts.add(mockConcept4);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
        this.concepts.add(mockConcept5);
    }

    public void prepareListViewAdapter(){
        ArrayAdapter<Concept> arrayAdapter =
                new ArrayAdapter<>(activityTableOfContentsBinding.getRoot().getContext(),
                        R.layout.simple_list_item,
                        this.concepts);
        System.out.println(this.concepts.get(0).toString());
        activityTableOfContentsBinding.androidHandbookList.setAdapter(arrayAdapter);
    }

    public void addListViewItemOnClickListener(){

        AdapterView.OnItemClickListener onItemClickListener = (parent, view, position, id) -> {
            Intent intent = new Intent(ContextUtil
                    .getContextFromBinding(this.activityTableOfContentsBinding), DetailsActivity.class);
            intent.putExtra("concept", this.concepts.get(position));
            ContextUtil.startActivityFromBinding(activityTableOfContentsBinding,intent);
        };

        this.activityTableOfContentsBinding
                .androidHandbookList.setOnItemClickListener(onItemClickListener);
    }
}
