package myexception2;

public class UncheckedException extends ArrayIndexOutOfBoundsException{
    public UncheckedException(int index){
        super(index);
    }
}
