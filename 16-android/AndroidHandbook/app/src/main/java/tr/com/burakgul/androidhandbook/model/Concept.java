package tr.com.burakgul.androidhandbook.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Concept implements Serializable {
    private String title;
    private int image;
    private String description;

    @Override
    public String toString(){
        return title;
    }
}
