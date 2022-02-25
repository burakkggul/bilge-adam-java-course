import myexception.CheckedException;
import myexception.ThrowIO;

public class Main {
    public static void main(String[] args) {
        ThrowIO throwIO = new ThrowIO();
        try {
            throwIO.burcu();
        } catch (CheckedException e) {
            e.printStackTrace();
        }
    }
}
