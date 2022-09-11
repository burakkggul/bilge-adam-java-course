package tr.com.burakgul.androidhandbook.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Concept {
    private String title;
    private int image;
    private String description;

    @Override
    public String toString(){
        return title;
    }
}
