package tr.com.burakgul.androidhandbook.service;

import lombok.RequiredArgsConstructor;
import tr.com.burakgul.androidhandbook.databinding.ActivityDetailsBinding;
import tr.com.burakgul.androidhandbook.model.Concept;

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
