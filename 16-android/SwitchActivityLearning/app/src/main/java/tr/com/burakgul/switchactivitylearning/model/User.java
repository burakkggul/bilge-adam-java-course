package tr.com.burakgul.switchactivitylearning.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User implements Serializable {
    private String firstname;
    private String lastname;
    private String username;
    private String password;

    public String getFullName(){
        return this.firstname + " " + this.lastname;
    }
}
