package tr.com.burakgul.switchactivitylearning.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import tr.com.burakgul.switchactivitylearning.model.User;

@RequiredArgsConstructor
@Getter
@Setter
public class AuthService {
    private User user = new User("Burak","GÜL","burak","burak123");

    public boolean isLoginSuccess(String username, String password){
        return this.user.getUsername().equals(username) && this.user.getPassword().equals(password);
    }


}
