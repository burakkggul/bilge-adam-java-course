package myexception;

public class ThrowIO {

    public void burcu() throws CheckedException {
        throw new CheckedException("hata",new Throwable());
    }
}
