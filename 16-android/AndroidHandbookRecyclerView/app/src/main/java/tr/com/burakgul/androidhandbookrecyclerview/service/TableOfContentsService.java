package tr.com.burakgul.androidhandbookrecyclerview.service;

import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import tr.com.burakgul.androidhandbookrecyclerview.R;
import tr.com.burakgul.androidhandbookrecyclerview.adapter.HandbookAdapter;
import tr.com.burakgul.androidhandbookrecyclerview.databinding.ActivityTableOfContentsBinding;
import tr.com.burakgul.androidhandbookrecyclerview.model.Concept;
import tr.com.burakgul.androidhandbookrecyclerview.util.ContextUtil;

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

    public void prepareAdapter() {
        HandbookAdapter handbookAdapter = new HandbookAdapter(this.concepts);
        this.activityTableOfContentsBinding.androidHandbookList.setAdapter(handbookAdapter);
        this.activityTableOfContentsBinding.androidHandbookList
                .setLayoutManager(new LinearLayoutManager(ContextUtil.getContextFromBinding(this.activityTableOfContentsBinding)));
    }
}
