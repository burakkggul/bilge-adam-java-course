package tr.com.burakgul.androidhandbookrecyclerview.service;

import lombok.RequiredArgsConstructor;
import tr.com.burakgul.androidhandbookrecyclerview.model.Concept;
import tr.com.burakgul.androidhandbookrecyclerview.databinding.ActivityDetailsBinding;

@RequiredArgsConstructor
public class DetailsService {

    private final ActivityDetailsBinding activityDetailsBinding;

    private final Concept concept;

    public void initializeContent() {
        this.activityDetailsBinding.titleTextView.setText(this.concept.getTitle());
        this.activityDetailsBinding.conceptImageView.setImageResource(this.concept.getImage());
        this.activityDetailsBinding.descriptionTextView.setText(this.concept.getDescription());
    }
}
