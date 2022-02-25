package myexception;

import java.io.IOException;

public class CheckedException extends IOException {
    public CheckedException(String message, Throwable cause){
        super(message, cause);
    }

}
